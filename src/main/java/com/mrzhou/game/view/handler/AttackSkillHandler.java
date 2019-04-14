package com.mrzhou.game.view.handler;

import com.mrzhou.game.module.battle.NPCPartner;
import com.mrzhou.game.module.battle.PlayerPartner;
import com.mrzhou.game.view.listener.RemoveSkillListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AttackSkillHandler extends MouseAdapter {
    private JPanel panel;
    private String skillImg;
    private PlayerPartner playerPartner;
    private NPCPartner npcPartner;

    public AttackSkillHandler(PlayerPartner playerPartner, NPCPartner npcPartner, JPanel panel, String skillImg){
        this.playerPartner = playerPartner;
        this.npcPartner = npcPartner;
        this.panel = panel;
        this.skillImg = skillImg;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("OK,释放技能");
        super.mouseClicked(e);

        Image displayImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(skillImg));
        ImageIcon displayIcon = new ImageIcon(displayImg);
        JLabel label = new JLabel();
        label.setIcon(displayIcon);
        label.setBounds(500,200,400,200);
        panel.add(label);
        panel.repaint();
        Timer timer = new Timer(1000,new RemoveSkillListener(panel,label));
        timer.setRepeats(false);
        timer.start();

        playerPartner.attackTarget(npcPartner);
        npcPartner.attackTarget(playerPartner);

    }
}
