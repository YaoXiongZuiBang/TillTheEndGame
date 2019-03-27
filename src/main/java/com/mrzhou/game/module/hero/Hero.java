package com.mrzhou.game.module.hero;

import com.mrzhou.game.module.skill.Skill;
import lombok.Data;

import java.util.List;

/**
 * 类说明：角色父类
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:01
 * 包名：com.mrzhou.design.game.module.hero
 */

@Data
public abstract class Hero {

    // 角色名
    private String name;

    // 血量
    private int blood;

    // 能量值
    private int energy;

    // 攻击值
    private int attack;

    // 防御值
    private int defence;

    // 速度
    private int speed;

    private List<Skill> skillList;


    public abstract void attack();

}
