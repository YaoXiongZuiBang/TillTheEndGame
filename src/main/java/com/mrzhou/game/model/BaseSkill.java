package com.mrzhou.game.model;

import lombok.Data;


@Data
public class BaseSkill {

    private Integer id;

    private Integer heroId;

    private String name;

    private Integer bloodPlus;

    private Integer energyPlus;

    private Integer attackPlus;

    private Integer defencePlus;

    private Integer speedPlus;

    private Integer rangePlus;

    private Integer attackType;

    private Integer time;

}
