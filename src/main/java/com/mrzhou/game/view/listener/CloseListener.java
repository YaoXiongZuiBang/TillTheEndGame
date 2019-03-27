package com.mrzhou.game.view.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 关闭按钮监听
 */
public class CloseListener implements MouseListener{
	JButton listeningButon=new JButton();//指定需要监听的按钮
	ImageIcon firstImageIcon;//未点击时的图片
	ImageIcon enteredImageIcon;//鼠标放在按钮上时的图片
	JFrame frame;//监听的Frame
	/**
	 * 接收传入的图片
	 * @param listeningButon
	 * @param firstImage   初始图片
	 * @param enteredImage 替换图片
	 */
	public CloseListener(JButton listeningButon,JFrame frame,Image firstImage,Image enteredImage){
		this.listeningButon=listeningButon;
		ImageIcon firstImageIcon=new ImageIcon(firstImage);
		ImageIcon enteredImageIcon=new ImageIcon(enteredImage);
		this.firstImageIcon=firstImageIcon;
		this.enteredImageIcon=enteredImageIcon;
		this.frame=frame;
	}
    
    /**
     * 鼠标进入按钮
     */
	public void mouseEntered(MouseEvent arg0) {
		listeningButon.setIcon(enteredImageIcon);//鼠标进入按钮时换图片
	}
    /**
     * 鼠标离开按钮
     */
	public void mouseExited(MouseEvent arg0) {
		listeningButon.setIcon(firstImageIcon);//鼠标离开按钮时换回原来的图片
	}
    /**
     * 鼠标点击一次
     */
	public void mousePressed(MouseEvent arg0) {
		System.exit(0);
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	/**
     * 鼠标已点击按钮
     */
	public void mouseClicked(MouseEvent arg0) {
	}
}
