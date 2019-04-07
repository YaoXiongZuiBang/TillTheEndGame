package com.mrzhou.game.view.listener;

import com.mrzhou.game.view.common.BackgroundPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveSkillListener implements ActionListener {
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel();
    public RemoveSkillListener(JPanel panel,JLabel label){
        this.panel = panel;
        this.label = label;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("移除技能！");
        panel.remove(label);
        panel.repaint();
    }
}
