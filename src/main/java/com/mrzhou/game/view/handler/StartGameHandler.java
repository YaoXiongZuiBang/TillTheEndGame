package com.mrzhou.game.view.handler;

import com.mrzhou.game.module.player.Player;
import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.util.FileUtil;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.RoleChoosePanel;
import com.mrzhou.game.view.panel.StageChoosePanel;
import com.mrzhou.game.view.panel.WeaponChoosePanel;

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
        Player player = FileUtil.readFile(ConstantsUtil.USER_INFO_PATH, Player.class);
        SingletonFrame frame = SingletonFrame.getInstance();

        //未初始化
        if(player == null || player.getHeroType() == null){
            //跳转选择角色页面
            RoleChoosePanel rolePanel = new RoleChoosePanel();
            frame.nextPanel(rolePanel.getPanel());
        }else if(player.getWeaponType() == null){
            //跳转选择武器页面
            WeaponChoosePanel weaponPanel = new WeaponChoosePanel();
            frame.nextPanel(weaponPanel.getPanel());
        }else{
            //跳转选择关卡页面
            StageChoosePanel chapterPanel = new StageChoosePanel();
            frame.nextPanel(chapterPanel.getPanel());
        }

    }
}
