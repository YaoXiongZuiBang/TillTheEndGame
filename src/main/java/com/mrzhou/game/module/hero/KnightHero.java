package com.mrzhou.game.module.hero;

/**
 * 类说明：圣骑士角色
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:41
 * 包名：com.mrzhou.design.game.module.hero
 */

public class KnightHero extends Hero{

    public KnightHero(){
        super();
    }

    @Override
    public Integer attack() {
        System.out.println("圣骑士造成了 " + this.getAttack() + " 点伤害");
        return this.getAttack();
    }

    @Override
    public void levelUp() {
        System.out.println("圣骑士升级");
        Integer level = this.getLevel() + 1;
        this.setLevel(level);
    }
}
