package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LongRunningServlet")
public class LongRunningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("LongRunningServlet Start::Name=" + Thread.currentThread().getName() + "::ID="
				+ Thread.currentThread().getId());

		int secs = 10000;

		longProcessing(secs);

		PrintWriter out = response.getWriter();
		long endTime = System.currentTimeMillis();
		out.write("Processing done for " + secs + " milliseconds!!");
		System.out.println("LongRunningServlet Start::Name=" + Thread.currentThread().getName() + "::ID="
				+ Thread.currentThread().getId() + "::Time Taken=" + (endTime - startTime) + " ms.");
	}

	private void longProcessing(int secs) {
		try {
			Thread.sleep(secs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}