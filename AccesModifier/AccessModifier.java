package com.org.example;

import java.util.Scanner;

class Student{
	//Data Members
	private int studentId;
	private String studentName;
	private int studentAge;
	Scanner scanner = new Scanner(System.in);
	//Member Function
    void acceptDetails() {
		System.out.println("Enter Student Id: ");
		studentId = scanner.nextInt();
		System.out.println("Enter Student Name: ");
		studentName = scanner.next();
		System.out.println("Enter Student Age: ");
		studentAge = scanner.nextInt();	
	}
	void displayDetails() {
		System.out.println("Student Id: "+ studentId);
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student Age: "+ studentAge);
	}
}
public class AccessModifier {
	public static void main(String[] args) {
		
		//creating an object of class student
		Student student = new Student();
		student.acceptDetails();
		student.displayDetails();
		
		Student student1 = new Student();
		student1.acceptDetails();
		student1.displayDetails();
	}
}
