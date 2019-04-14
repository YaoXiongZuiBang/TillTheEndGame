package com.mrzhou.game.view;

import com.mrzhou.game.view.common.SingletonFrame;

import java.awt.*;


/**
 * 类说明：启动类
 * 创建者：Zeros
 * 创建时间：2019-03-27 13:01
 * 包名：com.mrzhou.game.view8
 */

public class GameApplication{

    public static void main(String[] args) {
        EventQueue.invokeLater(SingletonFrame::getInstance);
    }
}
