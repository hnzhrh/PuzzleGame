package com.hnzhrh;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Launcher
{

	public static void main(String[] args)
	{
		//new MainFrame();
		Desktop desktop=Desktop.getDesktop();
		URI uri;
		try
		{
			uri = new URI("http://www.baidu.com");
			desktop.browse(uri);
		} catch (URISyntaxException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
