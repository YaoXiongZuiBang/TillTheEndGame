package com.mrzhou.game.module.organism;

import lombok.Data;

import java.util.Observable;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-30 15:59
 * 包名：com.mrzhou.game.module.organism
 */

@Data
public class OrganismState extends Observable {
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

    // 状态 0-初始化 1-战斗中 2-死亡
    private int state;

    public OrganismState() {
    }


    public OrganismState(int blood, int attack) {
        this.blood = blood;
        this.attack = attack;

    }

    public OrganismState(int blood, int energy, int attack, int defence) {
        this.blood = blood;
        this.energy = energy;
        this.attack = attack;
        this.defence = defence;
    }

    public void attacked(int attack){
        this.blood -= attack;
        if(this.attack < 0){
            state = 2;
        }
        setChanged();
        notifyObservers();
    }


}
