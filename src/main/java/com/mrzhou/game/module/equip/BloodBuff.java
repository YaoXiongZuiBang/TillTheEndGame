package com.mrzhou.game.module.equip;

import lombok.Data;

/**
 * 类说明：血量加成类
 * 创建者：Zeros
 * 创建时间：2019-03-30 04:33
 * 包名：com.mrzhou.game.module.equip
 */

@Data
public class BloodBuff extends Buff{
    public BloodBuff() {
        super();
        this.type = 1;
    }

    @Override
    public Integer addBuff() {
        return 2 * getStrength().addRate();
    }
}
