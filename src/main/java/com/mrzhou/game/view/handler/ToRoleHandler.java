package com.mrzhou.game.view.handler;

import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.RolePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ToRoleHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        SingletonFrame frame = SingletonFrame.getInstance();
        RolePanel rolePanel = new RolePanel();
        frame.nextPanel(rolePanel.getPanel());
    }
}
