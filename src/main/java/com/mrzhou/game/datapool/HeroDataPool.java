package com.mrzhou.game.datapool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mrzhou.game.module.hero.Hero;
import com.mrzhou.game.module.hero.HeroFactory;
import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.util.FileUtil;

import java.util.Map;

/**
 * 类说明：角色类数据池
 * 创建者：Zeros
 * 创建时间：2019-03-21 00:14
 * 包名：com.mrzhou.game.datapool
 */

public class HeroDataPool extends DataPool{

    private Map<String, Map<Integer, Hero>> heroPool;

    private HeroDataPool(){

    }

    private static final class SingletonHeroDataPool{
        private static HeroDataPool pool = new HeroDataPool();

    }

    public static HeroDataPool getInstance(){
        return SingletonHeroDataPool.pool;
    }


    @Override
    public <T> Hero getData(String type, Integer level, Class<T> tClass) {
        Hero t = null;
        JSONObject object = JSON.parseObject(FileUtil.readFile(ConstantsUtil.HEROINFO_PATH));
        if (object != null && object.containsKey(type)){
            JSONObject heroJson = object.getJSONObject(type);
            JSONObject levels = heroJson.getJSONObject(ConstantsUtil.LEVELS_KEY);
            heroJson.remove(ConstantsUtil.LEVELS_KEY);
            if(levels.containsKey(""+level)){
                heroJson.put(ConstantsUtil.LEVEL_KEY, level);
                JSONObject levelJson = levels.getJSONObject(""+level);
                for (Map.Entry<String, Object> a : levelJson.entrySet()) {
                    heroJson.put(a.getKey(), a.getValue());
                }
                return HeroFactory.parseHero(type, heroJson.toJSONString());
            }
        }
        return null;
    }
}
