package com.mrzhou.game.module.attribute;

import com.alibaba.fastjson.JSON;
import com.mrzhou.game.module.hero.Hero;
import com.mrzhou.game.module.player.PlayerState;

/**
 * 类说明：角色属性类
 * 创建者：Zeros
 * 包名：com.mrzhou.game.module.attribute
 */


public class HeroAttribute extends DecoratorAttribute{

    private Attribute attribute;

    public HeroAttribute() {
        super();
    }

    public HeroAttribute(Attribute attribute, Hero hero) {
        super(hero.getBlood(), hero.getEnergy(), hero.getAttack(), hero.getDefence());
        this.attribute = attribute;
    }

    @Override
    public int obtainBlood() {
        return attribute.obtainBlood() + this.getBlood();
    }

    @Override
    public int obtainEnergy() {
        return attribute.obtainEnergy() + this.getEnergy();
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
