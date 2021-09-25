package com.hsbc.meets.controller;

import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class abccon
 */
@WebServlet("/abccon")
public class abccon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		out.println("<html><body>hello!!!!!!!!! world!!!!!!!</body></html>");
	}

}
