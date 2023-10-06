import java.util.ArrayList;

public class Classroom {
	private String Name;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Assignment> AssignmentList = new ArrayList<Assignment>();

	public Classroom(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void addStudent(Student s) {
		studentList.add(s);
	}

	public void listStudent() {
		System.out.println("ID	Name");
		for (Student s : studentList) {
			System.out.println(s.getID() + " " + s.getName());
		}
	}

	public void removeStudent(String ID) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getID().equals(ID)) {
				studentList.remove(i);
			}
		}
	}

	public void addAssignment(String Name, String Description) {
		Assignment A = new Assignment(Name, Description);
		AssignmentList.add(A);
		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).addAssignment(Name, Description);
		}
	}
}
