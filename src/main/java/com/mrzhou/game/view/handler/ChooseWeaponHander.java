package com.mrzhou.game.view.handler;

import com.mrzhou.game.module.weapon.WeaponFactory;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.StageChoosePanel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChooseWeaponHander extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        StageChoosePanel stageChoosePanel = new StageChoosePanel();
        SingletonFrame frame = SingletonFrame.getInstance();
        frame.nextPanel(stageChoosePanel.getPanel());
        String chooseWeaponName = ((JButton)(e.getSource())).getName();
        System.out.println(chooseWeaponName);
        WeaponFactory weaponFactory = new WeaponFactory();
        weaponFactory.createWeapon(chooseWeaponName);
    }
}

