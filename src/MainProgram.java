import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Attendance class1 = new Attendance();
		System.out.println("*** Welcome to the Class Attendance Program ***");
		String choice;
		int loop= 1;
		while (loop == 1) {
			System.out.println("Pick one of the Options from below");
			System.out.println("Type \"add\" to add a Student to database");
			System.out.println("Type \"remove\" to remove a Student to database");
			System.out.println("Type \"mark\" to mark student attendance");
			System.out.println("Type \"display\" to see the list of students that were present in the class");
			System.out.println("Type \"exit\" to Exit the Program");
			choice = input.nextLine();
			
			if (choice.equals("mark")) {
				System.out.println("Swipe Card. Read ID");
				String ID = input.nextLine();
				class1.markAttendance(ID);
			}
			else if (choice.equals("display")) {
				class1.checkAttendance();
				loop = 0;
			}
			else if (choice.equals("add")) {
				System.out.println("Enter ID and Name of the Student");
				String ID = input.nextLine();
				String name = input.nextLine();
				class1.add(name, ID);
			}
			else if (choice.equals("remove")) {
				System.out.println("Enter ID of Student you want to remove from the list");
				String ID = input.nextLine();
				class1.remove(ID);
			}
			
			else if (choice.equals("exit"))
				loop = 0;
			
			else
				System.out.println("Wrong Choice. Try Again");
		}

	}

}
