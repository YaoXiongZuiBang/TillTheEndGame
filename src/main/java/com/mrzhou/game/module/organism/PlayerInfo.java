package com.mrzhou.game.module.organism;

import com.alibaba.fastjson.JSON;
import com.mrzhou.game.datapool.DataPool;
import com.mrzhou.game.datapool.DataPoolFactory;
import com.mrzhou.game.module.equip.Bag;
import com.mrzhou.game.module.hero.Hero;
import com.mrzhou.game.module.skill.Skill;
import com.mrzhou.game.module.weapon.Weapon;
import com.mrzhou.game.util.ConstantsUtil;
import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类说明：玩家
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:45
 * 包名：com.mrzhou.design.game.module.player
 */

@Data
public class PlayerInfo {

    // 经验
    private int experience;

    // 等级
    private int level;

    // 金币
    private int money;

    // 角色类型
    private String heroType;

    private Hero hero;

    // 武器类型
    private String weaponType;

    private Weapon weapon;

    // 武器等级
    private Integer weaponLevel;

    // 装备包
    private Bag bag;

    // 技能等级
    private int[] skillLevels;

    private Skill[] skillList;

    public PlayerInfo(){

    }

    public PlayerInfo(Player instance) {
        DataPool heroPool = DataPoolFactory.createDataPool(ConstantsUtil.HERO_PART);
        DataPool weaponPool = DataPoolFactory.createDataPool(ConstantsUtil.WEAPON_PART);
        DataPool skillPool = DataPoolFactory.createDataPool(ConstantsUtil.SKILL_PART);
        this.experience = instance.getExperience();
        this.level = instance.getLevel();
        this.money = instance.getMoney();
        this.heroType = instance.getHeroType();
        this.hero = heroPool.getData(heroType, level, Hero.class);
        this.weaponType = instance.getWeaponType();
        this.weaponLevel = instance.getWeaponLevel();
        this.weapon = weaponPool.getData(weaponType, weaponLevel, Weapon.class);
        this.bag = instance.getBag();
        this.skillLevels = instance.getSkillLevels();
        this.skillList = new Skill[2];
        if(hero != null && skillLevels != null) {
            for(int i = 0; i<2; i++){
                Skill skill = skillPool.getData(hero.getSkills().get(i), skillLevels[i], Skill.class);
                skillList[i] = skill;
            }
        }
    }
}
