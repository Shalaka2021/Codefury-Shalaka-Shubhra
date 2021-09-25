package com.hsbc.meets.service.impl;

import java.util.Calendar;
import java.util.List;

import com.hsbc.meets.entity.MeetingRoom;
import com.hsbc.meets.entity.User;
import com.hsbc.meets.service.MeetingService;

public class MeetingServiceImpl implements MeetingService {

	@Override
	public void setMeetingBookingInformationInLocalObject(String title, Calendar cal1, Calendar cal2, int duration,
			String meettype) {
		// TODO Auto-generated method stub
		
	}

	
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean setAttendeesList(List<User> attendees) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<MeetingRoom> getAllAvailableMeetingRooms() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean setBookedMeetingRoom(MeetingRoom meetingRoom) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int bookMeeting() {
		// TODO Auto-generated method stub
		return 0;
	}

}
