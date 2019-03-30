package com.mrzhou.game.module.equip;


/** 血灵石
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-30 05:00
 * 包名：com.mrzhou.game.module.equip
 */

public class BloodStoneEquip extends Equip{

    public BloodStoneEquip() {
        init();
        this.name = "血灵石";
        this.img = "/img/equipment/equip_9.png";
    }

    public void initBuffs() {
        Buff bloodBuff = new BloodBuff();
        bloodBuff.setStrength(new MidStrength());
        buffList.add(bloodBuff);

        Buff defenceBuff = new DefenceBuff();
        defenceBuff.setStrength(new LowStrength());
        buffList.add(defenceBuff);
    }

}
