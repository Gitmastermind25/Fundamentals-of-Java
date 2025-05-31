package ConstructorExample;

import java.util.Scanner;

class Student {
	//Data Members
	int studentId;
	String studentName;
	int studentAge;
	public Student() {
		this.studentId = 100;
		this.studentName = "Anuj";
		this.studentAge = 20;
	}
	
	public Student(int sId, int sAge, String sName) {
		this.studentId = sId;
		this.studentAge = sAge;
		this.studentName = sName;
	}
	public void displayDetails() {
		System.out.println("Student Id: "+ studentId);
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student Age: "+ studentAge);
	}
}
public class constructorExample {
	public static void main(String[] args) {
		Student student = new Student();
		student.displayDetails();
		
		Student student1 = new Student(121, 20, "Yogita");
		student1.displayDetails();
		
		Student student2 = new Student(122, 20, "Diksha");
		student2.displayDetails();
		
	}

}
