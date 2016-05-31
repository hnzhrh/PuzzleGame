package com.hnzhrh;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements MouseListener
{
	private static final int butCenterX=(800-150)/2;
	private static final int butVerticalGap=40;
	private static final int firstButY=(500-(40*4+3*butVerticalGap))/2;
	private static BackgroundPanel contentPanel;
	private static MainFrameButton startGameBut=new MainFrameButton("开始游戏");
	private static MainFrameButton musicBut=new MainFrameButton("音乐开关");
	private static MainFrameButton aboutBut=new MainFrameButton("关于我们");
	private static MainFrameButton exitBut=new MainFrameButton("退出");
	public MainFrame()
	{
		//super();
		contentPanel=new BackgroundPanel();
		this.setContentPane(contentPanel);
		this.setSize(800, 500);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		startGameBut.setLocation(butCenterX, firstButY);
		musicBut.setLocation(butCenterX, firstButY+MainFrameButton.butHeight*1+butVerticalGap*1);
		aboutBut.setLocation(butCenterX, firstButY+MainFrameButton.butHeight*2+butVerticalGap*2);
		exitBut.setLocation(butCenterX, firstButY+MainFrameButton.butHeight*3+butVerticalGap*3);
		contentPanel.add(startGameBut);
		contentPanel.add(musicBut);
		contentPanel.add(aboutBut);
		contentPanel.add(exitBut);
		startGameBut.addMouseListener(this);
		musicBut.addMouseListener(this);
		aboutBut.addMouseListener(this);
		exitBut.addMouseListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource()==startGameBut)
		{
			
		}
		else if(e.getSource()==musicBut)
		{
			
		}
		else if(e.getSource()==aboutBut)
		{
			
		}
		else if(e.getSource()==exitBut)
		{
			
			System.exit(0);
		}
		else
		{
			
		}
	}
	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}
