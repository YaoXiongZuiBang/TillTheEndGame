package com.mrzhou.game.module.equip;

public class StrengthBookEquip extends Equip {
    public StrengthBookEquip(){
        init();
        this.name = "力量之书";
        this.img = "/img/equipment/equip_3.png";
    }

    @Override
    public void initBuffs() {
        Buff attackBuff = new AttackBuff();
        attackBuff.setStrength(new HighStrength());
        buffList.add(attackBuff);

        Buff bloodBuff = new BloodBuff();
        bloodBuff.setStrength(new LowStrength());
        buffList.add(bloodBuff);
    }


}
