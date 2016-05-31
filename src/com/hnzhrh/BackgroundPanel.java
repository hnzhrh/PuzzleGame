package com.hnzhrh;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel
{
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon icon=new ImageIcon("Image" + File.separator + "Background.jpg");
		Image image=icon.getImage();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		
	}
}
