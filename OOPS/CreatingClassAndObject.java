package OOPS;

import java.util.Scanner;

class Student{
	//Data Members
	int studentId;
	String studentName;
	int studentAge;
	Scanner scanner = new Scanner(System.in);
	//Member Function
	public void acceptDetails() {
		System.out.println("Enter Student Id: ");
		studentId = scanner.nextInt();
		System.out.println("Enter Student Name: ");
		studentName = scanner.next();
		System.out.println("Enter Student Age: ");
		studentAge = scanner.nextInt();	
	}
	public void displayDetails() {
		System.out.println("Student Id: "+ studentId);
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student Age: "+ studentAge);
	}
}
public class CreatingClassAndObject {
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
