package com.mrzhou.game.module.hero;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:38
 * 包名：com.mrzhou.design.game.module.hero
 */

public class Warrior extends Hero{
    BloodAttribute bloodAttribute = new HighBlood();
    EnergyAttribute energyAttribute = new ComEnergy();
    AttackAttribute attackAttribute = new HighAttack();
    DefenceAttribute defenceAttribute = new ComDefence();
    SpeedAttribute speedAttribute = new ComSpeed();

    public Warrior(){
        String roleName = "狂战士";
        setName(roleName);
        setBlood(bloodAttribute);
        setEnergy(energyAttribute);
        setAttack(attackAttribute);
        setDefence(defenceAttribute);
        setSpeed(speedAttribute);
    }

    //技能，外观，攻击未实现
    @Override
    public void attack() {

    }
}
