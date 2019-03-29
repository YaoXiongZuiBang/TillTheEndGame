package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.handler.StartGameHandler;

import javax.swing.*;
import java.awt.*;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-29 13:55
 * 包名：com.mrzhou.game.view.panel
 */

public class PlayerPanel extends JPanel {

    private JButton start;

    public PlayerPanel(){
        //开始战斗按钮
        Image startImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/start.png"));
        start = ButtonFactory.makeButton(startImg, 500, 565);
        start.addMouseListener(new StartGameHandler());
        this.add(start);
    }
}
