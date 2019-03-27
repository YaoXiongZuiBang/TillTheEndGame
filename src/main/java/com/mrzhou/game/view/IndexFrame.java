package com.mrzhou.game.view;

import com.apple.eawt.Application;
import com.mrzhou.game.view.common.ButtonFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 类说明：启动页
 * 创建者：Zeros
 * 创建时间：2019-03-27 15:12
 * 包名：com.mrzhou.game.view
 */

public class IndexFrame extends JFrame {

    private JPanel panel;

    /**
     * 开始游戏按钮
     */
    private JButton start;

    public IndexFrame() {
        //面板
        panel = (JPanel) this.getContentPane();
        this.setLayout(null);

        //背景
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/index.png"));
        ImageIcon backIcon = new ImageIcon(backImg);
        BackgroundPanel background = new BackgroundPanel(backIcon.getImage());
        background.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        background.setLayout(null);

        //开始战斗按钮
        Image startImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/btn/start.png"));
        start = ButtonFactory.makeButton(startImg, 500, 565);
        start.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        background.add(start);
        panel.add(background);

        //应用Icon
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon/icon.png"));
        Application app = Application.getApplication();
        app.setDockIconImage(icon);

        //frame位置
        this.setSize(backIcon.getIconWidth(),backIcon.getIconHeight());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }


}
