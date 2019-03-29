package com.mrzhou.game.module.hero;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:41
 * 包名：com.mrzhou.design.game.module.hero
 */

public class Knight extends Hero{
    BloodAttribute bloodAttribute = new HighBlood();
    EnergyAttribute energyAttribute = new ComEnergy();
    AttackAttribute attackAttribute = new ComAttack();
    DefenceAttribute defenceAttribute = new HighDefence();
    SpeedAttribute speedAttribute = new ComSpeed();

    public Knight(){
        String roleName = "圣骑士";
        setName(roleName);
        setBloodAttr(bloodAttribute);
        setEnergyAttr(energyAttribute);
        setAttackAttr(attackAttribute);
        setDefenceAttr(defenceAttribute);
        setSpeedAttr(speedAttribute);
    }

    @Override
    public void attack() {

    }
}
