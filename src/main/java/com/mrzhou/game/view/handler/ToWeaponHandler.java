package com.mrzhou.game.view.handler;

import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.WeaponPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ToWeaponHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        SingletonFrame frame = SingletonFrame.getInstance();
        WeaponPanel weaponPanel = new WeaponPanel();
        frame.nextPanel(weaponPanel.getPanel());
    }
}
