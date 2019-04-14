package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.handler.BackMainHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SkillPanel {
    private BackgroundPanel panel;
    private BackgroundPanel skillBorderPanel;
    private int skillPointValue = 2;
    private int skillLevelValue1 = 1;
    private int skillLevelValue2 = 1;
    private int skillLevelValue3 = 1;

    public SkillPanel(){
        //        背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/choose_bg4.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0, 0, backIcon.getIconWidth(), backIcon.getIconHeight());
        panel.setLayout(null);
//        技能框
        Image skillBorderImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/skill/skillBorder_3.png"));
        ImageIcon skillBorderIcon = new ImageIcon(skillBorderImg);
        skillBorderPanel = new BackgroundPanel(skillBorderIcon.getImage());
        skillBorderPanel.setBounds(100,50,skillBorderIcon.getIconWidth(),skillBorderIcon.getIconHeight());
        skillBorderPanel.setLayout(null);
        panel.add(skillBorderPanel);
//        技能点
        Font fontPoint = new Font("宋体",Font.BOLD,35);
        JLabel skillPointText = new JLabel("技能点");
        skillPointText.setBounds(625,25,200,100);
        skillPointText.setFont(fontPoint);
        skillPointText.setForeground(Color.BLACK);
        skillBorderPanel.add(skillPointText);

        JLabel skillPoint = new JLabel("2");
        skillPoint.setBounds(750,25,200,100);
        skillPoint.setFont(fontPoint);
        skillPoint.setForeground(Color.WHITE);
        skillBorderPanel.add(skillPoint);
//        技能一
        //技能图标
        Image skillImg1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/skill/s1-1.jpg"));
        ImageIcon skillIcon1 = new ImageIcon(skillImg1);
        JLabel skillLabel1 = new JLabel(skillIcon1);
        skillLabel1.setBounds(150,130,skillIcon1.getIconWidth(),skillIcon1.getIconHeight());
        skillBorderPanel.add(skillLabel1);
        //技能名称及等级
        Font font = new Font("宋体",Font.BOLD,28);
        JLabel skillName = new JLabel("沸血");
        skillName.setBounds(100,200,200,100);
        skillName.setFont(font);
        skillName.setForeground(Color.BLACK);
        skillBorderPanel.add(skillName);
        JLabel skillLevel = new JLabel("level-"+skillLevelValue1);
        skillLevel.setBounds(175,200,200,100);
        skillLevel.setFont(font);
        skillLevel.setForeground(Color.WHITE);
        skillBorderPanel.add(skillLevel);
        //技能描述
        String text = "<html>【描述】强化自身战斗意识,短期内加强攻击力</html>";
        JLabel skillDiscribe = new JLabel(text);
        skillDiscribe.setBounds(100,180,200,300);
        skillDiscribe.setFont(font);
        skillDiscribe.setForeground(Color.WHITE);
        skillBorderPanel.add(skillDiscribe);
        //技能升级
        Image levelUpButtonImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_levelup.jpg"));
        JButton levelUpButton = ButtonFactory.makeButton(levelUpButtonImg,100,420);
        skillBorderPanel.add(levelUpButton);
        MouseAdapter m1 = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(skillPointValue==0){
                    skillPoint.setText("技能点不足");
                }else{
                    skillLevelValue1++;
                    skillLevel.setText("level-"+skillLevelValue1);
                    skillPointValue--;
                    skillPoint.setText(skillPointValue+"");
                }
            }
        };
        levelUpButton.addMouseListener(m1);
        //技能二
        //技能图标
        Image skillImg2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/skill/s1-2.jpg"));
        ImageIcon skillIcon2 = new ImageIcon(skillImg2);
        JLabel skillLabel2 = new JLabel(skillIcon2);
        skillLabel2.setBounds(450,130,skillIcon2.getIconWidth(),skillIcon2.getIconHeight());
        skillBorderPanel.add(skillLabel2);
        //技能名称及等级
        JLabel skillName2 = new JLabel("重击");
        skillName2.setBounds(400,200,200,100);
        skillName2.setFont(font);
        skillName2.setForeground(Color.BLACK);
        skillBorderPanel.add(skillName2);
        JLabel skillLevel2 = new JLabel("level-"+'1');
        skillLevel2.setBounds(475,200,200,100);
        skillLevel2.setFont(font);
        skillLevel2.setForeground(Color.WHITE);
        skillBorderPanel.add(skillLevel2);
        //技能描述
        String text2 = "<html>【描述】集合全身气力的一击，挥砍武器攻击单体敌人</html>";
        JLabel skillDiscribe2 = new JLabel(text2);
        skillDiscribe2.setBounds(400,180,200,300);
        skillDiscribe2.setFont(font);
        skillDiscribe2.setForeground(Color.WHITE);
        skillBorderPanel.add(skillDiscribe2);
        //技能升级
        Image levelUpButtonImg2 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_levelup.jpg"));
        JButton levelUpButton2 = ButtonFactory.makeButton(levelUpButtonImg2,400,420);
        skillBorderPanel.add(levelUpButton2);
        MouseAdapter m2 = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                skillLevelValue2++;
                skillLevel2.setText("level-"+skillLevelValue2);
            }
        };
        levelUpButton2.addMouseListener(m2);
        //技能三
        Image skillImg3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/skill/s1-3.jpg"));
        ImageIcon skillIcon3 = new ImageIcon(skillImg3);
        JLabel skillLabel3 = new JLabel(skillIcon3);
        skillLabel3.setBounds(750,130,skillIcon3.getIconWidth(),skillIcon3.getIconHeight());
        skillBorderPanel.add(skillLabel3);
        //技能名称及等级
        JLabel skillName3 = new JLabel("狂化");
        skillName3.setBounds(700,200,200,100);
        skillName3.setFont(font);
        skillName3.setForeground(Color.BLACK);
        skillBorderPanel.add(skillName3);
        JLabel skillLevel3 = new JLabel("level-"+'1');
        skillLevel3.setBounds(775,200,200,100);
        skillLevel3.setFont(font);
        skillLevel3.setForeground(Color.WHITE);
        skillBorderPanel.add(skillLevel3);
        //技能描述
        String text3 = "<html>【描述】组合技，狂化后短期内大幅提高攻击和生命</html>";
        JLabel skillDiscribe3 = new JLabel(text3);
        skillDiscribe3.setBounds(700,180,200,300);
        skillDiscribe3.setFont(font);
        skillDiscribe3.setForeground(Color.WHITE);
        skillBorderPanel.add(skillDiscribe3);
        //技能升级
        Image levelUpButtonImg3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/button_levelup.jpg"));
        JButton levelUpButton3 = ButtonFactory.makeButton(levelUpButtonImg3,700,420);
        skillBorderPanel.add(levelUpButton3);
        MouseAdapter m3 = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                skillLevelValue3++;
                skillLevel3.setText("level-"+skillLevelValue3);
            }
        };
        levelUpButton3.addMouseListener(m3);
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
    public BackgroundPanel getPanel(){
        return panel;
    }
}
