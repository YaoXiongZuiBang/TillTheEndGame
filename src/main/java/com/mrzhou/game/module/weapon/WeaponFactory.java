package com.mrzhou.game.module.weapon;

import com.alibaba.fastjson.JSON;

/**
 * 类说明：武器工厂
 * 创建者：Zeros
 * 创建时间：2019-03-28 00:22
 * 包名：com.mrzhou.game.module.hero
 */
public class WeaponFactory {

    public Weapon createWeapon(String type){
        Weapon weapon = null;
        if(type.equals("axe")){
            weapon = new AxeWeapon();
        }else if(type.equals("sword")){
            weapon = new SwordWeapon();
        }else if(type.equals("dagger")){
            weapon = new DaggerWeapon();
        };
        System.out.println("Create weapon "+type+" Success!");
        return weapon;
    }


    public static Weapon parseWeapon(String type, String json){
        Weapon weapon = null;
        switch (type){
            case "axe":
                weapon = JSON.parseObject(json, AxeWeapon.class);
                break;
            case "sword":
                weapon = JSON.parseObject(json, SwordWeapon.class);
                break;
            case "dagger":
                weapon = JSON.parseObject(json, DaggerWeapon.class);
                break;
        }
        return weapon;
    }
}
