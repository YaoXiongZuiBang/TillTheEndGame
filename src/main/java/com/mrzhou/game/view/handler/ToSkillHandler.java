package com.mrzhou.game.view.handler;

import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.SkillPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ToSkillHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        SingletonFrame frame = SingletonFrame.getInstance();
        SkillPanel skillPanel = new SkillPanel();
        frame.nextPanel(skillPanel.getPanel());
    }
}
