package project.bean;

public class StudentTrainingCourse {
	private Student studentID;
	private TrainingCourse trainingCourseID;
	private int priority;

	public StudentTrainingCourse() {
		// default constructor.
	}

	public StudentTrainingCourse(Student studentID, TrainingCourse trainingCourseID, int priority) {
		this.studentID = studentID;
		this.trainingCourseID = trainingCourseID;
		this.priority = priority;
	}

	// setters & getters.
	public Student getStudentID() {
		return studentID;
	}

	public void setStudentID(Student studentID) {
		this.studentID = studentID;
	}

	public TrainingCourse getTrainingCourseID() {
		return trainingCourseID;
	}

	public void setTrainingCourseID(TrainingCourse trainingCourseID) {
		this.trainingCourseID = trainingCourseID;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "StudentTrainingCourse [studentID=" + studentID + ", trainingCourseID=" + trainingCourseID
				+ ", priority=" + priority + "]";
	}

}
