package com.mrzhou.game.view.builder;

import com.mrzhou.game.view.common.BackgroundPanel;
import lombok.Data;

import javax.swing.*;

@Data
public class MapPanel {
    private BackgroundPanel bg;
    private JPanel background;
    private JPanel floor;
    private JPanel obstacle;
    private int[][] npcArr;
}
