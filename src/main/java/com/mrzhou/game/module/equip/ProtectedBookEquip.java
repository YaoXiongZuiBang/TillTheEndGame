package com.mrzhou.game.module.equip;

public class ProtectedBookEquip extends Equip {
    public ProtectedBookEquip(){
        init();
        this.name = "守护之书";
        this.img = "/img/equipment/equip_5.png";
    }

    @Override
    public void initBuffs() {
        Buff defenceBuff = new DefenceBuff();
        defenceBuff.setStrength(new HighStrength());
        buffList.add(defenceBuff);

        Buff energyBuff = new EnergyBuff();
        energyBuff.setStrength(new LowStrength());
        buffList.add(energyBuff);
    }

}
