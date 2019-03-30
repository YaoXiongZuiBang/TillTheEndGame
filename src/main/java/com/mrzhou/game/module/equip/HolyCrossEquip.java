package com.mrzhou.game.module.equip;

public class HolyCrossEquip extends Equip {
    public HolyCrossEquip(){
        init();
        this.name = "神圣十字";
        this.img = "/img/equipment/equip_7.png";
    }

    @Override
    public void initBuffs() {
        Buff defenceBuff = new DefenceBuff();
        defenceBuff.setStrength(new HighStrength());
        buffList.add(defenceBuff);

        Buff bloodBuff = new BloodBuff();
        bloodBuff.setStrength(new MidStrength());
        buffList.add(bloodBuff);
    }


}
