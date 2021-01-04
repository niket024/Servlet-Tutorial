package com.filter;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.service.Producer;

public class AsyncFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Request start Time in milliseconds: "+System.currentTimeMillis());
		System.out.println("filter start "+Thread.currentThread().getName());

		chain.doFilter(request, response);
		AsyncContext asyncContext = request.getAsyncContext();
		asyncContext.start(() -> {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Producer producer = new Producer();
			producer.sendMessage("I am from filter ");
			System.out.println("filter done:" +Thread.currentThread().getName());

		});
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
