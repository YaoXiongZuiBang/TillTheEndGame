package com.mrzhou.game.module.skill;

import com.alibaba.fastjson.JSON;

/**
 * 类说明：技能工厂
 * 创建者：Zeros
 * 创建时间：2019-03-28 00:22
 * 包名：com.mrzhou.game.module.hero
 */

public class SkillFactory {

    public static Skill parseSkill(String type, String json){
        Skill skill = null;
        switch (type){
            case "boilBlood":
                skill = JSON.parseObject(json, WarriorBoilBloodSkill.class);
                break;
            case "madSword":
                skill = JSON.parseObject(json, WarriorMadSwordSkill.class);
                break;
            case "befall":
                skill = JSON.parseObject(json, KnightBefallSkill.class);
                break;
            case "guard":
                skill = JSON.parseObject(json, KnightGuardSkill.class);
                break;
            case "assassinate":
                skill = JSON.parseObject(json, ThiefAssassinateSkill.class);
                break;
            case "erosion":
                skill = JSON.parseObject(json, ThiefErosionSkill.class);
                break;
        }
        return skill;
    }
}
