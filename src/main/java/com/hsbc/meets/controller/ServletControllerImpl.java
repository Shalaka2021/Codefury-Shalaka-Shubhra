package com.hsbc.meets.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletControllerImpl extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String title;
		String date;
		String starttime;
		String duration;
		String meettype;
		
		title=req.getParameter("title");
		date=req.getParameter("date");
		starttime=req.getParameter("time");
		duration=req.getParameter("duration");
		meettype=req.getParameter("meettype");
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>hello world</body></html>");
	}
}
