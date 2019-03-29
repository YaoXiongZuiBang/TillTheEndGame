package com.mrzhou.game.module.weapon;

import com.mrzhou.game.module.hero.Hero;

public class Dagger extends Weapon{
    public Dagger(){
        setWeaponAttack(10);
        setWeaponDefence(10);
        setWeaponEnger(20);
        setLevel(0);
    }

    @Override
    public void addAttribute(Hero hero) {

    }
}
