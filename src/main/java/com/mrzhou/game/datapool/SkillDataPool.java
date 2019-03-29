package com.mrzhou.game.datapool;

/**
 * 类说明：技能类数据池
 * 创建者：Zeros
 * 创建时间：2019-03-21 00:14
 * 包名：com.mrzhou.game.datapool
 */

public class SkillDataPool extends DataPool{

    private SkillDataPool(){}

    private static final class SingletonSkillDataPool{
        private static SkillDataPool pool = new SkillDataPool();

    }

    public static SkillDataPool getInstance(){
        return SingletonSkillDataPool.pool;
    }


    @Override
    public <T> T getData(String type, Integer id, Class<T> tClass) {
        return null;
    }
}
