package com.mrzhou.game.module.hero;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 类说明：角色工厂
 * 创建者：Zeros
 * 创建时间：2019-03-28 00:22
 * 包名：com.mrzhou.game.module.hero
 */

public class HeroFactory {
    public Hero createHero(String type){
        Hero hero = null;
        if(type.equals("warrior")){
           hero = new WarriorHero();
        }else if(type.equals("knight")){
            hero = new KnightHero();
        }else if(type.equals("thief")){
            hero = new ThiefHero();
        }
        System.out.println("Create Hero "+type+" Success!");
        return hero;
    }

    public static Hero parseHero(String type, String json){
        Hero hero = null;
        if(type.equals("warrior")){
            hero = JSON.parseObject(json, WarriorHero.class);
        }else if(type.equals("knight")){
            hero = JSON.parseObject(json, KnightHero.class);
        }else if(type.equals("thief")){
            hero = JSON.parseObject(json, ThiefHero.class);
        }
        return hero;
    }
}
