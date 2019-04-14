package com.mrzhou.game.module.hero;


/**
 * 类说明：战士
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:38
 * 包名：com.mrzhou.design.game.module.hero
 */

public class WarriorHero extends Hero{

    public WarriorHero(){
        super();
    }


    @Override
    public Integer attack() {
        System.out.println("狂战士造成了 " + this.getAttack() + " 点伤害");
        return this.getAttack();
    }

    @Override
    public void levelUp() {
        System.out.println("狂战士升级");
        Integer level = this.getLevel() + 1;
        this.setLevel(level);
    }
}
