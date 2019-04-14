package com.mrzhou.game.module.attribute;

import com.alibaba.fastjson.JSON;
import com.mrzhou.game.module.hero.Hero;
import com.mrzhou.game.module.player.PlayerState;
import com.mrzhou.game.module.weapon.Weapon;

/**
 * 类说明：武器属性类
 * 创建者：Zeros
 * 包名：com.mrzhou.game.module.attribute
 */


public class WeaponAttribute extends DecoratorAttribute{

    private Attribute attribute;

    public WeaponAttribute() {
        super();
    }

    public WeaponAttribute(Attribute attribute, Weapon weapon) {
        super(0, 0, weapon.getAttackPlus(), weapon.getDefencePlus());
        this.attribute = attribute;
    }

    @Override
    public int obtainBlood() {
        return attribute.obtainBlood();
    }

    @Override
    public int obtainEnergy() {
        return attribute.obtainEnergy();
    }

    @Override
    public int obtainAttack() {
        return attribute.obtainAttack() + this.getAttack();
    }

    @Override
    public int obtainDefence() {
        return attribute.obtainDefence() + this.getDefence();
    }
}
