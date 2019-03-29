package com.mrzhou.game.view.handler;

import com.alibaba.fastjson.JSON;
import com.mrzhou.game.datapool.DataPool;
import com.mrzhou.game.datapool.DataPoolFactory;
import com.mrzhou.game.module.player.Player;
import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.StageChoosePanel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChooseWeaponHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        Player player = Player.getInstance();
        String chooseWeaponName = ((JButton)(e.getSource())).getName();

        DataPool dataPool = DataPoolFactory.createDataPool(ConstantsUtil.WEAPON_PART);
//        Weapon weapon = dataPool.getData(chooseWeaponName, player.getWeaponLevel(), Weapon.class);
//        player.setWeaponType(weapon.getType());
        System.out.println(JSON.toJSONString(player));

        //跳转选择关卡页面
        StageChoosePanel stageChoosePanel = new StageChoosePanel();
        SingletonFrame frame = SingletonFrame.getInstance();
        frame.nextPanel(stageChoosePanel.getPanel());
    }
}

