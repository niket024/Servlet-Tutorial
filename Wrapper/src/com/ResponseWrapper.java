package com;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class ResponseWrapper extends HttpServletResponseWrapper
{
	public ResponseWrapper(HttpServletResponse res)
	{
		super(res);
	}

	@Override
	public void setContentType(String type)
	{
		super.setContentType("application/msword");
	}
}
