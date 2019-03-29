package com.mrzhou.game.datapool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mrzhou.game.module.skill.SkillFactory;
import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.util.FileUtil;

import java.util.Hashtable;
import java.util.Map;

/**
 * 类说明：技能类数据池
 * 创建者：Zeros
 * 创建时间：2019-03-21 00:14
 * 包名：com.mrzhou.game.datapool
 */

public class SkillDataPool extends DataPool{

    private Map<String, Map<Integer, JSONObject>> skillLevelPool;
    private Map<String, JSONObject> skillPool;

    private SkillDataPool(){
        skillPool = new Hashtable<>();
        skillLevelPool = new Hashtable<>();
        loadFile();
    }

    private static final class SingletonSkillDataPool{
        private static SkillDataPool pool = new SkillDataPool();

    }

    public static SkillDataPool getInstance(){
        return SingletonSkillDataPool.pool;
    }


    @Override
    public <T> T getData(String type, Integer level, Class<T> tClass) {
        if(skillPool.containsKey(type)) {
            JSONObject skillJson = skillPool.get(type);
            Map<Integer, JSONObject> levels = skillLevelPool.get(type);
            if(levels.containsKey(level)){
                JSONObject levelJson = levels.get(level);
                for (Map.Entry<String, Object> a : levelJson.entrySet()) {
                    skillJson.put(a.getKey(), a.getValue());
                }
                return (T) SkillFactory.parseSkill(type, skillJson.toJSONString());
            }
        }
        return null;
    }

    private void loadFile(){
        JSONObject object = JSON.parseObject(FileUtil.readFile(ConstantsUtil.SKILL_INFO_PATH));
        object.entrySet().forEach(a ->{
            Map<Integer, JSONObject> map = new Hashtable<>();
            JSONObject skillJson = (JSONObject) a.getValue();
            JSONObject levels = skillJson.getJSONObject(ConstantsUtil.LEVELS_KEY);
            skillJson.remove(ConstantsUtil.LEVELS_KEY);
            skillPool.put(a.getKey(), skillJson);
            levels.entrySet().forEach(b -> {
                JSONObject levelJson = (JSONObject) b.getValue();
                levelJson.put(ConstantsUtil.LEVEL_KEY, b.getKey());
                map.put(Integer.parseInt(b.getKey()), levelJson);
            });
            skillLevelPool.put(a.getKey(), map);
        });
    }

//    public static void main(String[] args) {
//        DataPool dataPool = DataPoolFactory.createDataPool(ConstantsUtil.SKILL_PART);
//        Skill t = dataPool.getData("boilBlood", 1, Skill.class);
//        System.out.println(t);
//    }
}
