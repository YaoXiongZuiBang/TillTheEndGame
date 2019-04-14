package com.mrzhou.game.module.attribute;

/**
 * 类说明：基本属性类
 * 创建者：Zeros
 * 包名：com.mrzhou.game.module.attribute
 */

public abstract class DecoratorAttribute extends Attribute{

    public DecoratorAttribute() {
        super();
    }

    public DecoratorAttribute(Integer blood, Integer energy, Integer attack, Integer defence) {
        super(blood, energy, attack, defence);
    }
}
