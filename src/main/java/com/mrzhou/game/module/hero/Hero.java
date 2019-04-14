package com.mrzhou.game.module.hero;

import lombok.Data;

import java.util.List;

/**
 * 类说明：角色父类
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:01
 * 包名：com.mrzhou.design.game.module.hero
 */

@Data
public abstract class Hero{
    //类型
    String type;

    // 角色名
    String name;

    //头像
    String img;

    //等级
    Integer level;

    // 血量
    Integer blood;

    // 能量值
    Integer energy;

    // 攻击值
    Integer attack;

    // 防御值
    Integer defence;

    // 速度
    Integer speed;

    // 范围
    Integer range;

    // 技能
    List<String> skills;

    public Hero() {
    }

    public abstract void attack();

    public abstract void levelUp();
}
