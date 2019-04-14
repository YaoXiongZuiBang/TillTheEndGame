package com.mrzhou.game.view.builder;

import com.mrzhou.game.module.npc.FirstNpc;
import com.mrzhou.game.module.organism.Npc;
import com.mrzhou.game.module.organism.Player;
import com.mrzhou.game.module.organism.PlayerInfo;
import com.mrzhou.game.view.common.BackgroundPanel;
import com.mrzhou.game.view.common.SingletonFrame;
import com.mrzhou.game.view.panel.FightPanel;
import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Data
public class FirMapBuilder extends MapBuilder {
    private BackgroundPanel floorPanel;
    private int[][] npcArr = new int[20][2];
    final int UNIT = 60;

    private FirstNpc firstNpc;
    private Map<String, Npc> npcMap;

    public FirMapBuilder() {
        firstNpc = new FirstNpc();
        npcMap = new HashMap<>();
    }

    @Override
    public void buildBg() {
        Image backImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/choose_bg4.jpg"));
        ImageIcon backIcon = new ImageIcon(backImg);
        BackgroundPanel panel = new BackgroundPanel(backIcon.getImage());
        panel.setBounds(0,0,backIcon.getIconWidth(),backIcon.getIconHeight());
        panel.setLayout(null);
        mapPanel.setBg(panel);
    }

    @Override
    public void buildBackground() {
        Image backgroundImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/background/battle_bg.jpg"));
        ImageIcon backgroundIcon = new ImageIcon(backgroundImg);
        BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundIcon.getImage());
        backgroundPanel.setBounds(0,0,backgroundIcon.getIconWidth(),backgroundIcon.getIconHeight());
        backgroundPanel.setLayout(null);
        mapPanel.setBackground(backgroundPanel);
    }

    @Override
    public void buildFloor() {
        Image floorImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/map/battle_floor.PNG"));
        ImageIcon floorIcon = new ImageIcon(floorImg);
        floorPanel = new BackgroundPanel(floorIcon.getImage());
        floorPanel.setBounds(0,160,floorIcon.getIconWidth(),floorIcon.getIconHeight());
        floorPanel.setLayout(null);

        floorPanel.setFocusable(true);
        floorPanel.requestFocus();
        floorPanel.setVisible(true);

//        floorPanel.setBounds(0,160,1200,540);
//        floorPanel.setBackground(Color.RED);
//        floorPanel.setLayout(null);
//        //插入格子
//        for(int i=0;i<20;i++) {
//            for (int j=0;j<9;j++) {
//                JLabel label = new JLabel();
//                Image gridImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/map/grid_2.jpg"));
//                ImageIcon gridIcon = new ImageIcon(gridImg);
//                label.setIcon(gridIcon);
//                label.setBounds(i * 60, j*60, 60, 60);
//                floorPanel.add(label);
//            }
//        }
    }

    @Override
    public void buildPlayer() {
        //产生角色
        JButton buttonPlayer = new JButton();
        PlayerInfo player = Player.getInstance().obtainPlayerInfo();
        Image playerImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/npc/"+ player.getHero().getImg()));
        ImageIcon playerIcon = new ImageIcon(playerImg);
        buttonPlayer.setIcon(playerIcon);
        buttonPlayer.setBounds(0, 0, UNIT, UNIT);
        buttonPlayer.setContentAreaFilled(false);
        buttonPlayer.setBorderPainted(false);
        buttonPlayer.setFocusable(true);
        buttonPlayer.requestFocus();
        floorPanel.add(buttonPlayer);
        //绑定键盘监听
        KeyAdapter k1 = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("已经按下键盘了");
                JButton button = (JButton)e.getSource();

                if(e.getKeyCode()==e.VK_UP||e.getKeyCode()==e.VK_W){
                    button.setBounds(button.getX(),button.getY()-UNIT,UNIT,UNIT);
                }else if (e.getKeyCode()==e.VK_DOWN||e.getKeyCode()==e.VK_S){
                    button.setBounds(button.getX(),button.getY()+UNIT,UNIT,UNIT);
                }else if (e.getKeyCode()==e.VK_LEFT||e.getKeyCode()==e.VK_A){
                    button.setBounds(button.getX()-UNIT,button.getY(),UNIT,UNIT);
                }else if (e.getKeyCode()==e.VK_RIGHT||e.getKeyCode()==e.VK_D){
                    button.setBounds(button.getX()+UNIT,button.getY(),UNIT,UNIT);
                }

                //判断是否开始战斗
                int[][] NPCArr = mapPanel.getNpcArr();
                int left = button.getX()-60;
                int right = button.getX()/ UNIT + 1;
//                int up = button.getY()-60;
//                int down = button.getY()+60;
                String rightKey = right + "-" + (button.getY() / UNIT);
                if(npcMap.containsKey(rightKey)){
                    System.out.println("左边有敌人，开始战斗");
                    //跳转至战斗界面
                    FightPanel battlePanel = new FightPanel(mapPanel, npcMap.get(rightKey));
                    SingletonFrame frame = SingletonFrame.getInstance();
                    frame.nextPanel(battlePanel.getPanel());
//                    NPCArr[i][0] = 255;
//                    NPCArr[i][1] = 255;
                    searchNPC(floorPanel,rightKey);
                }
//                for(int i=0; i<10; i++){
//                    int npcX = NPCArr[i][0]*UNIT;
//                    int npcY = NPCArr[i][1]*UNIT;
//                    if(npcX == left && npcY == button.getY()){
//                        System.out.println("左边有敌人，开始战斗");
//                        //跳转至战斗界面
//                        FightPanel battlePanel = new FightPanel();
//                        SingletonFrame frame = SingletonFrame.getInstance();
//                        frame.nextPanel(battlePanel.getPanel());
//                        //
//                        NPCArr[i][0] = 255;
//                        NPCArr[i][1] = 255;
//                        searchNPC(floorPanel,(i+""));
//                    }else if(npcX == right && npcY == button.getY()){
//                        System.out.println("右边有敌人，开始战斗");
//                        FightPanel battlePanel = new FightPanel();
//                        SingletonFrame frame = SingletonFrame.getInstance();
//                        frame.nextPanel(battlePanel.getPanel());
//                        //跳转至战斗界面
//                        NPCArr[i][0] = 255;
//                        NPCArr[i][1] = 255;
//                        searchNPC(floorPanel,(i+""));
//                    }
//                    else if(npcX == button.getX() && npcY == up){
//                        System.out.println("上边有敌人，开始战斗");
//                        NPCArr[i][0] = 255;
//                        NPCArr[i][1] = 255;
//                        searchNPC(floorPanel,(i+""));
//                        System.out.println("敌人死了");
//                        System.out.println("战斗结束！");
//                    }else if(npcX == button.getX() && npcY == down){
//                        System.out.println("下边有敌人，开始战斗");
//                        NPCArr[i][0] = 255;
//                        NPCArr[i][1] = 255;
//                        searchNPC(floorPanel,(i+""));
//                        System.out.println("敌人死了");
//                        System.out.println("战斗结束！");
//                    }
//                }
            }
        };
        buttonPlayer.addKeyListener(k1);
//        mapPanel.getBg().addKeyListener(k1);
    }

    @Override
    public void buildNPC() {
        //产生Npc
        List<Npc> npcList = firstNpc.getNpcList();
        int i = 0;
        Random random = new Random();
        for(Npc npc : npcList){
            int randomX = random.nextInt(16) + 1;
            int randomY = random.nextInt(6) + 1;
            npcArr[i][0] = randomX;
            npcArr[i][1] = randomY;
            String key;
            i++;

            JLabel label = new JLabel();
            Image npcImg = Toolkit.getDefaultToolkit().getImage(getClass().getResource(npc.getImg()));
            ImageIcon npcIcon = new ImageIcon(npcImg);
            label.setIcon(npcIcon);
            if(npc.getLevel() == 1) {
                label.setBounds(randomX * UNIT, randomY * UNIT, UNIT, UNIT);
                key = randomX + "-" + randomY;
            }else{
                label.setBounds(randomX * UNIT, randomY * UNIT, 2*UNIT, 3*UNIT);
                key = randomX + "-" + (randomY + 2);
            }
            label.setName(key);
            npcMap.put(key, npc);
            floorPanel.add(label);

        }
        mapPanel.setNpcArr(this.npcArr);
        mapPanel.setFloor(floorPanel);


    }

    @Override
    public void buildObstacle() {

    }

    //获取需要的组件
    public void searchNPC(JPanel panel,String name){
        int count = panel.getComponentCount();
        for(int i=0;i<count;i++){
            Component comp = panel.getComponent(i);
            if(comp instanceof JLabel){
                String compName = comp.getName();
                if(compName.equals(name)){
//                    remove会报错，设置为不可见
//                    panel.remove(comp);
                    comp.setVisible(false);
                    System.out.println("移除了"+name);
                }
            }
        }
    }
}
