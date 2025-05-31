package Polymorphism;

class Student {
	
	//Data Members
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public Student() {
		studentId = 100;
		studentName = "Anuj";
	    studentAge = 20;
	}
	
	public Student(int studentId, int studentAge, String studentName) {
	    this.studentId = studentId;
	    this.studentAge = studentAge;
	    this.studentName = studentName;
	}

	public Student(int studentId, String studentName) {
	    this.studentId = studentId;
	    this.studentName = studentName;
	    this.studentAge = 0; // or some default value
	}

	public void displayDetails() {
		System.out.println("Student Id: "+ studentId);
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student Age: "+ studentAge);
	}
}

public class ConstructorOverloadingExample {
	public static void main(String[] args) {
		Student student = new Student();  
		student.displayDetails();  //default constructor 
		System.out.println("*********************************");
		Student student1 = new Student(121, 20, "Yogita"); //Parameterized constructor
		student1.displayDetails();
		Student student2 = new Student(122, 20, "Diksha");
		student2.displayDetails();
		Student student3 = new Student(123, 20, "Unnati");
		student3.displayDetails();
		
		
		
		
	}

}
