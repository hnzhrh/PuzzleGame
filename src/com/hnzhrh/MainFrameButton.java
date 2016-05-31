package com.hnzhrh;
import java.awt.Font;
import java.awt.Insets;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MainFrameButton extends JButton 
{
	public static final int butWidth=150;
	public static final int butHeight=40;
	public MainFrameButton(String s)
	{
		super(s);
		this.setFont(new Font("宋体", Font.BOLD, 20));
		this.setText(s);
		this.setHorizontalTextPosition(getX()/2);
		this.setVerticalTextPosition(getY()/2);
		this.setSize(butWidth, butHeight);
		setMargin(new Insets(0, 0, 0, 0));
		setContentAreaFilled(false);
		setBorderPainted(false);
		setIcon(new ImageIcon("Image" + File.separator +"butImag1.png"));
		setRolloverIcon(new ImageIcon("Image" + File.separator + "butImag2.png"));
		
		// TODO Auto-generated constructor stub
	}
}
