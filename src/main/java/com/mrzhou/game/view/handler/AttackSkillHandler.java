package com.mrzhou.game.view.handler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AttackSkillHandler extends MouseAdapter {
    private JPanel panel;
    private String skillImg;

    public AttackSkillHandler(JPanel panel,String skillImg){
        this.panel = panel;
        this.skillImg = skillImg;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("OK,第一个技能");
        super.mouseClicked(e);
        Image displayImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(skillImg));
        ImageIcon displayIcon = new ImageIcon(displayImg);
        JLabel label = new JLabel();
        label.setIcon(displayIcon);
        label.setBounds(300,200,300,200);
        panel.add(label);
    }
}
