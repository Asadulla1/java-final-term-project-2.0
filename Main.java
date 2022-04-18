import java.lang.*;
import Classes.*;
import Interfaces.*;
import java.util.*;
import java.util.Scanner ;
import fileio.*;
public class Main{
	public static void main(String[] args){
		System.out.println("Welcome To Student Portal");
		boolean select = true;
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);
		StudentPortal sp = new StudentPortal();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		while(select)
		{
			
			System.out.println("1. Student Management");
			System.out.println("2. Registration");
			System.out.println("3. Payment");
			System.out.println("4. Exit\n");
			System.out.print("Select Your Desire Option : ");
			int selection1 = input.nextInt();
			switch(selection1){
				case 1: 
					System.out.println("You have selected Student Management");
					System.out.println("	1. Register New Student");
					System.out.println("	2. Remove Existing Student");
					System.out.println("	3. See All Students");
					System.out.println("	4. Go Back\n");
					System.out.print("Select Your Desire Option : ");
					int subSelection1 = input.nextInt();
					switch(subSelection1){
						case 1:
							System.out.println("You have Selected Student Registration");
							System.out.println("Enter Student Name:");
							String studentName = input2.nextLine();
							System.out.println("Enter Student Id:");
							String studentId = input.next();
							System.out.println("Enter Student Program:");
							String studentProgram = input2.nextLine();
							System.out.println("Enter Student Session:");
							String studentSession = input.next();
							Student s = new Student();
							s.setName(studentName);
							s.setId(studentId);
							s.setProgram(studentProgram);
							s.setSession(studentSession);
							
							sp.insertStudent(s);
							break;
							
						case 2:
							System.out.println("You have Selected to remove an existing Student");
							System.out.print("Enter Student Name: ");
							String name = input2.nextLine();
							sp.removeStudent(sp.getStudent(name));
							break;
						case 3:
							System.out.println("You have Selected to see all Students");
							sp.ShowAllStudents();
						break;
						case 4:
							System.out.println("You have Selected to Go Back");
							break;
						default:
							System.out.println("Invalid Selection");
							break;
					}
						break;
				case 2:
						//Registration section
							ShowRegisterdCourses src = new ShowRegisterdCourses();
							System.out.println("Welcome to Registration");
							boolean msg = true;
							while(msg){
								System.out.println("1. Show Avaialbe Course For Registration");
								System.out.println("2. Course Registration");
								System.out.println("3. Go Back");
								int opinion = input.nextInt();
							switch(opinion){
								case 1:
									System.out.println("You Selected Display Avaialbe Courses");
									System.out.println("Enter Your Program Name: ");
									String programName = input2.nextLine();
									if(programName.equals("CSE")||programName.equals("cse")){
										System.out.println("CSE is Selected");
										System.out.println("Welcome to CSE Department");
										System.out.println("Choose Your Slot");
										System.out.println("1.All Upto 18-*****-3");
										System.out.println("2.19-*****-1 to 19-*****-3");
										System.out.println("3.20-*****-3 to 20-*****-3");
										System.out.println("4.21-*****-3 to 21-*****-3");
										int slotSelection = input.nextInt();
										System.out.println("You Selected :"+ slotSelection);
											switch(slotSelection){
												case 1:
													src.showCseCoursesForSlot1();
													break;
												case 2:
													src.showCseCoursesForSlot2();
													break;
												case 3:
													src.showCseCoursesForSlot3();
													break;
												case 4:
													src.showCseCoursesForSlot4();
													break;
												default:
													System.out.println("Invalid Selection");
													break;
											}
											break;
									}
									else if(programName.equals("EEE")||programName.equals("eee")){
											System.out.println("EEE is Selected");
											System.out.println("Welcome to EEE Department");
											System.out.println("Choose Your Slot");
											System.out.println("1.All Upto 18-*****-3");
											System.out.println("2.19-*****-1 to 19-*****-3");
											System.out.println("3.20-*****-3 to 20-*****-3");
											System.out.println("4.21-*****-3 to 21-*****-3");
											int slotSelection1 = input.nextInt();
											System.out.println("You Selected :"+ slotSelection1);
										switch(slotSelection1){
											case 1: 
												src.showEeeCoursesForSlot1();
												break;
											case 2:
												src.showEeeCoursesForSlot2();
												break;
											case 3:
												src.showEeeCoursesForSlot3();
												break;
											case 4:
												src.showEeeCoursesForSlot4();
												break;
											default:
											System.out.println("Invalid Selection");
											break;
										}
										break;
									}
									break;
								case 2:
								    System.out.println("Welcome to Course Registration Section");
								    
										System.out.println("Enter Your Program Name: ");
										String programName1 = input3.nextLine();
										
										if(programName1.equals("CSE")||programName1.equals("cse")){
										System.out.println("CSE is Selected");
										System.out.println("Welcome to CSE Department");
										System.out.println("Choose Your Slot");
										System.out.println("1.All Upto 18-*****-3");
										System.out.println("2.19-*****-1 to 19-*****-3");
										System.out.println("3.20-*****-3 to 20-*****-3");
										System.out.println("4.21-*****-3 to 21-*****-3");
										int slotSelection = input.nextInt();
										System.out.println("You Selected :"+ slotSelection);
								switch(slotSelection){
										case 1:
											System.out.println("Do you Like to see Available Courses List? Then Type Yes");
											String userInput1 = input4.nextLine();
											if(userInput1.equals("Yes")||userInput1.equals("yes")){
												src.showCseCoursesForSlot1();
											}
											System.out.println("Do You want to complete your registration? Then type yes");
											String userInput2 = input2.next();
											if(userInput2.equals("Yes")||userInput2.equals("yes")){
												src.setCseCoursesForSlot1();
											}
											else{
												break;
											}
											
											System.out.println("Do You Want to Confirm Your Registration? Then type Confirm");
											String confirmation = input2.next();
											if(confirmation.equals("Confirm")||confirmation.equals("confirm")){
												System.out.println("Registration Confirmed");
												System.out.println("----------------Your Registered Courses--------------");
												src.showRegistration();
												System.out.println("-------------End of Your Registered Courses-----------");
												
											}
											break;
										case 2:
											System.out.println("Do you Like to see Available Courses List? Then Type Yes");
											String userInput3 = input4.nextLine();
											if(userInput3.equals("Yes")||userInput3.equals("yes")){
												src.showCseCoursesForSlot2();
											}
											System.out.println("Do You want to complete your registration? Then type yes");
											String userInput4 = input2.next();
											if(userInput4.equals("Yes")||userInput4.equals("yes")){
												src.setCseCoursesForSlot2();
											}
											System.out.println("Do You Want to Confirm Your Registration? Then type Confirm");
											String confirmation1 = input2.next();
											if(confirmation1.equals("Confirm")||confirmation1.equals("confirm")){
												System.out.println("Registration Confirmed");
												System.out.println("----------------Your Registered Courses--------------");
												src.showRegistration();
												System.out.println("-------------End of Your Registered Courses-----------");
											}
											else{
												break;
											}
											break;
										case 3:
											System.out.println("Do you Like to see Available Courses List? Then Type Yes");
											String userInput5 = input4.nextLine();
											if(userInput5.equals("Yes")||userInput5.equals("yes")){
												src.showCseCoursesForSlot3();
											}
											System.out.println("Do You want to complete your registration? Then type yes");
											String userInput6 = input2.next();
											if(userInput6.equals("Yes")||userInput6.equals("yes")){
												src.setCseCoursesForSlot3();
											}
											System.out.println("Do You Want to Confirm Your Registration? Then type Confirm");
											String confirmation2 = input2.next();
											if(confirmation2.equals("Confirm")||confirmation2.equals("confirm")){
												System.out.println("Registration Confirmed");
												System.out.println("----------------Your Registered Courses--------------");
												src.showRegistration();
												System.out.println("-------------End of Your Registered Courses-----------");
											}
											break;
										case 4:
											System.out.println("Do you Like to see Available Courses List? Then Type Yes");
											String userInput7 = input4.nextLine();
											if(userInput7.equals("Yes")||userInput7.equals("yes")){
												src.showCseCoursesForSlot1();
											}
											System.out.println("Do You want to complete your registration? Then type yes");
											String userInput8= input2.next();
											if(userInput8.equals("Yes")||userInput8.equals("yes")){
												src.setCseCoursesForSlot1();
											}
											System.out.println("Do You Want to Confirm Your Registration? Then type Confirm");
											String confirmation3 = input2.next();
											if(confirmation3.equals("Confirm")||confirmation3.equals("confirm")){
												System.out.println("Registration Confirmed");
												System.out.println("----------------Your Registered Courses--------------");
												src.showRegistration();
												System.out.println("-------------End of Your Registered Courses-----------");
											}
											break;
										default:
											System.out.println("Wrong Input");
											break;
								}
									break;
								}
								
									
									else if(programName1.equals("EEE")||programName1.equals("eee")){
											//System.out.println("Enter Your Program Name: ");
											System.out.println("EEE is Selected");
											System.out.println("Welcome to EEE Department");
											System.out.println("Choose Your Slot");
											System.out.println("1.All Upto 18-*****-3");
											System.out.println("2.19-*****-1 to 19-*****-3");
											System.out.println("3.20-*****-3 to 20-*****-3");
											System.out.println("4.21-*****-3 to 21-*****-3");
											int slotSelection1 = input.nextInt();
											System.out.println("You Selected :"+ slotSelection1);
										switch(slotSelection1){
											case 1:
											System.out.println("Do you Like to see Available Courses List? Then Type Yes");
											String userInput1 = input5.nextLine();
											if(userInput1.equals("Yes")||userInput1.equals("yes")){
												src.showEeeCoursesForSlot1();
											}
											System.out.println("Do You want to complete your registration? Then type yes");
											String userInput2 = input2.next();
											if(userInput2.equals("Yes")||userInput2.equals("yes")){
												src.setEeeCoursesForSlot1();
												
											}
											else{
												break;
											}
											
											System.out.println("Do You Want to Confirm Your Registration? Then type Confirm");
											String confirmation = input2.next();
											if(confirmation.equals("Confirm")||confirmation.equals("confirm")){
												System.out.println("Registration Confirmed");
												System.out.println("----------------Your Registered Courses--------------");
												src.showRegistration();
												System.out.println("-------------End of Your Registered Courses-----------");
											}
											break;
										case 2:
											System.out.println("Do you Like to see Available Courses List? Then Type Yes");
												String userInput11 = input5.nextLine();
												if(userInput11.equals("Yes")||userInput11.equals("yes")){
													src.showEeeCoursesForSlot2();
												}
												System.out.println("Do You want to complete your registration? Then type yes");
												String userInput12 = input2.next();
												if(userInput12.equals("Yes")||userInput12.equals("yes")){
													src.setEeeCoursesForSlot2();
												}
												else{
													break;
												}
												
												System.out.println("Do You Want to Confirm Your Registration? Then type Confirm");
												String confirmation5 = input2.next();
												if(confirmation5.equals("Confirm")||confirmation5.equals("confirm")){
													System.out.println("Registration Confirmed");
													System.out.println("----------------Your Registered Courses--------------");
													src.showRegistration();
													System.out.println("-------------End of Your Registered Courses-----------");
												}
											break;
										case 3:
												System.out.println("Do you Like to see Available Courses List? Then Type Yes");
												String userInput13 = input5.nextLine();
												if(userInput13.equals("Yes")||userInput13.equals("yes")){
													src.showEeeCoursesForSlot3();
												}
												System.out.println("Do You want to complete your registration? Then type yes");
												String userInput14 = input2.next();
												if(userInput14.equals("Yes")||userInput14.equals("yes")){
													src.setEeeCoursesForSlot3();
												}
												else{
													break;
												}
												
												System.out.println("Do You Want to Confirm Your Registration? Then type Confirm");
												String confirmation6 = input2.next();
												if(confirmation6.equals("Confirm")||confirmation6.equals("confirm")){
													System.out.println("Registration Confirmed");
													System.out.println("----------------Your Registered Courses--------------");
													src.showRegistration();
													System.out.println("-------------End of Your Registered Courses-----------");
												}
											break;
										case 4:
												System.out.println("Do you Like to see Available Courses List? Then Type Yes");
												String userInput15 = input5.nextLine();
												if(userInput15.equals("Yes")||userInput15.equals("yes")){
													src.showEeeCoursesForSlot4();
												}
												System.out.println("Do You want to complete your registration? Then type yes");
												String userInput16 = input2.next();
												if(userInput16.equals("Yes")||userInput16.equals("yes")){
													src.setEeeCoursesForSlot4();
												}
												else{
													break;
												}
												
												System.out.println("Do You Want to Confirm Your Registration? Then type Confirm");
												String confirmation7 = input2.next();
												if(confirmation7.equals("Confirm")||confirmation7.equals("confirm")){
													System.out.println("Registration Confirmed");
													System.out.println("----------------Your Registered Courses--------------");
													src.showRegistration();
													System.out.println("-------------End of Your Registered Courses-----------");
												}
											break;
											}//EEE Slot switch
										//break;	
									}
									else{
										System.out.println("Wrong Input.Only CSE and EEE Available at this moment");
										break;
									}
									
									
								break;
									
							case 3:
								System.out.println("You Selected Go Back");
								msg = false;
								break;
									 
							}//switch er bracket
							break;
							}//while er bracket
						break;
							
				case 3:
									Payment p1 = new Payment();
									System.out.println("Welcome to Payment Section");
									p1.SetUser();
									p1.greetingsUser();
									System.out.println("1. Cash Payment");
									System.out.println("2. Online Payment");
									int userInput = input.nextInt();
							switch (userInput){
								case 1:
									p1.setPayableAmount();
									break;
								case 2:
								OnlinePayment op = new OnlinePayment();
								op.setPayableAmount();
								break;
							}
						break;
					case 4:
							System.out.println("You have selected to exit the application");
							System.out.println("Thank you for using Student Portal");
							select = false;
							break;
						default:
							System.out.println("Invalid Input");
							break;
			}
		}
	}
}