package com.mrzhou.game.view.handler;

import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.EquipPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EquipHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        EquipPanel equipPanel = new EquipPanel();
        SingletonFrame singletonFrame = SingletonFrame.getInstance();
        singletonFrame.nextPanel(equipPanel.getPanel());
    }
}
