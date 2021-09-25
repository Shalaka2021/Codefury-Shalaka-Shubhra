package com.hsbc.meets.service;

import java.util.Calendar;
import java.util.List;

import com.hsbc.meets.entity.MeetingRoom;
import com.hsbc.meets.entity.User;

public interface MeetingService {

	void setMeetingBookingInformationInLocalObject(String title, Calendar cal1, Calendar cal2, int duration,
			String meettype);

	List<User> getAllUsers();

	boolean setAttendeesList(List<User> attendees);

	List<MeetingRoom> getAllAvailableMeetingRooms();


}
