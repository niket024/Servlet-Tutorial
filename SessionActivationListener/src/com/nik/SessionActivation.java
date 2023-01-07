package com.nik;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class SessionActivation implements HttpSessionActivationListener
{
@Override
public void sessionDidActivate(HttpSessionEvent arg0)
{
	System.out.println("sessionDidActivate");
	
}
@Override
	public void sessionWillPassivate(HttpSessionEvent arg0)
	{
		System.out.println("sessionWillPassivate");
		
	}
}
