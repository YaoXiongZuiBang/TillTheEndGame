package com.mrzhou.game.module.player;

import com.mrzhou.game.module.hero.Hero;
import lombok.Data;

/**
 * 类说明：玩家
 * 创建者：Zeros
 * 创建时间：2019-03-22 13:45
 * 包名：com.mrzhou.design.game.module.player
 */

@Data
public class Player {
    private static Player singletonPlayer = null;

    // 用户名
//    private int playerName;

    // 密码
//    private String password;

    // 经验
    private int experience;

    // 等级
    private int level;

    // 金币
    private int money;

    // 角色
    private Hero hero;

    private Player(){
        this.experience = 0;
        this.level = 1;
        this.money = 0;
    }

    public static Player getInstance(){
        if(singletonPlayer == null){
            singletonPlayer = new Player();
        }
        return singletonPlayer;
    }

}
