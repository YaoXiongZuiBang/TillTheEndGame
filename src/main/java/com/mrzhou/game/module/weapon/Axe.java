package com.mrzhou.game.module.weapon;

import com.mrzhou.game.module.hero.Hero;

public class Axe extends Weapon{

    public Axe(){
        setWeaponAttack(20);
        setWeaponDefence(10);
        setWeaponEnger(10);
        setLevel(0);
    }

    @Override
    public void addAttribute(Hero hero) {
        hero.setAttack(hero.getAttack()+getWeaponAttack());
        hero.setDefence(hero.getDefence()+getWeaponDefence());
        hero.setEnergy(hero.getEnergy()+getWeaponEnger());
    }
}
