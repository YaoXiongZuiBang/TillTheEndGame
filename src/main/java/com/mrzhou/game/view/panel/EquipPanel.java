package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;

import javax.swing.*;
import java.awt.*;

public class EquipPanel {
    private BackgroundPanel panel;
    private BackgroundPanel shopPanel;
    public EquipPanel() {
//        背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/choose_bg4.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0, 0, backIcon.getIconWidth(), backIcon.getIconHeight());
        panel.setLayout(null);
//        商店
        Image shopImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/equipment/shop_3.jpg"));
        ImageIcon shopIcon = new ImageIcon(shopImg);
        shopPanel = new BackgroundPanel(shopIcon.getImage());
        shopPanel.setBounds(800,0,shopIcon.getIconWidth(),shopIcon.getIconHeight());
        shopPanel.setLayout(null);
        panel.add(shopPanel);
        //商店物品
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++) {
                String filePath = "/img/equipment/equip_" + (j+i*4 + 1) + ".png";
                Image goodsImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(filePath));
                JButton goodsButton = ButtonFactory.makeButton(goodsImg, 40+j*70, 100+i*80);
                goodsButton.setName("goods"+(j+i*4));
                //当点击时显示属性，同时可购买
                //goodsButton.addMouseListener();
                shopPanel.add(goodsButton);
            }
        }
        //金币
        //购买按钮
        Image buyImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_buy.jpg"));
        JButton buyButton = ButtonFactory.makeButton(buyImg, 100, 500);
        buyButton.setName("buy");
        shopPanel.add(buyButton);
        //当点击时触发购买操作，同时自动加入装备栏
        //buyButton.addMouseListener();
//        物品栏
        JPanel itemsPanel = new JPanel();
        itemsPanel.setBounds(50,50,700,300);
        itemsPanel.setLayout(null);
        panel.add(itemsPanel);
        //空物品栏
        for(int i=0;i<6;i++){
            Image blankImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/equipment/blank_item.jpg"));
            JButton blankButton = ButtonFactory.makeButton(blankImg, 100+i*70, 100);
            blankButton.setName("blank"+i);
            itemsPanel.add(blankButton);
        }
//        显示物品属性

    }


    public BackgroundPanel getPanel(){
        return panel;
    }
}
