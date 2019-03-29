package com.mrzhou.game.module.skill;

import lombok.Data;


@Data
public abstract class Skill {

    private String type;

    private String name;

    private Integer level;

    private Integer bloodPlus;

    private Integer energyPlus;

    private Integer attackPlus;

    private Integer attackType;

    private Integer defencePlus;

    private Integer rangePlus;

    private Integer time;

    public Skill() {
    }

    public abstract void attack();

    public abstract void levelUp();

}
