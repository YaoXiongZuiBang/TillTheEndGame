package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.handler.EquipHandler;
import com.mrzhou.game.view.handler.PartOneHandler;

import javax.swing.*;
import java.awt.*;

public class StageChoosePanel {

    private BackgroundPanel panel;

    public StageChoosePanel(){
        //背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/choose_bg4.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        panel.setLayout(null);
        //人物按钮
        Image roleImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/hero/hero-1.png"));
        ImageIcon roleIcon = new ImageIcon(roleImg);
        JButton heroButton = new JButton();
        heroButton.setIcon(roleIcon);
        heroButton.setBounds(100,70,roleIcon.getIconWidth(),roleIcon.getIconHeight());
        heroButton.setContentAreaFilled(false);
        heroButton.setBorderPainted(false);
        heroButton.setFocusable(true);
        panel.add(heroButton);
        //角色界面按钮
        Image roleButtonImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_role.jpg"));
        JButton roleButton = ButtonFactory.makeButton(roleButtonImg,40,450);
        panel.add(roleButton);
        //武器界面按钮
        Image weaponButtonImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_weapon.jpg"));
        JButton weaponButton = ButtonFactory.makeButton(weaponButtonImg,250,450);
        panel.add(weaponButton);
        //装备界面按钮
        Image equipButtonImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_equip.jpg"));
        JButton equipButton = ButtonFactory.makeButton(equipButtonImg,40,550);
        equipButton.addMouseListener(new EquipHandler());
        panel.add(equipButton);
        //技能界面按钮
        Image skillButtonImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_skill.jpg"));
        JButton skillButton = ButtonFactory.makeButton(skillButtonImg,250,550);
        panel.add(skillButton);
//        关卡选择
        Image partButtonImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_part1.jpg"));
        JButton partButton = ButtonFactory.makeButton(partButtonImg,650,100);
        partButton.addMouseListener(new PartOneHandler());
        panel.add(partButton);
        Image partTextButtonImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/buttonText_part1.jpg"));
        JButton partTextButton = ButtonFactory.makeButton(partTextButtonImg,720,35);
        panel.add(partTextButton);

    }

    public BackgroundPanel getPanel(){
        return panel;
    }
}
