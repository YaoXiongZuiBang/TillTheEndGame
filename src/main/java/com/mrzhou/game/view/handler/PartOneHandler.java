package com.mrzhou.game.view.handler;

import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.BattlePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PartOneHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        BattlePanel battlePanel = new BattlePanel();
        SingletonFrame frame = SingletonFrame.getInstance();
        frame.nextPanel(battlePanel.getBgPanel());
    }
}
