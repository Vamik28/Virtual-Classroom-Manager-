import java.util.ArrayList;

public class Student {
	private String Name, ID;
	private ArrayList<Assignment> AssignmentList = new ArrayList<Assignment>();

	public Student(String ID, String Name) {
		this.ID = ID;
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public String getID() {
		return ID;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void addAssignment(String Name, String Description) {
		Assignment A = new Assignment(Name, Description);
		AssignmentList.add(A);
	}

	public void listAssignment() {
		for (Assignment A : AssignmentList) {
			System.out.println(A.getName());
		}
	}

	public void listAssignmentWithStatus() {
		for (Assignment A : AssignmentList) {
			if (A.isStatus()) {
				System.out.println(A.getName() + "Submitted");
			} else {
				System.out.println(A.getName() + "Pending");
			}

		}
	}

	public void SubmitAssignmet(String Name) {
		for (Assignment A : AssignmentList) {
			if (A.getName().equals(Name)) {
				A.AssignmentSubmission();
			}
		}
	}

}
