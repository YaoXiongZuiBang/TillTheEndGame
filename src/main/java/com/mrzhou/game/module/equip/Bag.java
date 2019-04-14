package com.mrzhou.game.module.equip;


import com.mrzhou.game.module.player.PlayerState;
import com.mrzhou.game.util.ConstantsUtil;

/**
 * 类说明：背包
 * 创建者：Zeros
 * 创建时间：2019-03-30 04:51
 * 包名：com.mrzhou.game.module.equip
 */

public class Bag{
    private static Bag singletonBag = null;

    private Equip[] equipList;

    private int capacity;


    private Bag() {
        this.capacity = ConstantsUtil.BAG_CAPACITY;
        this.equipList = new Equip[capacity];
    }

    public static Bag getInstance(){
        if(singletonBag == null){
            singletonBag = new Bag();
        }
        return singletonBag;
    }

    public void addEquip(Integer index, Equip equip){
        if(index>0 && index<capacity){
            equipList[index] = equip;
        }
    }

    public PlayerState getState(){
        int blood = 0, energy = 0, attack = 0, defence = 0;
        for(Equip equip : equipList){
            if(equip != null){
                blood += equip.getBloodPlus();
                energy += equip.getEnergyPlus();
                attack += equip.getAttackPlus();
                defence += equip.getDefencePlus();
            }
        }
        return new PlayerState(blood, energy, attack, defence);
    }
}
