package com.mrzhou.game.view.common;

import com.mrzhou.game.module.player.Player;

public class SingletonPlayer extends Player {
    private static SingletonPlayer singletonPlayer = null;

    public static SingletonPlayer getInstance(){
        if(singletonPlayer == null){
            singletonPlayer =  new SingletonPlayer();
        }
        return singletonPlayer;
    }
}
