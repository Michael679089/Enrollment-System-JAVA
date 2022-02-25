package com.ciit.EnrollmentSystem;

public class Student extends User {
	
	//Variables
	protected int tempStudentID = 0;
	protected int studentID;
	protected int yearLevel;
	protected String course;

	//constructor
	public Student() {
		userName = "";
		birthDate[0] = 12;
		birthDate[1] = 31;
		birthDate[2] = 2000;
		userCreationDate = "";
		course = "";
		studentID = 0;
		yearLevel = 0;
	}
	
	public Student(String name, String date, String course, int birthDay, int birthMonth, int birthYear, int yearLevel, int studentID) {
		this.userName = name;
		this.userCreationDate = date;
		this.course = course;
		this.birthDate[0] = birthMonth;
		this.birthDate[1] = birthDay;
		this.birthDate[2] = birthYear;
		this.studentID = studentID;
		this.yearLevel = yearLevel;
		
	}
	
	
	
	
	
	
	//generic methods
	public void displayInfo() {
		System.out.println("JOB: Student");
		System.out.println("Name: " + this.userName);
		System.out.println("Birthdate: " + this.birthDate[0] + "/" + this.birthDate[1] + "/" + this.birthDate[2]);
		System.out.println("Account created: " + this.userCreationDate);
		System.out.println("Course: " + this.course);
		System.out.println("year level: " + this.yearLevel);
		System.out.println("student-ID: " + this.studentID);
		System.out.println("");
	}
	
	//getters
	public int getStudentID() {
		return this.studentID;
	}
	public int birthDate(int number) {
		return this.birthDate(number);
	}
	public String getCourse() {
		return this.course;	
	}
	public int getYearLevel(){
		return this.yearLevel;
	}
	
	//Setter
	public void setName(String newName) {
		this.userName = newName;
	}
	public void setBirthMonth(int newBirthMonth) {
		this.birthDate[0] = newBirthMonth;
	}
	public void setBirthDay(int newBirthDay) {
		this.birthDate[1] = newBirthDay;
	}
	public void setBirthYear(int newBirthYear) {
		this.birthDate[2] = newBirthYear;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	
	
	
}
