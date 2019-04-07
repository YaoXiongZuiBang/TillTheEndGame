package com.mrzhou.game.module.npc;

import lombok.Data;

import javax.swing.*;

@Data
public class Npc implements Cloneable{
    private int blood;
    private int attack;
    private int level;
    private String img;
    private String attackImg;

    protected Npc clone() throws CloneNotSupportedException{
        return (Npc) super.clone();
    }
}