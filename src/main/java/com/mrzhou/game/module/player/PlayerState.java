package com.mrzhou.game.module.player;

import lombok.Data;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-22 14:21
 * 包名：com.mrzhou.design.game.module.player
 */

@Data
public class PlayerState {

    // 血量
    private int blood;

    // 能量值
    private int energy;

    // 攻击值
    private int attack;

    // 防御值
    private int defence;

    // 速度(暂不考虑）
    private int speed;

    public PlayerState() {
    }

    public PlayerState(int blood, int energy, int attack, int defence) {
        this.blood = blood;
        this.energy = energy;
        this.attack = attack;
        this.defence = defence;
    }
}



