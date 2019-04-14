package com.mrzhou.game.view.panel;

import com.mrzhou.game.module.hero.Hero;
import com.mrzhou.game.module.organism.Player;
import com.mrzhou.game.module.organism.PlayerInfo;
import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.handler.BackMainHandler;

import javax.swing.*;
import java.awt.*;

public class RolePanel {
    private BackgroundPanel panel;
    private BackgroundPanel attributePanel;
    public RolePanel(){
//        背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/choose_bg4.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0, 0, backIcon.getIconWidth(), backIcon.getIconHeight());
        panel.setLayout(null);
//        人物图标
        PlayerInfo player = Player.getInstance().obtainPlayerInfo();
        Hero hero = player.getHero();
        Image roleImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/hero/" + hero.getImg()));
//        Image roleImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/hero/hero-1.png" ));
        ImageIcon roleIcon = new ImageIcon(roleImg);
        JButton heroButton = new JButton();
        heroButton.setIcon(roleIcon);
        heroButton.setBounds(180,100,roleIcon.getIconWidth(),roleIcon.getIconHeight());
        heroButton.setContentAreaFilled(false);
        heroButton.setBorderPainted(false);
        heroButton.setFocusable(true);
        panel.add(heroButton);
        panel.setLayout(null);
//        人物属性栏
        Image attributeImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/hero/attributes_3.jpg"));
        ImageIcon attributeIcon = new ImageIcon(attributeImg);
        attributePanel = new BackgroundPanel(attributeIcon.getImage());
        attributePanel.setBounds(750, 0, attributeIcon.getIconWidth(), attributeIcon.getIconHeight());
        attributePanel.setLayout(null);
        panel.add(attributePanel);
//        人物各项属性值(侧栏)
        String[] attributeText = {"体力：","攻击:","能量:","速度：","范围：","经验：","防御："};
        for(int i=0;i<7;i++){
            setAttributeSlide(140,95*i,attributeText[i]);
        }
        String[] attributeValue = {hero.getBlood()+"",""+hero.getAttack(),""+hero.getEnergy(),hero.getSpeed()+"","3","502",hero.getDefence()+""};
        for(int i=0;i<7;i++){
            setAttributeSlide(240,95*i,attributeValue[i]);
        }
//        人物其他属性值（底部）
        //图标
        setAttributeImage(200,430,"/img/hero/icon_1.png" );
        setAttributeImage(200,485,"/img/hero/icon_2.png");
        setAttributeImage(200,550,"/img/equipment/money.png");
        String[] attributeBottomValue = {hero.getName(),"Level-"+hero.getLevel(),"10000"};
        for(int i=0;i<3;i++){
            setAttributeBottom(300,350+60*(i+1),attributeBottomValue[i]);
        }
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


    public void setAttributeSlide(int x,int y,String str){
        Font font = new Font("宋体",Font.BOLD,34);
        JLabel textLabel = new JLabel(str);
        textLabel.setBounds(x,y,200,100);
        textLabel.setFont(font);
        attributePanel.add(textLabel);
    }

    public void setAttributeBottom(int x,int y,String str){
        Font font = new Font("宋体",Font.BOLD,34);
        JLabel textLabel = new JLabel(str);
        textLabel.setBounds(x,y,200,100);
        textLabel.setFont(font);
        textLabel.setForeground(Color.BLACK);
        panel.add(textLabel);
    }

    public void setAttributeImage(int x,int y,String path){
        Image nameImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(path));
        ImageIcon nameIcon = new ImageIcon(nameImg);
        JLabel nameLabel = new JLabel(nameIcon);
        nameLabel.setBounds(x,y,nameIcon.getIconWidth(),nameIcon.getIconHeight());
        panel.add(nameLabel);
    }


    public BackgroundPanel getPanel(){
        return panel;
    }
}
