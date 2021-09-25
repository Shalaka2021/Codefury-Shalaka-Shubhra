package com.hsbc.meets.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.meets.entity.Meeting;
import com.hsbc.meets.entity.MeetingRoom;
import com.hsbc.meets.service.MeetingService;
import com.hsbc.meets.service.impl.MeetingServiceImpl;


/**
 * @author shalaka
 *
 */

@WebServlet("/SelectMeetingRoomController")
public class SelectMeetingRoomController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MeetingService ms;
	private Meeting m;
	
	public SelectMeetingRoomController() {
		ms=new  MeetingServiceImpl();
		m=new Meeting();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.getWriter().append("Served at: ").append(req.getContextPath());
		
		String action=req.getServletPath();
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>helloooooo!!!!!!!!! ooooo world!!!!!!!<br>"+action+"<br>"+"MeetBookController</body></html>");		
		
		Meeting m= (Meeting)req.getSession().getAttribute("meetingobject");
		String title=m.getMeetingTitle();
		
		out.println("<html><body>helloooooo!!!!!!!!! ooooo world!!!!!!!<br>"+action+"<br>"+title+"<br>"+"MeetBookController</body></html>");		

//		req.getSession().setAttribute("meetingobject", m);
		String name="gandhi";
		int capacity=10;
		List<String> amenit = new ArrayList<String>();
		int credits=2;
		float rating=4.5f;
		int nofeed=15;
		amenit.add("projector");
		amenit.add("cofee");
		
		String name1="def";
		int capacity1=20;
		List<String> amenit1 = new ArrayList<String>();
		int credits1=4;
		float rating1=5.0f;
		int nofeed1=30;
		amenit1.add("tea");
		amenit1.add("wifi");
		
		
		MeetingRoom mr1=new MeetingRoom(1,name,capacity,amenit,credits,rating,nofeed);
		MeetingRoom mr2=new MeetingRoom(2,name1,capacity1,amenit1,credits1,rating1,nofeed1);
		
		ArrayList<MeetingRoom> li = new ArrayList<MeetingRoom>();
		li.add(mr1);
		li.add(mr2);
		
//		Meeting m=new Meeting();
		for(MeetingRoom x: li) {
			out.println("<html><body>! This is room selection<br>"+x.getMeetingRoomName()+"<br>"+"MeetBookController</body></html>");	
		}
		
		
//		out.println("<html><body>! This is room selection<br>"+li[0].name+action+"<br>"+title+"<br>"+"MeetBookController</body></html>");		

		ArrayList<Integer> l=new ArrayList<Integer>();
		
//		ArrayList<MeetingRoom> li = new ArrayList<MeetingRoom>();
		req.setAttribute("MeetingRoomList", li);
		req.setAttribute("array", l);
		RequestDispatcher rd = req.getRequestDispatcher("SelectMeetingRoom.jsp");
		rd.forward(req,res);
		
		
		
		
//		if(action.equals("/"))
		
//		String title;
//		String sdate;
//		String stime;
//		String etime;
//		int duration;
//		String meettype;
//		
//		
//		title=req.getParameter("title");
//		sdate=req.getParameter("date");
//		stime=req.getParameter("stime");
//		etime=req.getParameter("etime");
//		duration=Integer.parseInt(req.getParameter("duration"));
//		meettype=req.getParameter("meettype");
//		
//		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
//		Date x=null;
//		Date y = null;
//		try {
//			x=(Date)formatter.parse(stime);
//			y = (Date)formatter.parse(etime);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Calendar cal1=null;
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
//		Date date1=null;
//		try {
//			date1 = sdf.parse(stime);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		cal1 = Calendar.getInstance();
//		cal1.setTime(date1);
//		
//		
//		
//		DateFormat formatter2 ;
//		Date date2 = null ; 
//		formatter2 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm"); 
//		try {
//			date2 = (Date)formatter2.parse(etime);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Calendar cal2=Calendar.getInstance();
//		cal2.setTime(date2);
//		
//		res.setContentType("text/html");
////		PrintWriter out=res.getWriter();
//		out.println("<html><body>helloooooo!!!!!!!!! ooooo world!!!!!!!<br>"+action+"<br>"+cal1+"<br>"+cal2+"<br>"+title+"<br>"+" <br>"+x+"<br>"+y+" <br>"+duration+" <br>"+meettype+" <br>"+"<br>"+ "MeetBookController</body></html>");		
//		
//		// 1 st
//		
//		m.setMeetingTitle(title);
//		m.setStartDateTime(cal1);
//		m.setEndDateTime(cal2);
//		m.setDurationInMinuts(duration);
//		m.setMeetingType(meettype);
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
