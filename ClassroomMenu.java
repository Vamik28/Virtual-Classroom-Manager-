import java.util.Scanner;

public class ClassroomMenu {
	public void getClassroomMenu() {
		while (true) {
			System.out.println("Enter 1 To add a Classroom");
			System.out.println("Enter 2 To list Classroom");
			System.out.println("Enter 3 To remove a Classroom");
			System.out.println("Enter 4 To add a Student in a Classroom");
			System.out.println("Enter 5 To list Students of a Classroom");
			System.out.println("Enter 6 To remove a Student from a Classroom");
			System.out.println("Enter 7 To Schedule an Assignment");
			System.out.println("Enter 8 To Submit an Assignment");
			System.out.println("Enter 9 To List all Assignment of a Student With Status");
			System.out.println("Enter 10 To Exit");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			Manager vm = Manager.getInstance();
			switch (number) {
			case 1:
				System.out.print("Enter name of Classroom :- ");
				String name = scanner.next();
				vm.addClassroom(name);
				System.out.println("Classroom " + name + " added Successfully");
				break;
			case 2:
				vm.listClassroom();
				break;
			case 3:
				System.out.println("Enter name of classroom that you want to remove from the following :-");
				vm.listClassroom();
				String name2 = scanner.next();
				vm.removeClassroom(name2);
				System.out.println("Classroom " + name2 + " Removed Successfully");
				break;
			case 4:
				System.out
						.println("Enter Name of a Class in which you want to add Student from the following classes:-");
				vm.listClassroom();
				String className = scanner.next();
				System.out.print("Enter Student ID:- ");
				String ID = scanner.next();
				System.out.print("Enter Student Name:- ");
				String StudentName = scanner.next();
				vm.addStudent(className, ID, StudentName);
				System.out.println("Student " + StudentName + " added Successfully");
				break;
			case 5:
				System.out.println(
						"Enter Name of a Class in which you want to list Student from the following classes:- ");
				vm.listClassroom();
				String className2 = scanner.next();
				vm.listStudent(className2);
				break;
			case 6:
				System.out.println(
						"Enter Name of a Class in which you want to delete Student From The Following Classes:- ");
				vm.listClassroom();
				String className3 = scanner.next();
				System.out.print("Enter Student ID you want delete :- ");
				vm.listStudent(className3);
				String ID2 = scanner.next();
				vm.removeStudent(className3, ID2);
				System.out.println("Student remove Successfully :- ");
				break;
			case 7:
				System.out.println(
						"Enter Name of a Class in which you want to Assign an Assignment From The Following Classes :- ");
				vm.listClassroom();
				String className4 = scanner.next();
				System.out.print("Enter Assignment Name :- ");
				String AssignmentName = scanner.next();
				System.out.println("Enter Assignment Description  :- ");
				String AssignmentDescription = scanner.next();
				vm.addAssignment(className4, AssignmentName, AssignmentDescription);
				break;
			case 8:
				System.out.print("Enter Student ID for Whom You Want To Submit an Assignment From The Following  :- ");
				System.out.println("ID	Name");
				for (Student s : vm.getStudentList()) {
					System.out.println(s.getID() + " " + s.getName());
				}
				String ID3 = scanner.next();
				for (Student s : vm.getStudentList()) {
					if (s.getID().equals(ID3)) {
						s.listAssignment();
						System.out.print("Enter Name Of Assignment To Submit :- ");
						String AN = scanner.next();
						s.SubmitAssignmet(AN);

					}
				}
				break;
			case 9:
				System.out.println("Enter Student ID for Whom You Want To See Assignment Status :- ");
				System.out.println("ID	Name");
				for (Student s : vm.getStudentList()) {
					System.out.println(s.getID() + " " + s.getName());
				}
				String ID4 = scanner.next();
				for (Student s : vm.getStudentList()) {
					if (s.getID().equals(ID4)) {
						s.listAssignmentWithStatus();

					}
				}
				break;
			case 10:
				System.exit(0);
			default:
				System.out.println("Please Select a Number from 1 to 10");

			}
		}
	}

}
