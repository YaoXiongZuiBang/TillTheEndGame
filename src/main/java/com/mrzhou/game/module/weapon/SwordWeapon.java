package com.mrzhou.game.module.weapon;


/**
 * 武器-骑士剑
 */
public class SwordWeapon extends Weapon{

    public SwordWeapon(){
        super();
    }

    @Override
    public Weapon attack() {
        System.out.println("骑士剑造成了" + this.getAttackPlus() + " 点伤害，增加了 "+ this.getDefencePlus() + " 点防御");
        return this;
    }
}