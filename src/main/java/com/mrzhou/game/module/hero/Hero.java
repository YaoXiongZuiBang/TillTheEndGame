package com.mrzhou.game.module.hero;

import com.mrzhou.game.module.skill.Skill;
import lombok.Data;

import javax.management.relation.Role;
import java.util.List;

/**
 * 类说明：角色父类
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:01
 * 包名：com.mrzhou.design.game.module.hero
 */

@Data
public abstract class Hero {

    // 角色名
    private String name;

    // 血量
    private int blood;

    // 能量值
    private int energy;

    // 攻击值
    private int attack;

    // 防御值
    private int defence;

    // 速度
    private int speed;

    // 技能(未实现)
    private List<Skill> skillList;

    //外观（未实现）
    private String dispaly;

    //设置名字
    public void setName(String name){
        this.name = name;
    }

    //接口类型
    public void setBlood(BloodAttribute bloodAttribute){
        blood = bloodAttribute.setBlood();
    }
    public void setEnergy(EnergyAttribute energyAttribute){
        energy = energyAttribute.setEnergy();
    }
    public void setAttack(AttackAttribute attackAttribute){
        attack = attackAttribute.setAttack();
    }
    public void setDefence(DefenceAttribute defenceAttribute){
        defence = defenceAttribute.setDefence();
    }
    public void setSpeed(SpeedAttribute speedAttribute){
        speed = speedAttribute.setSpeed();
    }



    public abstract void attack();

}
