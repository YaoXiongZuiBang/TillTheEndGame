package com.mrzhou.game.module.equip;

public class BloodMapEquip extends Equip {

    public BloodMapEquip(){
        init();
        this.name = "鲜血之图";
        this.img = "/img/equipment/equip_2.png";
    }

    @Override
    public void initBuffs() {
        Buff bloodBuff = new BloodBuff();
        bloodBuff.setStrength(new HighStrength());
        buffList.add(bloodBuff);
    }

}
