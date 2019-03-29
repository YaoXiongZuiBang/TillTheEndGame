package com.mrzhou.game.module.equip;

import lombok.Data;

/**
 * 类说明：能量加成类
 * 创建者：Zeros
 * 创建时间：2019-03-30 04:33
 * 包名：com.mrzhou.game.module.equip
 */

@Data
public class EnergyBuff extends Buff{

    public EnergyBuff() {
        super();
        this.type = 2;
    }

    @Override
    public Integer addBuff() {
        return getStrength().addRate();
    }
}
