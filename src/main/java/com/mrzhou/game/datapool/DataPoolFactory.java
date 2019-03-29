package com.mrzhou.game.datapool;

import com.mrzhou.game.util.ConstantsUtil;

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
        switch (type) {
            case ConstantsUtil.HERO_PART:
                dataPool = HeroDataPool.getInstance();
                break;
            case ConstantsUtil.WEAPON_PART:
                dataPool = WeaponDataPool.getInstance();
                break;
            case ConstantsUtil.EQUIP_PART:
                dataPool = EquipDataPool.getInstance();
                break;
            case ConstantsUtil.SKILL_PART:
                dataPool = SkillDataPool.getInstance();
                break;
        }
        System.out.println("Create " + type + " data pool Success!");
        return dataPool;
    }
}
