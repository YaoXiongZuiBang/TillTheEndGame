package com.mrzhou.game.datapool;


/**
 * 类说明：装备类数据池
 * 创建者：Zeros
 * 创建时间：2019-03-21 00:14
 * 包名：com.mrzhou.game.datapool
 */

public class EquipDataPool extends DataPool{

    private EquipDataPool(){}

    private static final class SingletonEqiupDataPool{
        private static EquipDataPool pool = new EquipDataPool();

    }

    public static EquipDataPool getInstance(){
        return SingletonEqiupDataPool.pool;
    }


    @Override
    public <T> T getData(String type, Integer id, Class<T> tClass) {
        return null;
    }
}
