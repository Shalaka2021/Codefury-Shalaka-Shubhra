package com.hsbc.meets.controller;

import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
//import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.meets.entity.Meeting;
import com.hsbc.meets.entity.MeetingRoom;
import com.hsbc.meets.entity.User;
import com.hsbc.meets.service.MeetingService;
import com.hsbc.meets.service.impl.MeetingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class abccon
 */


/**
 * @author shalaka
 *
 */
@WebServlet("/MeetBookController")
public class MeetBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MeetingService ms;
	
	public MeetBookController() {
		ms=new  MeetingServiceImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title;
//		
//		Time starttime;
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
		
//		Date date = null;
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			date=format.parse(sdate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
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
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
//		Date x;
//		x = dateFormat.parse(stime);
//		starttime=x.getHours();
//		Date starttime = null;
//		try {
//			starttime = dateFormat.parse(stime);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		duration=Integer.parseInt(req.getParameter("duration"));
//		meettype=req.getParameter("meettype");
		
//		System.out.println("kkkkkk");
		
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
		out.println("<html><body>hellooo!!!!!!!!! ooooo worlddddddddd!!!!!!!<br>"+cal1+"<br>"+cal2+"<br>"+title+"<br>"+" <br>"+x+"<br>"+y+" <br>"+duration+" <br>"+meettype+" <br>"+"<br>"+ "MeetBookController</body></html>");
//		out.println("aklshhjnojihb");
//		
		
		// 1 st
		Meeting m=new Meeting();
		m.setMeetingTitle(title);
//		m.setMeetingDate(date);
		m.setStartDateTime(cal1);
		m.setEndDateTime(cal2);
		m.setDurationInMinuts(duration);
		m.setMeetingType(meettype);
		
		ms.setMeetingBookingInformationInLocalObject(title,cal1,cal2,duration,meettype);
		
		
		//2nd method
		List<User> ll=new ArrayList<User>();
		
		ll=ms. getAllUsers();
		
		
		//3rd method
		List<User> attendees= new ArrayList<User>();
		boolean flag;
		flag= ms.setAttendeesList(attendees);
		
		//4th method
		List<MeetingRoom> rooms=new ArrayList<MeetingRoom>();
		rooms=ms.getAllAvailableMeetingRooms();
		
		//5th method
		boolean flag1;
		MeetingRoom meetingRoom = new MeetingRoom();
		flag1=ms.setBookedMeetingRoom(meetingRoom);
		
		int flag3;
		flag3=ms.bookMeeting();
		
		
			
	}

}
