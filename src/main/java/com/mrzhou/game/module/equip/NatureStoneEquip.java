package com.mrzhou.game.module.equip;

public class NatureStoneEquip extends Equip {

    public NatureStoneEquip(){
        init();
        this.name = "自然之石";
        this.img = "/img/equipment/equip_11.png";
    }

    @Override
    public void initBuffs() {
        Buff bloodBuff = new BloodBuff();
        bloodBuff.setStrength(new MidStrength());
        buffList.add(bloodBuff);

        Buff energyBuff = new EnergyBuff();
        energyBuff.setStrength(new LowStrength());
        buffList.add(energyBuff);
    }

}
