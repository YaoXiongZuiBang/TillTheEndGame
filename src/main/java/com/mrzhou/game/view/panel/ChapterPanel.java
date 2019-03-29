package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;

import javax.swing.*;
import java.awt.*;

/**
 * 类说明：关卡选择页
 * 创建者：Zeros
 * 创建时间：2019-03-29 13:18
 * 包名：com.mrzhou.game.view.panel
 */

public class ChapterPanel {
    private BackgroundPanel panel;

    private PlayerPanel playerPanel;

    public ChapterPanel() {
        //背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/index.png"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        panel.setLayout(null);

        //开始战斗按钮
//        Image startImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/start.png"));
//        start = ButtonFactory.makeButton(startImg, 500, 565);
//        start.addMouseListener(new StartGameHandler());
//        panel.add(start);
        playerPanel.setBounds(100,200,400,400);
        panel.add(playerPanel);
    }



    public BackgroundPanel getPanel() {
        return panel;
    }
}
