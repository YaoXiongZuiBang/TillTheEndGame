package com.mrzhou.game.module.organism;

import lombok.Data;

@Data
public class Npc implements Cloneable{
    private int blood;
    private int attack;
    private int level;
    private String img;
    private String attackImg;

    public Npc() {
    }

    public Npc(int blood, int attack, int level) {
        this.blood = blood;
        this.attack = attack;
        this.level = level;
    }

    protected Npc clone() throws CloneNotSupportedException{
        return (Npc) super.clone();
    }


    public OrganismState getState() {
        return new OrganismState(blood, attack);
    }
}
