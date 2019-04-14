package com.mrzhou.game.module.hero;

/**
 * 类说明：隐秘卫
 * 创建者：Zeros
 * 创建时间：2019-03-22 14:00
 * 包名：com.mrzhou.design.game.module.hero
 */

public class ThiefHero extends Hero {

    public ThiefHero(){
        super();
    }

    @Override
    public Integer attack() {
        System.out.println("隐秘卫造成了 " + this.getAttack() + " 点伤害");
        return this.getAttack();
    }

    @Override
    public void levelUp() {
        System.out.println("隐秘卫升级");
        Integer level = this.getLevel() + 1;
        this.setLevel(level);
    }
}
