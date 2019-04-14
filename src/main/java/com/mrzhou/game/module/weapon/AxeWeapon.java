package com.mrzhou.game.module.weapon;


/**
 * 斧头类
 */
public class AxeWeapon extends Weapon{

    public AxeWeapon(){
        super();
    }

    @Override
    public Weapon attack() {
        System.out.println("斧头造成了" + this.getAttackPlus() + " 点伤害，增加了 "+ this.getDefencePlus() + " 点防御");
        return this;
//        hero.setAttack(hero.getAttack()+getWeaponAttack());
//        hero.setDefence(hero.getDefence()+getWeaponDefence());
//        hero.setEnergy(hero.getEnergy()+getWeaponEnger());
    }
}
