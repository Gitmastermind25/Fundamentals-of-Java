package Inheritance;

import java.util.Scanner;

// first class
class Student{
	
	//Data Members
	int studentId;
	String studentName;
	int studentAge;
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
//second class
class Marks extends Student{
	protected float objectiveMarks;
	protected float subjectiveMarks;
	
	void acceptDetails1() {
		super.acceptDetails();
		System.out.println("Enter objective marks:");
		objectiveMarks = scanner.nextFloat();
		System.out.println("Enter subjective marks:");
		subjectiveMarks = scanner.nextFloat();
	}
	
	
	void displayDetails1() {
		super.displayDetails();
		System.out.println("Objective Marks:"+ objectiveMarks);
		System.out.println("Subjective Marks:"+ subjectiveMarks);
	} 
}


//third class and this is Multi-level inheritance
class Sports extends Marks{
	protected float score;
	
	void acceptDetails() {
		super.acceptDetails1(); 
		System.out.println("Enter Sports Score: ");
		score = scanner.nextFloat();	
	}
	void displayDetails() {
		super.displayDetails1();
		System.out.println("Sports Score "+ score);
	}
}
//Final class inherit from Sports
class Result extends Sports{
	private float totalMarks, averageMarks;
	
	
	void calculate() {
		totalMarks = objectiveMarks + subjectiveMarks + score;
		averageMarks = totalMarks /3;
		System.out.println("Total Marks: "+ totalMarks);
		System.out.println("AVerage Marks: "+ averageMarks);
	}
}
public class InheritanceExample {
	public static void main(String[] args) {
		/*Marks marks = new Marks();
		marks.acceptDetails();
		marks.displayDetails();
		marks.acceptDetails1();
		marks.displayDetails1();
	    /* if we remove marks.acceptDetails1(); and marks.displayDetails1();
		so the question is which details will call out first marks class or student class
		every class gives priority of its own i.e marks class will print out
		we can use super keyword
	    
		Sports obj = new Sports();
		obj.acceptDetails();
		obj.displayDetails();
		*/
		Result result = new Result();
		result.acceptDetails();
		result.displayDetails();
		result.calculate();
	
	
	}

}
