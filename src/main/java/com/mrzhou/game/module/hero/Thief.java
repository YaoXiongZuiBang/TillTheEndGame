package com.mrzhou.game.module.hero;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-22 14:00
 * 包名：com.mrzhou.design.game.module.hero
 */

public class Thief extends Hero {
    BloodAttribute bloodAttribute = new ComBlood();
    EnergyAttribute energyAttribute = new HighEnergy();
    AttackAttribute attackAttribute = new HighAttack();
    DefenceAttribute defenceAttribute = new ComDefence();
    SpeedAttribute speedAttribute = new ComSpeed();

    public Thief(){
        String roleName = "隐秘卫";
        setName(roleName);
        setBlood(bloodAttribute);
        setEnergy(energyAttribute);
        setAttack(attackAttribute);
        setDefence(defenceAttribute);
        setSpeed(speedAttribute);
    }
    @Override
    public void attack() {

    }
}
