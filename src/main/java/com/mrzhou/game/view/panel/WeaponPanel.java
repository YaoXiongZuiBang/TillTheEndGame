package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.handler.BackMainHandler;
import com.mrzhou.game.view.handler.ChooseWeaponHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WeaponPanel {
    private BackgroundPanel panel;
    private BackgroundPanel skillBorderPanel;
    public WeaponPanel(){
//        背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/choose_bg4.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0, 0, backIcon.getIconWidth(), backIcon.getIconHeight());
        panel.setLayout(null);
//        武器图标
        Image startImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/weapon/weapon_1.png"));
        JButton weapon = ButtonFactory.makeButton(startImg, 220, 100);
        weapon.setName("axe");
        panel.add(weapon);
//        武器名称
        JLabel nameLabel = new JLabel("战斧");
        nameLabel.setBounds(320,450,200,100);
        Font fontDisplay = new Font("宋体", Font.BOLD,40);
        nameLabel.setFont(fontDisplay);
        panel.add(nameLabel);
        panel.setLayout(null);
//        武器属性
        //武器属性图标
        setAttributeImage(650,100,"/img/weapon/level.png");
        setAttributeImage(650,200,"/img/weapon/attack.png");
        setAttributeImage(650,300,"/img/weapon/defence.png");
        setAttributeImage(650,400,"/img/background/money.png");
        //武器属性文字
        setAttributeValue(750,75,"等级：","levelText");
        setAttributeValue(750,175,"攻击：","attackText");
        setAttributeValue(750,275,"防御：","defenceText");
        setAttributeValue(750,375,"金币：","moneyText");
        //武器属性值
        setAttributeValue(850,75,"1","level");
        setAttributeValue(850,175,"20","attack");
        setAttributeValue(850,275,"30","defence");
        setAttributeValue(850,375,"10000","money");
//        武器升级
        Image levelUpButtonImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_stronger.jpg"));
        JButton levelUpButton = ButtonFactory.makeButton(levelUpButtonImg,730,500);
        panel.add(levelUpButton);
        MouseAdapter strongerWeapon = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //寻找对应的组件，更改值
                int count = panel.getComponentCount();
                for(int i=0;i<count;i++){
                    Component comp = panel.getComponent(i);
                    if(comp instanceof JLabel){
                        String compName = comp.getName();
                        if(compName!=null){
                            if(compName.equals("level")){
                                String currentText = ((JLabel) comp).getText();
                                int newValue = Integer.parseInt(currentText)+1;
                                ((JLabel) comp).setText(newValue+"");
                            }else if(compName.equals("attack")){
                                String currentText = ((JLabel) comp).getText();
                                int newValue = Integer.parseInt(currentText)+5;
                                ((JLabel) comp).setText(newValue+"");
                            }else if(compName.equals("defence")){
                                String currentText = ((JLabel) comp).getText();
                                int newValue = Integer.parseInt(currentText)+4;
                                ((JLabel) comp).setText(newValue+"");
                            }else if(compName.equals("money")){
                                String currentText = ((JLabel) comp).getText();
                                int newValue = Integer.parseInt(currentText)-500;
                                ((JLabel) comp).setText(newValue+"");
                            }
                        }
                    }
                }
            }
        };
        levelUpButton.addMouseListener(strongerWeapon);
//        返回按钮
        Image backArrowImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/backArrow_2.png"));
        ImageIcon backArrowIcon = new ImageIcon(backArrowImg);
        JButton backArrowButton = new JButton();
        backArrowButton.setIcon(backArrowIcon);
        backArrowButton.setBounds(10, 10, 55, 48);
        backArrowButton.setContentAreaFilled(false);
        backArrowButton.setBorderPainted(false);
        backArrowButton.setFocusable(true);
        backArrowButton.requestFocus();
        backArrowButton.setName("backArrow");
        //绑定返回的事件监听
        backArrowButton.addMouseListener(new BackMainHandler());
        panel.add(backArrowButton);
    }
    public void setAttributeImage(int x,int y,String path){
        Image attrImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(path));
        ImageIcon attrIcon = new ImageIcon(attrImg);
        JLabel attrLabel = new JLabel(attrIcon);
        attrLabel.setBounds(x,y,attrIcon.getIconWidth(),attrIcon.getIconHeight());
        panel.add(attrLabel);
    }

    public void setAttributeValue(int x,int y,String str,String name){
        Font font = new Font("宋体",Font.BOLD,36);
        JLabel textLabel = new JLabel(str);
        textLabel.setBounds(x,y,200,100);
        textLabel.setFont(font);
        textLabel.setName(name);
        panel.add(textLabel);
    }
    public BackgroundPanel getPanel(){
        return panel;
    }
}
