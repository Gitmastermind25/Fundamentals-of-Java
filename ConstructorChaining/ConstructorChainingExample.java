package ConstructorChaining;

class Student {
    // Data Members
    private int studentId;
    private String studentName;
    private int studentAge;

    // Default Constructor
    public Student() {
        this(121, "Yogita"); // calls 2-parameter constructor
        System.out.println("Inside Default Constructor");
    }

    // 2-Parameter Constructor
    public Student(int studentId, String studentName) {
        this(studentId, 20, studentName); // calls 3-parameter constructor
        System.out.println("Inside 2-Parameter Constructor");
    }

    // 3-Parameter Constructor
    public Student(int studentId, int studentAge, String studentName) {
        this.studentId = studentId;
        this.studentAge = studentAge;
        this.studentName = studentName;
        System.out.println("Inside 3-Parameter Constructor");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}

// Main class
public class ConstructorChainingExample {
    public static void main(String[] args) {
        Student student = new Student();  // Starts the constructor chain
        System.out.println("---------------");
        student.displayDetails();         // Display student info
    }
}
