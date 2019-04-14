package com.mrzhou.game.module.attribute;

/**
 * 类说明：基本属性类
 * 创建者：Zeros
 * 包名：com.mrzhou.game.module.attribute
 */


public class BaseAttribute extends Attribute{

    @Override
    public int obtainBlood() {
        return 0;
    }

    @Override
    public int obtainEnergy() {
        return 0;
    }

    @Override
    public int obtainAttack() {
        return 0;
    }

    @Override
    public int obtainDefence() {
        return 0;
    }
}
