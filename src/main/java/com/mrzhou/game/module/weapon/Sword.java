package com.mrzhou.game.module.weapon;

import com.mrzhou.game.module.hero.Hero;

public class Sword extends Weapon{

    public Sword(){
        setWeaponAttack(10);
        setWeaponDefence(20);
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