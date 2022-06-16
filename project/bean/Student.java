package project.bean;

import java.util.Date;

public class Student {

	private int studentID;
	private String studentAname;
	private String studentEname;
	private String studentPhoneNo;
	private Date studentBirthDate;
	private char studentSex;
	private String studentEmail;
	private double studentFinalAverage;
	private double studentMaxAverage;
	private int studentRate;
	private int studentGradeYear;
	private int studentGradeSum;
	private University studentUniversity;
	private Program studentProgram;

	public Student() {
		// default constructor.
	}

	public Student(int studentID, String studentEname, String studentPhoneNo) {
		this.studentID = studentID;
		this.studentEname = studentEname;
		this.studentPhoneNo = studentPhoneNo;
	}

	// setters & getters.
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentAname() {
		return studentAname;
	}

	public void setStudentAname(String studentAname) {
		this.studentAname = studentAname;
	}

	public String getStudentEname() {
		return studentEname;
	}

	public void setStudentEname(String studentEname) {
		this.studentEname = studentEname;
	}

	public String getStudentPhoneNo() {
		return studentPhoneNo;
	}

	public void setStudentPhoneNo(String studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}

	public Date getStudentBirthDate() {
		return studentBirthDate;
	}

	public void setStudentBirthDate(Date studentBirthDate) {
		this.studentBirthDate = studentBirthDate;
	}

	public char getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(char studentSex) {
		this.studentSex = studentSex;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public double getStudentFinalAverage() {
		return studentFinalAverage;
	}

	public void setStudentFinalAverage(double studentFinalAverage) {
		this.studentFinalAverage = studentFinalAverage;
	}

	public double getStudentMaxAverage() {
		return studentMaxAverage;
	}

	public void setStudentMaxAverage(double studentMaxAverage) {
		this.studentMaxAverage = studentMaxAverage;
	}

	public int getStudentRate() {
		return studentRate;
	}

	public void setStudentRate(int studentRate) {
		this.studentRate = studentRate;
	}

	public int getStudentGradYear() {
		return studentGradeYear;
	}

	public void setStudentGradYear(int studentGradYear) {
		this.studentGradeYear = studentGradYear;
	}

	public int getStudentGradSum() {
		return studentGradeSum;
	}

	public void setStudentGradSum(int studentGradSum) {
		this.studentGradeSum = studentGradSum;
	}

	public University getStudentUni() {
		return studentUniversity;
	}

	public void setStudentUni(University studentUni) {
		this.studentUniversity = studentUni;
	}

	public Program getStudentProg() {
		return studentProgram;
	}

	public void setStudentProg(Program studentProg) {
		this.studentProgram = studentProg;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentAname=" + studentAname + ", studentEname=" + studentEname
				+ ", studentPhoneNo=" + studentPhoneNo + ", studentBirthDate=" + studentBirthDate + ", studentSex="
				+ studentSex + ", studentEmail=" + studentEmail + ", studentFinalAverage=" + studentFinalAverage
				+ ", studentMaxAverage=" + studentMaxAverage + ", studentRate=" + studentRate + ", studentGradYear="
				+ studentGradeYear + ", studentGradSum=" + studentGradeSum + ", studentUni=" + studentUniversity
				+ ", studentProg=" + studentProgram + "]";
	}

}
