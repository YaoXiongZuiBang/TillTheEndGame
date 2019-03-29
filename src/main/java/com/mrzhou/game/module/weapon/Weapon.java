package com.mrzhou.game.module.weapon;

import com.mrzhou.game.module.hero.Hero;
import lombok.Data;

@Data
public abstract class Weapon {
    //武器名
    private String weaponName;
    //攻击值
    private int weaponAttack;
    //防御值
    private int weaponDefence;
    //能量值
    private int weaponEnger;
    //等级
    private int level;

    //增加人物属性
    public abstract void addAttribute(Hero hero);

}
