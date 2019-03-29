package com.mrzhou.game.module.equip;

import lombok.Data;

/**
 * 类说明：加成类
 * 创建者：Zeros
 * 创建时间：2019-03-30 04:33
 * 包名：com.mrzhou.game.module.equip
 */

@Data
public abstract class Buff{
    private Strength strength;

    int type;

    public abstract Integer addBuff();
}
