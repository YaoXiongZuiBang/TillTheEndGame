package com.mrzhou.game.view.panel;

import com.mrzhou.game.view.builder.FirMapBuilder;
import com.mrzhou.game.view.builder.MapBuilder;
import com.mrzhou.game.view.builder.MapDirector;
import com.mrzhou.game.view.builder.MapPanel;
import com.mrzhou.game.view.common.BackgroundPanel;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BattlePanel {
    MapBuilder firMapBuilder = new FirMapBuilder();
    MapDirector director = new MapDirector(firMapBuilder);
    MapPanel mapPanel = director.construct();
    BackgroundPanel bgPanel = mapPanel.getBg();
    JPanel backgroundPanel = mapPanel.getBackground();
    JPanel floorPanel = mapPanel.getFloor();

    public BattlePanel(){
        bgPanel.add(backgroundPanel);
        bgPanel.add(floorPanel);

    }
    public BackgroundPanel getBgPanel(){
        return bgPanel;
    }
}
