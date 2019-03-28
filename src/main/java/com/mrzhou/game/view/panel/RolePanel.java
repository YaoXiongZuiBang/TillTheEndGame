package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.handler.ChooseRoleHander;

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

public class    RolePanel {

    private BackgroundPanel panel;

//    private JButton fighter;

    private JButton role;


    public RolePanel() {
        //背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/choose_bg.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        panel.setLayout(null);

        //选择角色
        ChooseRole("/img/hero/hero-1.png",100,100,"warrior");
        ChooseRole("/img/hero/hero-2.png",480,100,"knight");
        ChooseRole("/img/hero/hero-3.png",860,100,"thief");
    }

    public void ChooseRole(String picture,int x,int y,String name){
        Image startImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(picture));
        role = ButtonFactory.makeButton(startImg, x, y);
        role.setName(name);
        role.addMouseListener(new ChooseRoleHander());
        panel.add(role);
    }



    public BackgroundPanel getPanel() {
        return panel;
    }
}
