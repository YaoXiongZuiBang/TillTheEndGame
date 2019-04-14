package com.mrzhou.game.view.handler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowEquipHandler extends MouseAdapter {
    private JPanel panel;
    private String itemName;
    private String itemAttr;
    private String image;
    private String showImage;
    private JLabel nameLabel;
    private JLabel attrLabel;
    public ShowEquipHandler(JPanel panel,String itemName, String itemAttr,String image,String showImage,JLabel nameLabel,JLabel attrLabel){
        this.panel = panel;
        this.itemName = itemName;
        this.itemAttr = itemAttr;
        this.image = image;
        this.showImage = showImage;
        this.nameLabel = nameLabel;
        this.attrLabel = attrLabel;
    }
//    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        System.out.println("OK,choose it.");
        nameLabel.setText(itemName);
        attrLabel.setText(itemAttr);
        showImage = image;
    }
}
