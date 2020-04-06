import java.util.HashMap;
import java.util.HashSet;

public class Attendance implements AttendanceInterface  {
	HashMap<String, String> attendanceList;
	HashSet<String> printList;
	
	public Attendance() {
		attendanceList = new HashMap <String, String>();
		printList = new HashSet<String>();
	}
	
	public void markAttendance(String ID) {
		if(attendanceList.containsKey(ID))
			printList.add(attendanceList.get(ID));
		else
			System.out.println("ID " + ID + " is not in the class list. Talk to admin to add your ID to the class List");
	}


	public void checkAttendance() {
	
		printList.forEach(System.out::println);
		printList.clear();
	}


	public void add(String name, String ID) {
		if(ID.length() == 6)
			attendanceList.put(ID,name);
		else
			System.out.println("Invalid ID. Try again");
	}

	
	public void remove(String ID) {
		if(attendanceList.containsKey(ID))
			attendanceList.remove(ID);
		else
			System.out.println("Cannot Remove.Invalid ID. Try again");
	}
}