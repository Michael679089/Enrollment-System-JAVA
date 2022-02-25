package com.ciit.EnrollmentSystem;

public class Registrar extends User {

	// Variables
	protected int registrarID;
	protected String registrarRole;
	
	// constructor
	public Registrar() {
		userName = "";
		birthDate[0] = 12;
		birthDate[1] = 31;
		birthDate[2] = 2000;
		userCreationDate = "";
		registrarID = 0;
		registrarRole = "";
	}

	public Registrar(String name, String date, String registrarRole, int birthMonth, int birthDay, int birthYear, int registrarID) {
		this.userName = name;
		this.userCreationDate = date;
		this.birthDate[0] = birthMonth;
		this.birthDate[1] = birthDay;
		this.birthDate[2] = birthYear;
		this.registrarID = registrarID;
		this.registrarRole = registrarRole;
	}
	
	
	
	
	
	
	//generic methods
	public void displayInfo() {
		System.out.println("Name: " + this.userName);
		System.out.println("Birthdate: " + this.birthDate[0] + "/" + this.birthDate[1] + "/" + this.birthDate[2]);
		System.out.println("Account created: " + this.userCreationDate);
		System.out.println("Registrar-ID: " + this.registrarID);
		System.out.println("Registrar-Role: " + this.registrarRole);
		System.out.println("");
	}
	
	// getters
	
	
	//setters
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
	public void setRegistrarID(int newRegistrarID) {
		this.registrarID = newRegistrarID;
	}
	public void setRole(String newRole) {
		this.registrarRole = newRole;
	}
	
	
}
