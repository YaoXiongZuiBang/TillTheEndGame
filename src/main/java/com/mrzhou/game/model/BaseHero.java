package com.mrzhou.game.model;

import lombok.Data;


@Data
public class BaseHero {

    private Integer id;

    private String type;

    private String name;

    private Integer blood;

    private Integer energy;

    private Integer attack;

    private Integer defence;

    private Integer speed;

    private Integer range;

}
