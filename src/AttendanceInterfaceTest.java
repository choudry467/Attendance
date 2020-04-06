import org.junit.Before;
import org.junit.Test;

public class AttendanceInterfaceTest {
	Attendance class1;
	
	@Before
	public void setup() {
		class1 = new Attendance();
		class1.add("Choudry", "742371");
		class1.add("Brisa", "745471");
		class1.add("Fazil", "745234");
	}
	
	@Test
	public void maintest() {
		class1.markAttendance("742371");
		class1.checkAttendance();
	}

	@Test
	public void testAdd() {
		class1.add("Invalid", "adfaf");
	}
	
	@Test
	public void testMarkAttendance() {
		class1.markAttendance("742372");
	}
	
	@Test
	public void testRemove() {
		class1.remove("742372");
		class1.remove("742371");
		class1.markAttendance("742371");
		class1.markAttendance("745471");
		class1.checkAttendance();
	}
}
