package RegistrationSystem;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Course Logic = new Course("Logic", 3);
		Logic.registeredStudents.add("JT");
		Logic.registeredStudents.add("Rick");
		Logic.registeredStudents.add("Angel");
		
		Course Pyschology = new Course("Psychology", 6);
		Pyschology.registeredStudents.add("Marlin");
		Pyschology.registeredStudents.add("Rick");
		Pyschology.registeredStudents.add("Jimmy");
		Pyschology.registeredStudents.add("Adalid");
		
		Course Intro = new Course("Intro To Java", 6);
		Intro.registeredStudents.add("JT");
		Intro.registeredStudents.add("Daniel");
		Intro.registeredStudents.add("Eve");
		Intro.registeredStudents.add("Kenneth");
		Intro.registeredStudents.add("Esther");
		
		ArrayList<Course> Courses = new ArrayList<>();
		Courses.add(Intro);
		Courses.add(Pyschology);
		Courses.add(Logic);
		
		System.out.println("\tWelcome To Your Student Registration System");
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String studentName = scan.nextLine();
		System.out.println("Choose your selection:\nRegister For a Course(1)\nDrop a Course(2)\nView Course Details(3)\nExit Program(4)");
		int selection = scan.nextInt();
    	
    	while (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
    		System.out.println("Invalid Input");
    		int answer = scan.nextInt();
    		selection = answer;
    	}
    	
    	do {
    		
    		if (selection == 1) {
    			System.out.println("What course would you like to register for?");
    			
    			for (Course element : Courses) {
    			System.out.print(element.getCourseName() + "\n");
    			}
    			scan.nextLine();
    			String coursename = scan.nextLine();
    			
    			boolean registered = false;
    			for (Course element : Courses) {
    				
    				if (element.getCourseName().equalsIgnoreCase(coursename)) {
    					element.registerStudent(studentName);
    					registered = true;
    					break;
    				}
    			}
    			if (registered == false) {
    				System.out.println("Course Not Found");
    			}
    		}
    		
    		if (selection == 2) {
    			System.out.println("What course would you like to drop?");
    			
    			for (Course element : Courses) {
    			System.out.print(element.getCourseName() + "\n");
    			}
    			scan.nextLine();
    			String coursename = scan.nextLine();
    			
    			boolean dropped = false;
    			for (Course element : Courses) {
    				
    				if (element.getCourseName().equalsIgnoreCase(coursename)) {
    					element.dropStudent(studentName);
    					dropped = true;
    					break;
    				}
    			}
    			if (dropped == false) {
    				System.out.println("Course Not Found");
    			}
    		}
    		
    		if (selection == 3) {
    			System.out.println("What course would you like to view the details of?");
    			
    			for (Course element : Courses) {
    			System.out.print(element.getCourseName() + "\n");
    			}
    			scan.nextLine();
    			String coursename = scan.nextLine();
    			
    			boolean viewed = false;
    			for (Course element : Courses) {
    				
    				if (element.getCourseName().equalsIgnoreCase(coursename)) {
    					element.displayCourseDetails();
    					viewed = true;
    					break;
    				}
    			}
    			if (viewed == false) {
    				System.out.println("Course Not Found");
    			}
    		}
    				
    		
			System.out.println("For Another Selection, press (1, 2, 3). Exit, press 4");
			int new_select = scan.nextInt();
			selection = new_select;
    		
    	} while (selection != 4);
		
		
		

	}

}
