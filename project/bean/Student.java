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
	private int studentGradYear;
	private int studentGradSum;
	private University studentUni;
	private Program studentProg;
	
	public Student() {
		// Default Constructor
	}
	
	public Student(int studentID, String studentEname, String studentPhoneNo) {
		this.studentID = studentID;
		this.studentEname = studentEname;
		this.studentPhoneNo = studentPhoneNo;
	}

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
		return studentGradYear;
	}

	public void setStudentGradYear(int studentGradYear) {
		this.studentGradYear = studentGradYear;
	}

	public int getStudentGradSum() {
		return studentGradSum;
	}

	public void setStudentGradSum(int studentGradSum) {
		this.studentGradSum = studentGradSum;
	}

	public University getStudentUni() {
		return studentUni;
	}

	public void setStudentUni(University studentUni) {
		this.studentUni = studentUni;
	}

	public Program getStudentProg() {
		return studentProg;
	}

	public void setStudentProg(Program studentProg) {
		this.studentProg = studentProg;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentAname=" + studentAname + ", studentEname=" + studentEname
				+ ", studentPhoneNo=" + studentPhoneNo + ", studentBirthDate=" + studentBirthDate + ", studentSex="
				+ studentSex + ", studentEmail=" + studentEmail + ", studentFinalAverage=" + studentFinalAverage
				+ ", studentMaxAverage=" + studentMaxAverage + ", studentRate=" + studentRate + ", studentGradYear="
				+ studentGradYear + ", studentGradSum=" + studentGradSum + ", studentUni=" + studentUni
				+ ", studentProg=" + studentProg + "]";
	}
	
}
