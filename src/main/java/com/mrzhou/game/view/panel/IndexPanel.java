package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.handler.StartGameHander;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 类说明：初始Panel
 * 创建者：Zeros
 * 创建时间：2019-03-27 20:33
 * 包名：com.mrzhou.game.view.panel
 */

public class IndexPanel{

    private BackgroundPanel panel;

    private JButton start;


    public IndexPanel() {
        //背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/index.png"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        panel.setLayout(null);

        //开始战斗按钮
        Image startImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/start.png"));
        start = ButtonFactory.makeButton(startImg, 500, 565);
        start.addMouseListener(new StartGameHander());
        panel.add(start);
    }



    public BackgroundPanel getPanel() {
        return panel;
    }
}
