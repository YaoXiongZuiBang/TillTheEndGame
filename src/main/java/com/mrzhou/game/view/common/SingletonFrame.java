package com.mrzhou.game.view.common;


//import com.apple.eawt.Application;

import com.mrzhou.game.util.ConstantsUtil;
import com.mrzhou.game.view.handler.WindowHandler;
import com.mrzhou.game.view.panel.BattlePanel;
import com.mrzhou.game.view.panel.FightPanel;
import com.mrzhou.game.view.panel.IndexPanel;

import javax.swing.*;

/**
 * 类说明：单例框架类
 * 创建者：Zeros
 * 创建时间：2019-03-27 15:12
 * 包名：com.mrzhou.game.view
 */

public class SingletonFrame extends JFrame {

    private static SingletonFrame singletonFrame = null;

    private JPanel currentPanel;

    private SingletonFrame(){
        super();
        initIndexPanel();
    }


    public static SingletonFrame getInstance(){
        if(singletonFrame == null){
            singletonFrame = new SingletonFrame();
        }
        return singletonFrame;
    }

    public void nextPanel(JPanel panel){
        this.remove(currentPanel);
        currentPanel = panel;
        this.add(panel);
        this.repaint();
    }


    private void initIndexPanel() {
        IndexPanel indexPanel = new IndexPanel();
        currentPanel = indexPanel.getPanel();
        this.add(currentPanel);
//        //test
//        FightPanel fightPanel = new FightPanel();
//        currentPanel = fightPanel.getPanel();
//        this.add(currentPanel);

//        //应用Icon
//        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon/icon.png"));
//        Application app = Application.getApplication();
//        app.setDockIconImage(icon);

        this.setSize(ConstantsUtil.WIDTH,ConstantsUtil.HEIGHT);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowHandler());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
    }
}
