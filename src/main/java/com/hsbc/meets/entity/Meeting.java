package com.hsbc.meets.entity;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Meeting {
	private int meetingId;
	private String meetingTitle;
	private Calendar startDateTime;
	private Calendar endDateTime;
	private int durationInMinuts;
	private String meetingType;
//	private List<User> attendees;
//	private MeetingRoom meetingRoom;
	
	
	public int getMeetingId() {
		return meetingId;
	}
//	public void setMeetingId(int meetingId) {
//		this.meetingId = meetingId;
//	}
	public String getMeetingTitle() {
		return meetingTitle;
	}
	public void setMeetingTitle(String meetingTitle) {
		this.meetingTitle = meetingTitle;
	}
	public Calendar getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Calendar cal1) {
		this.startDateTime = cal1;
	}
	public Calendar getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Calendar cal2) {
		this.endDateTime = cal2;
	}
	public int getDurationInMinuts() {
		return durationInMinuts;
	}
	public void setDurationInMinuts(int durationInMinuts) {
		this.durationInMinuts = durationInMinuts;
	}
	public String getMeetingType() {
		return meetingType;
	}
	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}
	

}
