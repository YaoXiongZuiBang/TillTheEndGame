package com.mrzhou.game.module.equip;

public class EnergyMapEquip extends Equip {
    public EnergyMapEquip(){
        init();
        this.name = "能量之图";
        this.img = "/img/equipment/equip_8.png";
    }

    @Override
    public void initBuffs() {
        Buff energyBuff = new EnergyBuff();
        energyBuff.setStrength(new HighStrength());
        buffList.add(energyBuff);
    }

}

