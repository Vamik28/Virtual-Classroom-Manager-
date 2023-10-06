public class Assignment {
	public String Name, Description;
	public boolean Status = false;

	public Assignment(String Name, String Description) {
		this.Name = Name;
		this.Description = Description;
	}

	public String getName() {
		return Name;
	}

	public String getDescription() {
		return Description;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public void AssignmentSubmission() {

		Status = true;
	}

	public boolean isStatus() {
		return Status;
	}

}
