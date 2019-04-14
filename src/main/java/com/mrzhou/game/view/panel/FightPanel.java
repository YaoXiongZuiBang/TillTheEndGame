package com.mrzhou.game.view.panel;

import com.mrzhou.game.module.organism.Npc;
import com.mrzhou.game.module.organism.Player;
import com.mrzhou.game.module.organism.PlayerInfo;
import com.mrzhou.game.view.builder.MapPanel;
import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.ButtonFactory;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.handler.AttackSkillHandler;

import javax.swing.*;
import java.awt.*;

public class FightPanel {

    private MapPanel mapPanel;
    private BackgroundPanel panel;
    private PlayerInfo playerInfo;
    private Npc npc;

    public FightPanel(MapPanel mapPanel, Npc npc) {
        this.mapPanel = mapPanel;
        this.npc = npc;
        Player player = Player.getInstance();
        this.playerInfo = player.obtainPlayerInfo();
        initPanel();
    }

    private void initPanel(){
        //背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/fight_bg.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        panel.setLayout(null);
        //血条与蓝条
        Font font1 = new Font("宋体",Font.BOLD,42);
        JLabel bloodText = new JLabel("体力值:");
        bloodText.setBounds(50,10,200,100);
        bloodText.setFont(font1);
        bloodText.setForeground(Color.RED);
        panel.add(bloodText);

        JLabel energyText = new JLabel("能量值:");
        energyText.setBounds(50,80,200,100);
        energyText.setFont(font1);
        energyText.setForeground(Color.BLUE);
        panel.add(energyText);

        JLabel bloodValue = new JLabel("100");
        bloodValue.setBounds(200,10,200,100);
        bloodValue.setFont(font1);
        bloodValue.setForeground(Color.RED);
        panel.add(bloodValue);

        JLabel energyValue = new JLabel("100");
        energyValue.setBounds(200,80,200,100);
        energyValue.setFont(font1);
        energyValue.setForeground(Color.BLUE);
        panel.add(energyValue);


        //玩家角色
        Image roleImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/hero/" + playerInfo.getHero().getImg()));
        ImageIcon roleIcon = new ImageIcon(roleImg);
        JButton heroButton = new JButton();
        heroButton.setIcon(roleIcon);
        heroButton.setBounds(100,200,roleIcon.getIconWidth(),roleIcon.getIconHeight());
        heroButton.setContentAreaFilled(false);
        heroButton.setBorderPainted(false);
        heroButton.setFocusable(true);
        panel.add(heroButton);
        //NPC角色
        Image npcImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(npc.getBImg()));
        ImageIcon npcIcon = new ImageIcon(npcImg);
        JButton npcButton = new JButton();
        npcButton.setIcon(npcIcon);
        npcButton.setBounds(850,100, npcIcon.getIconWidth(),npcIcon.getIconHeight());
        npcButton.setContentAreaFilled(false);
        npcButton.setBorderPainted(false);
        npcButton.setFocusable(true);
        panel.add(npcButton);
        //技能
        Image comAttackImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/skill/comAttack.png"));
        JButton comAttack = ButtonFactory.makeButton(comAttackImg, 420, 520);
        comAttack.addMouseListener(new AttackSkillHandler(panel,"/img/skill/attack_display.png"));
        panel.add(comAttack);
        Image skill1Img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/skill/skill1_1.png"));
        JButton skill1 = ButtonFactory.makeButton(skill1Img, 570, 520);
        skill1.addMouseListener(new AttackSkillHandler(panel,"/img/skill/skillDisplay1_1.png"));
        panel.add(skill1);
        Image skill2Img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/skill/skill1_2.png"));
        JButton skill2 = ButtonFactory.makeButton(skill2Img, 720, 520);
        skill2.addMouseListener(new AttackSkillHandler(panel,"/img/skill/skillDisplay1_2.png"));
        panel.add(skill2);
    }


    public BackgroundPanel getPanel(){
        return panel;
    }

    private void back(){
        SingletonFrame frame = SingletonFrame.getInstance();
        frame.nextPanel(mapPanel.getBg());
    }
}
