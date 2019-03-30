package com.mrzhou.game.module.equip;

public class FightMapEquip extends Equip {

    public FightMapEquip(){
        init();
        this.name = "战斗之图";
        this.img = "/img/equipment/equip_2.png";
    }

    @Override
    public void initBuffs() {
        Buff attackBuff = new AttackBuff();
        attackBuff.setStrength(new HighStrength());
        buffList.add(attackBuff);
    }

}
