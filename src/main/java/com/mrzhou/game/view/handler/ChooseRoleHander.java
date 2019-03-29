package com.mrzhou.game.view.handler;

import com.mrzhou.game.module.hero.Hero;
import com.mrzhou.game.module.hero.HeroFactory;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.WeaponChoosePanel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChooseRoleHander extends MouseAdapter {

    public void mouseClicked(MouseEvent e){
        super.mouseClicked(e);
        WeaponChoosePanel weaponChoosePanel = new WeaponChoosePanel();
        SingletonFrame frame = SingletonFrame.getInstance();
        frame.nextPanel(weaponChoosePanel.getPanel());
        String chooseHeroName = ((JButton)(e.getSource())).getName();
        System.out.println(chooseHeroName);
        HeroFactory heroFactory = new HeroFactory();
        heroFactory.createHero(chooseHeroName);
    }
}
