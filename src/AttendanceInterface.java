
public interface AttendanceInterface {
	
	public void markAttendance(String ID);// takes ID as argument and marks attendance for that student
	
	public void checkAttendance();// Prints list of people that were present today. Resets the attendance list
	
	public void add(String name, String ID); // Adds a new student to the class so that he can mark attendance
	
	public void remove(String ID); // Removes a student from the list
	
	

}
