package com.mrzhou.game.module.equip;

public class WisdomBookEquip extends Equip{
    public WisdomBookEquip(){
        init();
        this.name = "智慧之书";
        this.img ="/img/equipment/equip_6.png";
    }

    public void initBuffs(){
        Buff bloodBuff = new BloodBuff();
        bloodBuff.setStrength(new LowStrength());
        buffList.add(bloodBuff);

        Buff energyBuff = new EnergyBuff();
        energyBuff.setStrength(new HighStrength());
        buffList.add(energyBuff);
    }

}
