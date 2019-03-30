package com.mrzhou.game.module.equip;

public class MagicStoneEquip extends Equip {
    public MagicStoneEquip(){
        init();
        this.name = "魔法石";
        this.img = "/img/equipment/equip_12.png";
    }

    @Override
    public void initBuffs() {
        Buff bloodBuff = new BloodBuff();
        bloodBuff.setStrength(new MidStrength());
        buffList.add(bloodBuff);

        Buff energyBuff = new EnergyBuff();
        energyBuff.setStrength(new HighStrength());
        buffList.add(energyBuff);
    }


}
