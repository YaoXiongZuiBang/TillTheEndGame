package com.mrzhou.game.module.equip;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 类说明：装备类
 * 创建者：Zeros
 * 创建时间：2019-03-29 04:06
 * 包名：com.mrzhou.game.module.equip
 */
@Data
public abstract class Equip {
    /**
     * 装备类型
     */
    String type;

    /**
     * 装备名称
     */
    String name;

    /**
     * 装备图
     */
    String img;

    /**
     * 血量加成
     */
    int bloodPlus;

    /**
     * 能量加成
     */
    int energyPlus;

    /**
     * 攻击加成
     */
    int attackPlus;

    /**
     * 防御加成
     */
    int defencePlus;

    /**
     * 加成集合类
     */
    List<Buff> buffList;


    /**
     * 初始化装备buff列表
     */
    public abstract void initBuffs();


    /**
     * 初始化装备
     */
    public void addBuff(){
        for(Buff buff: buffList){
            switch (buff.getType()){
                case 1:
                    bloodPlus += buff.addBuff(); break;
                case 2:
                    energyPlus += buff.addBuff(); break;
                case 3:
                    attackPlus += buff.addBuff(); break;
                case 4:
                    defencePlus += buff.addBuff(); break;
                    default:
                        System.out.println(buff.getType());
            }
        }
    }

    /**
     * 初始化装备属性
     */
    public void init(){
        buffList = new ArrayList<>();
        this.initBuffs();
        this.addBuff();
    }


}
