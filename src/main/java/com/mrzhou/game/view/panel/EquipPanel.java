package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;

import javax.swing.*;
import java.awt.*;

public class EquipPanel {
    private BackgroundPanel panel;
    //背景
    public EquipPanel() {
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/choose_bg4.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0, 0, backIcon.getIconWidth(), backIcon.getIconHeight());
        panel.setLayout(null);
    }

    public BackgroundPanel getPanel(){
        return panel;
    }
}
