package com.mrzhou.game.module.weapon;

/**
 * 武器-匕首
 */
public class DaggerWeapon extends Weapon{
    public DaggerWeapon(){
        super();
    }

    @Override
    public Weapon attack() {
        System.out.println("匕首造成了" + this.getAttackPlus() + " 点伤害，增加了 "+ this.getDefencePlus() + " 点防御");
        return this;
    }
}
