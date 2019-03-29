package com.mrzhou.game.datapool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mrzhou.game.module.hero.HeroFactory;
import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.util.FileUtil;

import java.util.Hashtable;
import java.util.Map;

/**
 * 类说明：角色类数据池
 * 创建者：Zeros
 * 创建时间：2019-03-21 00:14
 * 包名：com.mrzhou.game.datapool
 */

public class HeroDataPool extends DataPool{

    private Map<String, Map<Integer, JSONObject>> heroLevelPool;
    private Map<String, JSONObject> heroPool;

    private HeroDataPool(){
        heroPool = new Hashtable<>();
        heroLevelPool = new Hashtable<>();
        loadFile();
    }

    private static final class SingletonHeroDataPool{
        private static HeroDataPool pool = new HeroDataPool();

    }

    public static HeroDataPool getInstance(){
        return SingletonHeroDataPool.pool;
    }


    @Override
    public <T> T getData(String type, Integer level, Class<T> tClass) {
        if(heroPool.containsKey(type)) {
            JSONObject heroJson = heroPool.get(type);
            Map<Integer, JSONObject> levels = heroLevelPool.get(type);
            if(levels.containsKey(level)){
                JSONObject levelJson = levels.get(level);
                for (Map.Entry<String, Object> a : levelJson.entrySet()) {
                    heroJson.put(a.getKey(), a.getValue());
                }
                return (T) HeroFactory.parseHero(type, heroJson.toJSONString());
            }
        }
        return null;
    }

    private void loadFile(){
        JSONObject object = JSON.parseObject(FileUtil.readFile(ConstantsUtil.HERO_INFO_PATH));
        object.entrySet().forEach(a ->{
            Map<Integer, JSONObject> map = new Hashtable<>();
            JSONObject heroJson = (JSONObject) a.getValue();
            JSONObject levels = heroJson.getJSONObject(ConstantsUtil.LEVELS_KEY);
            heroJson.remove(ConstantsUtil.LEVELS_KEY);
            heroPool.put(a.getKey(), heroJson);
            levels.entrySet().forEach(b -> {
                JSONObject levelJson = (JSONObject) b.getValue();
                levelJson.put(ConstantsUtil.LEVEL_KEY, b.getKey());
                map.put(Integer.parseInt(b.getKey()), levelJson);
            });
            heroLevelPool.put(a.getKey(), map);
        });
    }

//    public static void main(String[] args) {
//        DataPool dataPool = DataPoolFactory.createDataPool(ConstantsUtil.HERO_PART);
//        Hero t = dataPool.getData("warrior", 1, Hero.class);
//    }
}
