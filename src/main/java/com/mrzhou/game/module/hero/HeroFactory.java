package com.mrzhou.game.module.hero;

/**
 * 类说明：角色工厂
 * 创建者：Zeros
 * 创建时间：2019-03-28 00:22
 * 包名：com.mrzhou.game.module.hero
 */

public class HeroFactory {
    public Hero createHero(String type){
        Hero hero = null;
        if(type.equals("Warrior")){
           hero = new Warrior();
        }else if(type.equals("Knight")){
            hero = new Knight();
        }else if(type.equals("Thief")){
            hero = new Thief();
        }
        System.out.print("Create Hero Success!");
        return hero;
    }
}
