package com.nik;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Person implements HttpSessionBindingListener
{
	@Override
	public void valueBound(HttpSessionBindingEvent arg0)
	{
		System.out.println("valueBound");

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0)
	{
		System.out.println("valueUnbound");

	}
}
