package com.mrzhou.game.module.organism;

import com.alibaba.fastjson.JSON;
import com.mrzhou.game.module.attribute.*;
import com.mrzhou.game.module.equip.Bag;
import com.mrzhou.game.module.equip.Equip;
import com.mrzhou.game.module.hero.Hero;
import com.mrzhou.game.module.player.PlayerState;
import lombok.Data;

/**
 * 类说明：玩家
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:45
 * 包名：com.mrzhou.design.game.module.player
 */

@Data
public class Player{
    private static Player singletonPlayer = null;

    // 经验
    private int experience;

    // 等级
    private int level;

    // 金币
    private int money;

    // 角色类型
    private String heroType;

    // 武器类型
    private String weaponType;

    // 武器等级
    private Integer weaponLevel;

    // 装备包
    private Bag bag;

    // 技能等级
    private int[] skillLevels;

    private Player(){
        this.experience = 0;
        this.level = 1;
        this.money = 0;
        this.weaponLevel = 1;
        this.bag = Bag.getInstance();
        this.skillLevels = new int[]{1, 1};
    }

    public static Player getInstance(){
        if(singletonPlayer == null){
            singletonPlayer = new Player();
        }
        return singletonPlayer;
    }

    public OrganismState obtainState() {
        //装饰者模式
        PlayerInfo playerInfo = obtainPlayerInfo();
        OrganismState state = new OrganismState();
        Attribute attribute = new BaseAttribute();
        HeroAttribute heroAttribute = new HeroAttribute(attribute, playerInfo.getHero());
        System.out.println(JSON.toJSONString(heroAttribute));
        WeaponAttribute weaponAttribute = new WeaponAttribute(heroAttribute, playerInfo.getWeapon());
        System.out.println(JSON.toJSONString(weaponAttribute));
        EquipAttribute equipAttribute = new EquipAttribute(weaponAttribute, playerInfo.getBag());
        state.setBlood(equipAttribute.obtainBlood());
        state.setEnergy(equipAttribute.obtainEnergy());
        state.setAttack(equipAttribute.obtainAttack());
        state.setDefence(equipAttribute.obtainDefence());
        System.out.println(JSON.toJSONString(state));
        return state;
    }

    public PlayerInfo obtainPlayerInfo(){
        return new PlayerInfo(getInstance());
    }

    public void init(PlayerInfo player) {
        this.experience = player.getExperience();
        this.level = player.getLevel();
        this.money = player.getMoney();
        this.heroType = player.getHeroType();
        this.weaponType = player.getWeaponType();
        this.weaponLevel = player.getWeaponLevel();
        this.bag = player.getBag();
        this.skillLevels = player.getSkillLevels();
    }
}
