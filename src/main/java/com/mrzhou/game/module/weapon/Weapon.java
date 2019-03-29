package com.mrzhou.game.module.weapon;

import com.mrzhou.game.module.hero.Hero;
import lombok.Data;

@Data
public abstract class Weapon {
    //类型
    String type;

    //武器名
    String name;

    //等级
    Integer level;

    //攻击值
    Integer attackPlus;

    //防御值
    Integer defencePlus;


    //增加人物属性
    public abstract void addAttribute(Hero hero);

}
