package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.handler.BackMainHandler;
import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Data
public class EquipPanel {
    private BackgroundPanel panel;
    private BackgroundPanel shopPanel;
    private BackgroundPanel displayPanel;
    private JPanel itemsPanel;
    private JLabel equipName = new JLabel();
    private JLabel equipAttr = new JLabel();
    private String showImagePath ="THIS IS ORIGON PATH";
    private int packageNumber = 0;
    private int money = 10000;
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
                //物品图标
                String filePath = "/img/equipment/equip_" + (j+i*4 + 1) + ".png";
                Image goodsImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(filePath));
                JButton goodsButton = ButtonFactory.makeButton(goodsImg, 40+j*70, 100+i*80);
                goodsButton.setName("goods"+(j+i*4));
                //物品名称及属性
                String itemName = "引导之图"+(j+i*4+1);
                String itemAttr = "攻击+100，血量+"+(j+i*4+1);
                //当点击时显示属性
                MouseAdapter m1 = new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        System.out.println("OK,choose it.");
                        equipName.setText(itemName);
                        equipAttr.setText(itemAttr);
                        showImagePath = filePath;
                    }
                };
                goodsButton.addMouseListener(m1);
                shopPanel.add(goodsButton);
            }
        }
        //金币
        Image moneyImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/money.png"));
        ImageIcon moneyIcon = new ImageIcon(moneyImg);
        JLabel moneyLabel = new JLabel(moneyIcon);
        moneyLabel.setBounds(30,400,65,50);
        shopPanel.add(moneyLabel);
        JLabel moneyNumberLabel = new JLabel(money+"");
        moneyNumberLabel.setBounds(130,375,100,100);
        Font fontMoney = new Font("宋体", Font.BOLD,30);
        moneyNumberLabel.setFont(fontMoney);
        moneyNumberLabel.setForeground(Color.WHITE);
        shopPanel.add(moneyNumberLabel);

        //购买按钮
        Image buyImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_buy.jpg"));
        JButton buyButton = ButtonFactory.makeButton(buyImg, 130, 500);
        buyButton.setName("buy");
        shopPanel.add(buyButton);
        //当点击时触发购买操作，同时自动加入装备栏
        MouseAdapter buyEquipHandler = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //获取当前背包位置所在组件
                int count = panel.getComponentCount();
                for(int i=0;i<count;i++){
                    Component comp = itemsPanel.getComponent(i);
                    if(comp instanceof JButton){
                        String compName = comp.getName();
                        if(compName.equals("blank"+packageNumber)){
                            ((JButton) comp).setIcon(new ImageIcon(getClass().getResource(showImagePath)));
                            packageNumber = (packageNumber+1)%6;
                            break;
                        }
                    }
                }
                //减少金钱数
                money-=200;
                moneyNumberLabel.setText(money+" ");
            }
        };
        buyButton.addMouseListener(buyEquipHandler);
//        物品栏
        itemsPanel = new JPanel();
        itemsPanel.setBounds(50,50,700,250);
        itemsPanel.setLayout(null);
        itemsPanel.setBackground(null);
        itemsPanel.setOpaque(false);
        panel.add(itemsPanel);
        //装备栏标识
        JLabel itemNameLabel = new JLabel("装备栏");
        itemNameLabel.setBounds(10,10,200,50);
        Font font = new Font("宋体", Font.BOLD,34);
        itemNameLabel.setFont(font);
        itemNameLabel.setForeground(Color.WHITE);
        itemsPanel.add(itemNameLabel);
        //空物品栏
        for(int i=0;i<6;i++){
            Image blankImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/equipment/blank_item.jpg"));
            JButton blankButton = ButtonFactory.makeButton(blankImg, 120+i*70, 100);
            blankButton.setName("blank"+i);
            itemsPanel.add(blankButton);
        }
//        显示物品属性
        //显示物品标识
        JLabel displayNameLabel = new JLabel("装备详情");
        displayNameLabel.setBounds(60,260,200,50);
        Font fontDisplay = new Font("宋体", Font.BOLD,34);
        displayNameLabel.setFont(fontDisplay);
        displayNameLabel.setForeground(Color.WHITE);
        panel.add(displayNameLabel);

        //显示装备的具体属性
        JLabel equipNameLabel = new JLabel("【装备名称】");
        equipNameLabel.setBounds(120,380,200,50);
        Font font_equipName = new Font("宋体", Font.BOLD,26);
        equipNameLabel.setFont(font_equipName);
        equipNameLabel.setForeground(Color.WHITE);
        panel.add(equipNameLabel);

        equipName.setBounds(120,430,200,50);
        equipName.setFont(font_equipName);
        equipName.setForeground(Color.WHITE);
        panel.add(equipName);


        JLabel equipAttrLabel = new JLabel("【装备属性】");
        equipAttrLabel.setBounds(120,480,200,50);
        Font font_equipAttr = new Font("宋体", Font.BOLD,26);
        equipAttrLabel.setFont(font_equipAttr);
        equipAttrLabel.setForeground(Color.WHITE);
        panel.add(equipAttrLabel);

        equipAttr.setBounds(120,530,500,50);
        equipAttr.setFont(font_equipName);
        equipAttr.setForeground(Color.WHITE);
        panel.add(equipAttr);

        Image informationBgImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/equipment/equip_introduc.png"));
        ImageIcon displayIcon = new ImageIcon(informationBgImg);
        displayPanel = new BackgroundPanel(displayIcon.getImage());
        displayPanel.setBounds(50,350,displayIcon.getIconWidth(),displayIcon.getIconHeight());
        displayPanel.setLayout(null);
        panel.add(displayPanel);


//      返回主界面
        Image backArrowImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/backArrow_2.png"));
        ImageIcon backArrowIcon = new ImageIcon(backArrowImg);
        JButton backArrowButton = new JButton();
        backArrowButton.setIcon(backArrowIcon);
        backArrowButton.setBounds(0, 0, 55, 48);
        backArrowButton.setContentAreaFilled(false);
        backArrowButton.setBorderPainted(false);
        backArrowButton.setFocusable(true);
        backArrowButton.requestFocus();
        backArrowButton.setName("backArrow");
        //绑定返回的事件监听
        backArrowButton.addMouseListener(new BackMainHandler());
        panel.add(backArrowButton);

    }


    public BackgroundPanel getPanel(){
        return panel;
    }
}
