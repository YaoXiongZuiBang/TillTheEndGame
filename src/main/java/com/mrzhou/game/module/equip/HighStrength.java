package com.mrzhou.game.module.equip;

/**
 * 类说明：高强度buff
 * 创建者：Zeros
 * 创建时间：2019-03-30 04:38
 * 包名：com.mrzhou.game.module.equip
 */

public class HighStrength implements Strength{

    @Override
    public Integer addRate() {
        return 20;
    }
}
