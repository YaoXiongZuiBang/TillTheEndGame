package com.mrzhou.game.module.attribute;

import com.mrzhou.game.module.equip.Bag;
import com.mrzhou.game.module.player.PlayerState;

/**
 * 类说明：装备属性类
 * 创建者：Zeros
 * 包名：com.mrzhou.game.module.attribute
 */


public class EquipAttribute extends DecoratorAttribute{

    private Attribute attribute;
    private PlayerState playerState;

    public EquipAttribute() {
        super();
    }

    public EquipAttribute(Attribute attribute, Bag bag) {
        this.attribute = attribute;
        this.playerState = bag.getState();
    }

    @Override
    public int obtainBlood() {
        return attribute.obtainBlood() + playerState.getBlood();
    }

    @Override
    public int obtainEnergy() {
        return attribute.obtainEnergy() + playerState.getEnergy();
    }

    @Override
    public int obtainAttack() {
        return attribute.obtainAttack() + playerState.getAttack();
    }

    @Override
    public int obtainDefence() {
        return attribute.obtainDefence() + playerState.getDefence();
    }
}
