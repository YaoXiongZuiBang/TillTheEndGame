package com.mrzhou.game.module.player;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 类说明：玩家
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:45
 * 包名：com.mrzhou.design.game.module.player
 */

@Data
public class Player {
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
    private List<String> equipList;

    // 技能等级
    private int[] skillLevels;

    private Player(){
        this.experience = 0;
        this.level = 1;
        this.money = 0;
        this.weaponLevel = 1;
        this.equipList = new ArrayList<>();
        this.skillLevels = new int[]{0, 0};
    }

    public static Player getInstance(){
        if(singletonPlayer == null){
            singletonPlayer = new Player();
        }
        return singletonPlayer;
    }

}
