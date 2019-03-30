package com.mrzhou.game.view.handler;

import com.alibaba.fastjson.JSON;
import com.mrzhou.game.datapool.DataPool;
import com.mrzhou.game.datapool.DataPoolFactory;
import com.mrzhou.game.module.hero.Hero;
import com.mrzhou.game.module.organism.Player;
import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.WeaponChoosePanel;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChooseRoleHandler extends MouseAdapter {

    public void mouseClicked(MouseEvent e){
        super.mouseClicked(e);
        Player player = Player.getInstance();
        String chooseHeroName = ((JButton)(e.getSource())).getName();
        DataPool dataPool = DataPoolFactory.createDataPool(ConstantsUtil.HERO_PART);
        Hero hero = dataPool.getData(chooseHeroName, player.getLevel(), Hero.class);
        player.setHeroType(hero.getType());
        System.out.println(JSON.toJSONString(player));

        //跳转选择武器界面
        WeaponChoosePanel weaponChoosePanel = new WeaponChoosePanel();
        SingletonFrame frame = SingletonFrame.getInstance();
        frame.nextPanel(weaponChoosePanel.getPanel());
    }
}
