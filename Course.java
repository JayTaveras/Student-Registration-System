package RegistrationSystem;
import java.util.ArrayList;

public class Course {
	
	public String courseName;
	public int maxSeats;
	public ArrayList<String> registeredStudents = new ArrayList<>();
	public boolean isAvailable;

	public Course(String course, int seats) {
		this.courseName = course;
		this.maxSeats = seats;
		}
	
	public void registerStudent(String name) {
		if (registeredStudents.size() >= maxSeats) {
			this.isAvailable = false;
		}
		else {
			 this.isAvailable = true;
		}
		if (isAvailable == false) {
			System.out.println("Class is unavailable");
		}
		else {
			registeredStudents.add(name);
			System.out.println("Student registered");
		}
	}
	public void dropStudent(String name) {
		if (registeredStudents.contains(name)) {
			registeredStudents.remove(name);
			System.out.println("Course Dropped");
		}
		else {
			System.out.println("You are not in the course");
		}
	}
	public void displayCourseDetails() {
		System.out.println("Course name: " + courseName + "\nNumber of seats: " + maxSeats + "\nRegistered Students (" + registeredStudents.size() + "): " + registeredStudents.toString());
	}
	public String getCourseName() {
		return courseName;
	}

	
		
	
}
