package com.mrzhou.game.view.handler;

import com.mrzhou.game.module.organism.Player;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.StageChoosePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BackMainHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        StageChoosePanel stageChoosePanel = new StageChoosePanel();
        SingletonFrame frame = SingletonFrame.getInstance();
        frame.nextPanel(stageChoosePanel.getPanel());
    }
}
