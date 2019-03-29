package com.mrzhou.game.module.equip;

import lombok.Data;

/**
 * 类说明：攻击加成类
 * 创建者：Zeros
 * 创建时间：2019-03-30 04:33
 * 包名：com.mrzhou.game.module.equip
 */

@Data
public class AttackBuff extends Buff{
    public AttackBuff() {
        super();
        this.type = 3;
    }

    @Override
    public Integer addBuff() {
        return 2 * getStrength().addRate();
    }
}
