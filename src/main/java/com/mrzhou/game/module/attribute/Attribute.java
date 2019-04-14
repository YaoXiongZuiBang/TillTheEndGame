package com.mrzhou.game.module.attribute;

import lombok.Data;

/**
 * 类说明：属性计算基类
 * 创建者：Zeros
 * 包名：com.mrzhou.game.module.attribute
 */

@Data
public abstract class Attribute {

    // 血量
    int blood;

    // 能量值
    int energy;

    // 攻击值
    int attack;

    // 防御值
    int defence;

    public Attribute() {
    }

    public Attribute(int blood, int energy, int attack, int defence) {
        this.blood = blood;
        this.energy = energy;
        this.attack = attack;
        this.defence = defence;
    }

    public abstract int obtainBlood();

    public abstract int obtainEnergy();

    public abstract int obtainAttack();

    public abstract int obtainDefence();


}
