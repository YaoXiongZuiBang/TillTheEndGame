package com.mrzhou.game.view.handler;

import com.mrzhou.game.module.player.Player;
import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.util.FileUtil;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.ChapterPanel;
import com.mrzhou.game.view.panel.RoleChoosePanel;
import com.mrzhou.game.view.panel.RolePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 类说明：
 * 创建者：Zeros
 * 创建时间：2019-03-28 00:24
 * 包名：com.mrzhou.game.view.handler
 */

public class StartGameHandler extends MouseAdapter {

    /**
     * 开始游戏
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        Player player = FileUtil.readFile(ConstantsUtil.USERINFO_PATH, Player.class);
        if(player == null || player.getHero() == null){
            RoleChoosePanel rolechoosePanel = new RoleChoosePanel();
            SingletonFrame frame = SingletonFrame.getInstance();
            frame.nextPanel(rolechoosePanel.getPanel());
        }else{
            ChapterPanel chapterPanel = new ChapterPanel();
            SingletonFrame frame = SingletonFrame.getInstance();
            frame.nextPanel(chapterPanel.getPanel());
        }

    }
}
