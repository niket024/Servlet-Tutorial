package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/AsyncLongRunningServlet", asyncSupported = true)
public class AsyncLongRunningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("LongRunningServlet Start::Name=" + Thread.currentThread().getName() + "::ID="
				+ Thread.currentThread().getId());

		final int secs = 10000;
		AsyncContext asyncContext = request.startAsync();
		asyncContext.start(() -> {
			longProcessing(secs);

			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e) {
				e.printStackTrace();
			}
			long endTime = System.currentTimeMillis();
			out.write("Processing done for " + secs + " milliseconds!!");
			System.out.println("LongRunningServlet Start::Name=" + Thread.currentThread().getName() + "::ID="
					+ Thread.currentThread().getId() + "::Time Taken=" + (endTime - startTime) + " ms.");
			asyncContext.complete();
		});

	}

	private void longProcessing(int secs) {
		try {
			Thread.sleep(secs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}