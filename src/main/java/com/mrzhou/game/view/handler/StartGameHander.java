package com.mrzhou.game.view.handler;

import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.RolePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-28 00:24
 * 包名：com.mrzhou.game.view.handler
 */

public class StartGameHander extends MouseAdapter {

    /**
     * 开始游戏
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        RolePanel rolePanel = new RolePanel();
        SingletonFrame frame = SingletonFrame.getInstance();
        frame.nextPanel(rolePanel.getPanel());
    }
}
