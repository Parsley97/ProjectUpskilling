package project.bean;

public class Program {
	private int programID;
	private String programAname;
	private String programEname;
	private School schoolID;

	public Program() {
		// default constructor.
	}

	public Program(int programID, String programEname) {
		this.programID = programID;
		this.programEname = programEname;
	}

	// setters & getters.
	public School getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(School schoolID) {
		this.schoolID = schoolID;
	}

	public int getProgramID() {
		return programID;
	}

	public void setProgramID(int programID) {
		this.programID = programID;
	}

	public String getProgramAname() {
		return programAname;
	}

	public void setProgramAname(String programAname) {
		this.programAname = programAname;
	}

	public String getProgramEname() {
		return programEname;
	}

	public void setProgramEname(String programEname) {
		this.programEname = programEname;
	}

	@Override
	public String toString() {
		return "Program [schoolID=" + schoolID + ", programID=" + programID + ", programEname=" + programEname + "]";
	}
}
