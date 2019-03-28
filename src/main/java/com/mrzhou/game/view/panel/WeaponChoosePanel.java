package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.handler.ChooseRoleHander;
import com.mrzhou.game.view.handler.ChooseWeaponHander;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WeaponChoosePanel {

    private BackgroundPanel panel;

    private JButton weapon;

    public WeaponChoosePanel(){
        //背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/chooseWeapon_bg.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        panel.setLayout(null);

        //选择武器
        chooseWeapon("/img/weapon/weapon_1.png",100,100,"axe");
        chooseWeapon("/img/weapon/weapon_2.png",480,100,"sword");
        chooseWeapon("/img/weapon/weapon_3.png",860,100,"dagger");
    }

    public void chooseWeapon(String picture,int x,int y,String name){
        Image startImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(picture));
        weapon = ButtonFactory.makeButton(startImg, x, y);
        weapon.setName(name);
        weapon.addMouseListener(new ChooseWeaponHander());
        panel.add(weapon);
    }

    public BackgroundPanel getPanel(){
        return panel;
    }
}
