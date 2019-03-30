package com.mrzhou.game.module.equip;

public class BalanceStoneEquip extends Equip{
    public BalanceStoneEquip(){
        init();
        this.name = "平衡之石";
        this.img = "/img/equipment/equip_10.png";
    }

    @Override
    public void initBuffs() {
        Buff bloodBuff = new BloodBuff();
        bloodBuff.setStrength(new MidStrength());
        buffList.add(bloodBuff);

        Buff energyBuff = new EnergyBuff();
        energyBuff.setStrength(new MidStrength());
        buffList.add(energyBuff);

        Buff defenceBuff = new DefenceBuff();
        defenceBuff.setStrength(new MidStrength());
        buffList.add(defenceBuff);

        Buff attackBuff = new AttackBuff();
        attackBuff.setStrength(new MidStrength());
        buffList.add(attackBuff);
    }

}
