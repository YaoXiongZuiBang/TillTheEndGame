package com.mrzhou.game.view.common;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
	Image image;

	public BackgroundPanel(Image image) {
		this.image = image;
		this.setOpaque(true);
	}

	//Draw the back ground.
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

