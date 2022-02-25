package com.ciit.EnrollmentSystem;

//Imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Custom Imports
import java.util.Date; // import the LocalDateTime class
import java.text.SimpleDateFormat;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		//Variables
		int upperBound;
		int intRandom;
		char inputChar2 = 0;
		char inputChar3 = 0;
		char inputChar = 0;
				
		//Objects
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Random random = new Random();

		
		
		
		
		
		while (inputChar != 'Q') { 
		System.out.println("Enrollment System");
		System.out.println("[1] - Create New Account");
		System.out.println("[Q] - Quit");
		inputChar = reader.readLine().charAt(0);
			
		
		
			// Create New Account
			while (inputChar == '1' && inputChar != 'q') {
				System.out.println("");
				System.out.println("Choose Job:");
				System.out.println("[1] - Student");
				System.out.println("[2] - Teacher");
				System.out.println("[3] - Registrar");
				System.out.println("[q] - Cancel Account Creation");
				inputChar = reader.readLine().charAt(0);
				
				upperBound = 100;
				intRandom = random.nextInt(upperBound);
				String tempName;
				int tempBirthDay;
				int tempBirthMonth;
				int tempBirthYear;
				int tempYearLevel;
				int tempStudentID;
				int tempTeacherID;
				int tempRegistrarID;
				String tempCourse = "";
				switch(inputChar) {
					//Creating Student Object
					case '1':
						
						System.out.println("[1] You are a Student");
						System.out.println("Please input your info");
						System.out.println("Name:");
						tempName = reader.readLine();
						System.out.println("Birth Month (<12):");
						tempBirthMonth = Integer.parseInt(reader.readLine());
						while (tempBirthMonth > 12) {
							System.out.println("[Error] Birth Month should be between 1-12");
							tempBirthMonth= Integer.parseInt(reader.readLine());
						}
						System.out.println("Birth Day (<31):");
						tempBirthDay = Integer.parseInt(reader.readLine());
						while (tempBirthDay > 31) {
							System.out.println("[Error] Birth Day should be between 1-31");
							tempBirthDay = Integer.parseInt(reader.readLine());
						}
						System.out.println("Birth Year:");
						tempBirthYear = Integer.parseInt(reader.readLine());
						System.out.println("Input the Course");
						System.out.println("[1] - English");
						System.out.println("[2] - Filipino");
						System.out.println("[3] - Math");
						System.out.println("[4] - Science");
						inputChar2 = reader.readLine().charAt(0);
						while (inputChar2 > '4') {
							System.out.println("[Error] Input must be between 1-4");
							inputChar2 = reader.readLine().charAt(0);
						}
						switch(inputChar2) {
							case '1':
								tempCourse = "English";
								break;
							case '2':
								tempCourse = "Filipino";
								break;
							case '3':
								tempCourse = "Math";
								break;
							case '4':
								tempCourse = "Science";
								break;
							default: 
								System.out.println("Wrong input");
								break;
						}

						System.out.println("Grade Level:");
						tempYearLevel = Integer.parseInt(reader.readLine());
						while (tempYearLevel > 12) {
							System.out.println("[Error] Grade Level must be between 1 - 12");
							tempYearLevel = Integer.parseInt(reader.readLine());
						}
						
						if (tempBirthMonth > 12 || tempBirthDay > 31) {
							System.out.println("[Error] Birth Month should be > 12 and Birth day should be > 31");
							break;
						}
						else if (inputChar2 < 0 && inputChar2 > 4) {
							System.out.println("[Error] It shouldbe 1 - 4, not greater or lesser than that");
							break;	
						}
						else {
							Student newStudent = new Student(tempName, dateFormat.format(currentDate), tempCourse, tempBirthDay, tempBirthMonth, tempBirthYear, tempYearLevel, intRandom);
							System.out.println("Account has been created");
							newStudent.displayInfo();
							
							// [Student] - Editing info.
							while (inputChar3 != 'Q') {
								System.out.println("\n");
								System.out.println("Do you like to change anything?");
								System.out.println("[1] - change name");
								System.out.println("[2] - change Birth Month");
								System.out.println("[3] - change Birth Day");
								System.out.println("[4] - change Birth Year");
								System.out.println("[5] - change Course");
								System.out.println("[6] - change Grade Level");
								System.out.println("[7] - change student ID");
								System.out.println("[Q] - It's looks good");
								inputChar3 = reader.readLine().charAt(0);
								
								switch(inputChar3) {
									case '1':
										System.out.println("Input NEW name:");
										tempName = reader.readLine();
										newStudent.setName(tempName);
										break;
									case '2':
										System.out.println("Input NEW Birth Month:");
										tempBirthMonth = Integer.parseInt(reader.readLine());
										while (tempBirthMonth > 12) {
											System.out.println("[Error] Birth Month input must be between 1 - 12:");
											tempBirthMonth = Integer.parseInt(reader.readLine());
										}
										if (tempBirthMonth <= 12) {
											newStudent.setBirthMonth(tempBirthMonth);
										}
										break;
									case '3':
										System.out.println("Input NEW Birth Day:");
										tempBirthDay = Integer.parseInt(reader.readLine());
										while (tempBirthDay > 31) {
											System.out.println("[Error] Birth Day input must be between 1 - 31:");
											tempBirthDay = Integer.parseInt(reader.readLine());
										}
										if (tempBirthDay <= 31) {
											newStudent.setBirthDay(tempBirthDay);
										}
										break;
									case '4':
										System.out.println("Input NEW Birth Year:");
										tempBirthYear = Integer.parseInt(reader.readLine());
										newStudent.setBirthYear(tempBirthYear);
										break;
									case '5':
										System.out.println("Input NEW course:");
										System.out.println("[1] - English");
										System.out.println("[2] - Filipino");
										System.out.println("[3] - Math");
										System.out.println("[4] - Science");
										inputChar2 = reader.readLine().charAt(0);
										while (inputChar2 > '4') {
											System.out.println("[Error] Input must be between 1-4");
											inputChar2 = reader.readLine().charAt(0);
										}
										switch(inputChar2) {
											case '1':
												tempCourse = "English";
												break;
											case '2':
												tempCourse = "Filipino";
												break;
											case '3':
												tempCourse = "Math";
												break;
											case '4':
												tempCourse = "Science";
												break;
											default:
												System.out.println("Wrong input");
												break;
										}
										newStudent.setCourse(tempCourse);
										break;
									case '6':
										System.out.println("Input new Grade Level:");
										tempYearLevel = Integer.parseInt(reader.readLine());
										while (tempYearLevel > 12) {
											System.out.println("[Error] Grade Level must be between 1-12");
											tempYearLevel = Integer.parseInt(reader.readLine());
										}
										newStudent.setYearLevel(tempYearLevel);
										break;
										
									case '7':
										System.out.println("Input new Student ID:");
										tempStudentID = Integer.parseInt(reader.readLine());
										newStudent.setStudentID(tempStudentID);
									case 'Q':
										break;
								}
								newStudent.displayInfo();
								System.out.println("Account has been modified");
							}
						}
						break;
						
						
						
					// Creating Teacher Object					
					case '2':
						upperBound = 100;
						intRandom = random.nextInt(upperBound);
						String tempDepartment = "";
						
						System.out.println("[2] You are a teacher");
						System.out.println("Please input your info");
						System.out.println("Input name: ");
						tempName = reader.readLine();
						System.out.println("Birth Month (<12):");
						tempBirthMonth = Integer.parseInt(reader.readLine());
						while (tempBirthMonth > 12) {
							System.out.println("[Error] Birth Month should be between 1-12");
							tempBirthMonth = Integer.parseInt(reader.readLine());
						}
						System.out.println("Birth Day (<31):");
						tempBirthDay = Integer.parseInt(reader.readLine());
						while (tempBirthDay> 31) {
							System.out.println("[Error] Birth Day should be between 1-31");
							tempBirthDay = Integer.parseInt(reader.readLine());
						}
						System.out.println("Birth Year:");
						tempBirthYear = Integer.parseInt(reader.readLine());
						System.out.println("Type the Department");
						System.out.println("[1] - English");
						System.out.println("[2] - Filipino");
						System.out.println("[3] - Math");
						System.out.println("[4] - Science");
						inputChar2 = reader.readLine().charAt(0);
						while (inputChar2 > '4') {
							System.out.println("[Error] Department input should be between 1-4");
							inputChar2 = reader.readLine().charAt(0);
						}
						switch(inputChar2){
						case '1':
							tempDepartment = "English";
							break;
						case '2':
							tempDepartment = "Filipino";
							break;
						case '3':
							tempDepartment = "Math";
							break;
						case '4':
							tempDepartment = "Science";
							break;
						default: 
							System.out.println("Wrong input");
							break;
						}
						
						if (tempBirthMonth > 12 || tempBirthDay > 31) {
							System.out.println("[Error] Birth Month should be > 12 and Birth day should be > 31");
							break;
						}
						else if (inputChar2 < 0 && inputChar2 > 4) {
							System.out.println("[Error] It shouldbe 1 - 4, not greater or lesser than that");
							break;	
						}
						else {
							Teacher newTeacher = new Teacher(tempName, dateFormat.format(currentDate), tempDepartment, tempBirthMonth, tempBirthDay, tempBirthYear, intRandom);
							newTeacher.displayInfo();
							System.out.println("Account has been created");
							
							// [Teacher] - Editing info.
							while (inputChar3 != 'Q') {
								System.out.println("\n");
								System.out.println("Do you like to change anything?");
								System.out.println("[1] - change name");
								System.out.println("[2] - change Birth Month");
								System.out.println("[3] - change Birth Day");
								System.out.println("[4] - change Birth Year");
								System.out.println("[5] - Change TeacherID");
								System.out.println("[6] - Change Department");
								System.out.println("[Q] - It looks good");
								inputChar3 = reader.readLine().charAt(0);
								
								switch(inputChar3) {
								
								case '1':
									System.out.println("Input NEW name:");
									tempName = reader.readLine();
									newTeacher.setUserName(tempName);
									break;
								case '2':
									System.out.println("Input NEW Birth Month:");
									tempBirthMonth = Integer.parseInt(reader.readLine());
									while (tempBirthMonth > 12 || tempBirthMonth < 0) {
										System.out.println("[Error] Birth Day input must be between 1 - 12:");
										tempBirthMonth = Integer.parseInt(reader.readLine());
									}
									if (tempBirthMonth <= 12 || tempBirthMonth > 0 ) {
										newTeacher.setBirthMonth(tempBirthMonth);
									}
									break;
								case '3':
									System.out.println("Input NEW Birth Day:");
									tempBirthDay = Integer.parseInt(reader.readLine());
									while (tempBirthDay > 31 || tempBirthDay < 0) {
										System.out.println("[Error] Birth Day input must be between 1 - 31:");
										tempBirthDay = Integer.parseInt(reader.readLine());
									}
									if (tempBirthDay <= 31 && tempBirthDay > 0 ) {
										newTeacher.setBirthDay(tempBirthDay);
									}
									break;
								case '4':
									System.out.println("Input NEW Birth Year:");
									tempBirthYear = Integer.parseInt(reader.readLine());
									newTeacher.setBirthYear(tempBirthYear);
									break;
									
								case '5':
									System.out.println("Input New teacher ID:");
									tempTeacherID = Integer.parseInt(reader.readLine());
									newTeacher.setTeacherID(tempTeacherID);
									break;
								case '6':
									System.out.println("Type the Department");
									System.out.println("[1] - English");
									System.out.println("[2] - Filipino");
									System.out.println("[3] - Math");
									System.out.println("[4] - Science");
									inputChar2 = reader.readLine().charAt(0);
									while (inputChar2 > '4') {
										System.out.println("[Error] Department input should be between 1-4");
										inputChar2 = reader.readLine().charAt(0);
									}
									switch(inputChar2){
										case '1':
											tempDepartment = "English";
											break;
										case '2':
											tempDepartment = "Filipino";
											break;
										case '3':
											tempDepartment = "Math";
											break;
										case '4':
											tempDepartment = "Science";
											break;
										default:
											System.out.println("Wrong Input\n");
											break;
									}
									newTeacher.setDepartment(tempDepartment);
									break;	
								}
								newTeacher.displayInfo();
								System.out.println("Account has been modified");
							}
						}
						break;
					
						
						
					// Creating Registrar Object
					case '3':
						upperBound = 100;
						intRandom = random.nextInt(upperBound);
						String tempRole = "";
						
						System.out.println("[3] You are a Registrar");
						System.out.println("Please input your info");
						System.out.println("Name: ");
						tempName = reader.readLine();
						System.out.println("Birth Month (<12):");
						tempBirthMonth = Integer.parseInt(reader.readLine());
						while (tempBirthMonth > 12) {
							System.out.println("[Error] Birth Month should be between 1-12");
							tempBirthMonth = Integer.parseInt(reader.readLine());
						}
						System.out.println("Birth Day (<31): ");
						tempBirthDay = Integer.parseInt(reader.readLine());
						while (tempBirthDay > 31) {
							System.out.println("[Error] Birth Day should be between 1-31");
							tempBirthDay= Integer.parseInt(reader.readLine());
						}
						System.out.println("Birth Year:");
						tempBirthYear = Integer.parseInt(reader.readLine());
						System.out.println("Role: ");
						System.out.println("[1] - Cashier");
						System.out.println("[2] - Records");
						System.out.println("[3] - Manager");
						inputChar2 = reader.readLine().charAt(0);
						while (inputChar2 > '3') {
							System.out.println("[Error] Role input should be between 1-3");
							inputChar2 = reader.readLine().charAt(0);
						}
						switch(inputChar2){
							case '1': 
								tempRole = "Cashier";
								break;
							case '2': 
								tempRole = "Records";
								break;
							case '3': 
								tempRole = "Manager";
								break;
						}
						
						if (tempBirthMonth > 12 || tempBirthDay > 31) {
							System.out.println("[Error] Birth Month should be > 12 and Birth day should be > 31");
							break;
						}
						else if (inputChar2 < '0' && inputChar2 > '3') {
							System.out.println("[Error] It should be 1 - 3, not greater or lesser than that");
							break;	
						}
						else {
							Registrar newRegistrar = new Registrar(tempName, dateFormat.format(currentDate), tempRole, tempBirthMonth, tempBirthDay, tempBirthYear, intRandom);
							newRegistrar.displayInfo();
							System.out.println("Account has been created");
							inputChar3 = 0;
							
							
							// [Registrar] - Editing info.
							while (inputChar3 != 'Q') {
								System.out.println("\n");
								System.out.println("Do you like to change anything?");
								System.out.println("[1] - change name");
								System.out.println("[2] - change Birth Month");
								System.out.println("[3] - change Birth Day");
								System.out.println("[4] - change Birth Year");
								System.out.println("[5] - change Registrar ID");
								System.out.println("[6] - change Role");
								System.out.println("[Q] - It looks good.");
								inputChar3 = reader.readLine().charAt(0);
								
								switch(inputChar3) {
									case '1': 
										System.out.println("Input NEW name");
										tempName = reader.readLine();
										newRegistrar.setName(tempName);
										break;
									case '2':
										System.out.println("Input New Birth Month:");
										tempBirthMonth = Integer.parseInt(reader.readLine());
										while (tempBirthMonth > 12) {
											System.out.println("[Error] Birth Month must be between 1-12");
											tempBirthMonth = Integer.parseInt(reader.readLine());
										}
										newRegistrar.setBirthMonth(tempBirthMonth);
										break;
									case '3':
										System.out.println("Input New Birth Day:");
										tempBirthDay = Integer.parseInt(reader.readLine());
										while (tempBirthDay > 31) {
											System.out.println("[Error] Birth Day must be between 1-31");
											tempBirthMonth = Integer.parseInt(reader.readLine());
										}
										if (tempBirthDay <= 31 && tempBirthDay > 0) {
										newRegistrar.setBirthDay(tempBirthDay);
										}
										break;
										
									case '4':
										System.out.println("Input New Birth Year:");
										tempBirthYear = Integer.parseInt(reader.readLine());
										newRegistrar.setBirthYear(tempBirthYear);
										break;
									case '5':
										System.out.println("Input New teacher ID:");
										tempRegistrarID = Integer.parseInt(reader.readLine());
										newRegistrar.setRegistrarID(tempRegistrarID);
										break;
										
									case '6':
										System.out.println("Input New Role");
										System.out.println("[1] - Cashier");
										System.out.println("[2] - Records");
										System.out.println("[3] - Manager");
										inputChar2 = reader.readLine().charAt(0);
										while (inputChar2 > '3') {
											System.out.println("[Error] Department input should be between 1-3");
											inputChar2 = reader.readLine().charAt(0);
										}
										switch(inputChar2){
											case '1': 
												tempRole = "Cashier";
												break;
											case '2': 
												tempRole = "Records";
												break;
											case '3': 
												tempRole = "Manager";
												break;
										}
										newRegistrar.setRole(tempRole);
										break;
									case 'Q':
										System.out.println("Account Saved");
										break;
									default:
										System.out.println("Wrong Input\n");
										break;
								}
								newRegistrar.displayInfo();
								System.out.println("Account has been modified");
							}
						}
						break; 
				}
			}
		}
		// Quit Section
		SimpleDateFormat dateFormatWithTime = new SimpleDateFormat("MM/dd/yyyy-hh:mm:ss");
		System.out.println("I hope you enjoy your stay at MJ's School :D");
		System.out.println("Last Opened: " + dateFormatWithTime.format(currentDate));
	}
}
