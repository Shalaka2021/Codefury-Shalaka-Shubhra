<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Welcome manager</h1>
	<h3>Enter meeting details</h3>
	<form action="SelectMeetingRoomController" >
	hello selectmeeting room .jsp
	<input type="submit">
	</form>
	
	<table>
	
	<tr>
	<td>Room name</td>
	<td>Room capacity</td>
	<td>Room perhourcost</td>
	<td>Room rating</td>
	<td>Room number of feedbacks</td>
	</tr>
	
	<%for(int i=0;i<arr.lenth();i++){
	%>
		
	
	<%} %>
	
	<c:forEach items="${ array}" var="i" >
	<tr>
		<td>${i }</td>
		
		
	</tr>
	</c:forEach>
	
	<c:forEach items="${ MeetingRoomList}" var="room" >
	<tr>
		<td>${room.meetingRoomName }</td>
		<td>${room.seatingCapacity }</td>
		<td>${room.creditsPerHour }</td>
		<td>${room.rating }</td>
		
	</tr>
	</c:forEach>
	
	<c:forEach var="room" items="${ MeetingRoomList}">
	<tr>
		<td><c:out value="${room.meetingRoomName }" /></td>
		<td><c:out value="${room.seatingCapacity }" /></td>
		<td><c:out value="${room.creditsPerHour }" /></td>
		<td><c:out value="${room.rating }" /></td>
		
	</tr>
	</c:forEach>
	
	
	
	</table>
</center>
</body>
</html>