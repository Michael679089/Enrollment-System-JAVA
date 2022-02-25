package com.ciit.EnrollmentSystem;

public class Teacher extends User {

	//Variables
	protected int teacherID;
	protected String department;
	
	
	// constructor
	public Teacher() {
		userName = "";
		birthDate[0] = 12;
		birthDate[1] = 31;
		birthDate[2] = 2000;
		userCreationDate = "";
		department = "";
		teacherID = 0;	
	}
	
	public Teacher(String name, String date, String department, int birthMonth, int birthDay, int birthYear, int teacherID) {
		this.userName = name;
		this.userCreationDate = date;
		this.department = department;
		this.birthDate[0] = birthMonth;
		this.birthDate[1] = birthDay;
		this.birthDate[2] = birthYear;
		this.teacherID = teacherID;
	}
	
	
	
	
	
	
	// generic methods
	public void displayInfo() {
		System.out.println("JOB: Teacher");
		System.out.println("Name: " + this.userName);
		System.out.println("Birthdate:" + this.birthDate[0] + "/" + this.birthDate[1] + "/" + this.birthDate[2]);
		System.out.println("Account Created: " + this.userCreationDate);
		System.out.println("Department: " + this.department);
		System.out.println("Teacher-ID: " + this.teacherID);
		System.out.println("");
	}
	
	// getters
	public String getName() {
		return this.userName;
	}
	public int getBirthDate(int number) {
		return this.birthDate[number];
	}
	public String getUserCreationDate() {
		return this.userCreationDate;
	}
	public String getDepartment() {
		return this.department;
	}
	public int getTeacherID() {
		return this.teacherID;
	}
	
	//setters
	public void setUserName(String name) {
		this.userName = name;
	}
	public void setBirthMonth (int newBirthMonth) {
		this.birthDate[0] = newBirthMonth;
	}
	public void setBirthDay(int newBirthDay) {
		this.birthDate[1] = newBirthDay;
	}
	public void setBirthYear(int newBirthYear) {
		this.birthDate[2] = newBirthYear;
	}
	public void setCreationDate (int Day, int Month, int Year) {
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
