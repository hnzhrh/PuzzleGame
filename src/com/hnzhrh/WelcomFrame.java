package com.hnzhrh;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * 欢迎界面
 * 
 */
public class WelcomFrame extends JFrame
{
	private static JPanel contentPanel=new JPanel();
	public WelcomFrame()
	{
		super();
		this.setContentPane(contentPanel);
		this.setUndecorated(true);
		contentPanel.setBackground(Color.BLACK);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
