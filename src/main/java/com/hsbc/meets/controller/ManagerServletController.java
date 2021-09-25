package com.hsbc.meets.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.meets.entity.Meeting;
import com.hsbc.meets.service.MeetingService;
import com.hsbc.meets.service.impl.MeetingServiceImpl;


/**
 * @author shalaka
 *
 */

@WebServlet("/ManagerServletController")
public class ManagerServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MeetingService ms;
	private Meeting m;
	
	public ManagerServletController() {
		ms=new  MeetingServiceImpl();
		m=new Meeting();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.getWriter().append("Served at: ").append(req.getContextPath());
		
		String action=req.getServletPath();
		
//		if(action.equals("/"))
		
		String title;
		String sdate;
		String stime;
		String etime;
		int duration;
		String meettype;
		
		
		title=req.getParameter("title");
		sdate=req.getParameter("date");
		stime=req.getParameter("stime");
		etime=req.getParameter("etime");
		duration=Integer.parseInt(req.getParameter("duration"));
		meettype=req.getParameter("meettype");
		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
		Date x=null;
		Date y = null;
		try {
			x=(Date)formatter.parse(stime);
			y = (Date)formatter.parse(etime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar cal1=null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
		Date date1=null;
		try {
			date1 = sdf.parse(stime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cal1 = Calendar.getInstance();
		cal1.setTime(date1);
		
		
		
		DateFormat formatter2 ;
		Date date2 = null ; 
		formatter2 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm"); 
		try {
			date2 = (Date)formatter2.parse(etime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal2=Calendar.getInstance();
		cal2.setTime(date2);
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>helloooooo!!!!!!!!! ooooo world!!!!!!!<br>"+action+"<br>"+cal1+"<br>"+cal2+"<br>"+title+"<br>"+" <br>"+x+"<br>"+y+" <br>"+duration+" <br>"+meettype+" <br>"+"<br>"+ "MeetBookController</body></html>");		
		
		// 1 st
		
		m.setMeetingTitle(title);
		m.setStartDateTime(cal1);
		m.setEndDateTime(cal2);
		m.setDurationInMinuts(duration);
		m.setMeetingType(meettype);
		
		req.getSession().setAttribute("meetingobject", m);
		RequestDispatcher rd = req.getRequestDispatcher("SelectMeetingRoomController");
		rd.forward(req,res);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
