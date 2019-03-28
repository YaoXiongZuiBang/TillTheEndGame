package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;

import javax.swing.*;
import java.awt.*;

public class StageChoosePanel {

    private BackgroundPanel panel;

    public StageChoosePanel(){
        //背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/role.png"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        panel.setLayout(null);
    }

    public BackgroundPanel getPanel(){
        return panel;
    }
}
