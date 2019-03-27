package com.mrzhou.game.view.common;


import com.mrzhou.game.view.listener.ChangePictrueListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class ButtonFactory {
	/**
	 * 创建一个新按钮
	 * 
	 * @param img
	 *            能得到初始图片的路径
	 * @param leftPlaceX
	 *            左上角x坐标
	 * @param leftPlaceY
	 *            左上角y坐标
	 * @param width
	 *            宽
	 * @param height
	 *            高
	 * @return
	 */
	public static JButton makeButton(Image img, int leftPlaceX, int leftPlaceY) {
		// 设置初始图片
		ImageIcon firstImageIcon = new ImageIcon(img);
		JButton newButton = new JButton(firstImageIcon);
		// 设置图片左上角和右下角坐标
		newButton.setBounds(leftPlaceX, leftPlaceY, firstImageIcon.getIconWidth(), firstImageIcon.getIconHeight());
		// 按钮透明
		newButton.setOpaque(false);
		newButton.setContentAreaFilled(false);
		// 去掉按钮边框
		newButton.setBorderPainted(false);
		// 设置凸起来的按钮
		// newButton.setBorder(BorderFactory.createRaisedBevelBorder());
		return newButton;
	}

	public static JButton makeButton(Image firstImg, Image enteredImg, int leftPlaceX, int leftPlaceY, int width, int height) {
		// 设置初始图片
		ImageIcon firstImageIcon = new ImageIcon(firstImg);
		JButton newButton = new JButton(firstImageIcon);
		//设置换图片监听
		MouseListener changePictureListener=new ChangePictrueListener(newButton, firstImg, enteredImg);
		newButton.addMouseListener(changePictureListener);
		// 设置图片左上角和右下角坐标
		newButton.setBounds(leftPlaceX, leftPlaceY, width, height);
		// 按钮透明
		newButton.setContentAreaFilled(false);
		// 去掉按钮边框
		newButton.setBorderPainted(false);
		
		return newButton;
	}
}
