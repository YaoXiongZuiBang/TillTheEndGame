package com.mrzhou.game.datapool;

/**
 * 类说明：数据池工厂类
 * 创建者：Zeros
 * 创建时间：2019-03-21 00:15
 * 包名：com.mrzhou.game.datapool
 */

public class DataPoolFactory {

    /**
     * 数据池简单工厂
     * @param type
     * @return
     */
    public static DataPool createDataPool(String type){
        DataPool dataPool = null;
        if(type.equals("hero")){
            dataPool = HeroDataPool.getInstance();
        }else if(type.equals("weapon")){
            dataPool = WeaponDataPool.getInstance();
        }else if(type.equals("equipment")){
            dataPool = EquipDataPool.getInstance();
        }else if(type.equals("skill")){
            dataPool = SkillDataPool.getInstance();
        }
        System.out.println("Create "+type+" data pool Success!");
        return dataPool;
    }
}
