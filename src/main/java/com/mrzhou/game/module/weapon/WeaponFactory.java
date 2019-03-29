package com.mrzhou.game.module.weapon;

public class WeaponFactory {
    public Weapon createWeapon(String type){
        Weapon weapon = null;
        if(type.equals("axe")){
            weapon = new Axe();
        }else if(type.equals("sword")){
            weapon = new Sword();
        }else if(type.equals("dagger")){
            weapon = new Dagger();
        };
        System.out.println("Create weapon"+type+" Success!");
        return weapon;
    }
}
