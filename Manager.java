import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	static Manager vcm = new Manager();
	private ArrayList<Classroom> ClassroomList = new ArrayList<Classroom>();
	private ArrayList<Assignment> AssignmentList = new ArrayList<Assignment>();
	private ArrayList<Student> studentList = new ArrayList<Student>();

	private Manager() {

	}

	public static Manager getInstance() {
		return vcm;
	}

	public void addClassroom(String Name) {
		ClassroomList.add(new Classroom(Name));
	}

	public void listClassroom() {

		for (Classroom c : ClassroomList) {
			System.out.println(c.getName());
		}
	}

	public void removeClassroom(String Name) {
		for (int i = 0; i < ClassroomList.size(); i++) {
			if (ClassroomList.get(i).getName().equals(Name)) {

				ClassroomList.remove(i);
			}
		}
	}

	public void addStudent(String className, String ID, String Name) {
		for (int i = 0; i < ClassroomList.size(); i++) {
			if (ClassroomList.get(i).getName().equals(className)) {
				Student s = new Student(ID, Name);
				studentList.add(s);
				ClassroomList.get(i).addStudent(s);

			}
		}
	}

	public void listStudent(String className) {
		for (int i = 0; i < ClassroomList.size(); i++) {
			if (ClassroomList.get(i).getName().equals(className)) {
				ClassroomList.get(i).listStudent();

			}
		}
	}

	public void removeStudent(String Name, String ID) {
		for (int i = 0; i < ClassroomList.size(); i++) {
			if (ClassroomList.get(i).getName().equals(Name)) {
				ClassroomList.get(i).removeStudent(ID);
			}
		}
	}

	public void addAssignment(String ClassName, String Name, String Description) {
		for (int i = 0; i < ClassroomList.size(); i++) {
			if (ClassroomList.get(i).getName().equals(ClassName)) {
				ClassroomList.get(i).addAssignment(Name, Description);
			}
		}
	}

	public void submitAssignment(String ClassName, String Name, String Description) {
		for (int i = 0; i < ClassroomList.size(); i++) {
			if (ClassroomList.get(i).getName().equals(ClassName)) {
				ClassroomList.get(i).addAssignment(Name, Description);
			}
		}
	}

	public ArrayList<Student> getStudentList() {
		return this.studentList;
	}

}
