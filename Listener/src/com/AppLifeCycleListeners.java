package com;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppLifeCycleListeners implements ServletContextListener
{
	@Override
	public void contextInitialized(ServletContextEvent arg0)
	{
		System.out.println("context-initialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0)
	{
		System.out.println("context-destroyed ");

	}
}
