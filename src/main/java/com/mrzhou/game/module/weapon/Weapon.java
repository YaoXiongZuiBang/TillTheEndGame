package com.mrzhou.game.module.weapon;

import com.mrzhou.game.module.hero.Hero;
import lombok.Data;

@Data
public abstract class Weapon {
    //类型
    private String type;

    //武器名
    private String name;

    //等级
    private Integer level;

    //攻击值
    private Integer attackPlus;

    //防御值
    private Integer defencePlus;


    //增加人物属性
    public abstract void addAttribute(Hero hero);

}
