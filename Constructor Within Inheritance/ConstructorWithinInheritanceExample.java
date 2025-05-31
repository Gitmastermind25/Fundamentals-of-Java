package ConstructorWithinInheritance;
class Person{
	String name;
	public Person() {              //person class constructor which initialize the name
		System.out.println("Person class constructor invoked");
		name = "Yogita pandit";
	}
	public Person(String name) {
		System.out.println("Person Class Parametrized constructor invoked");
	}
}
class Employee extends Person{ 
	//class is being inherited inside the employee
	//when u used extend or inherit one class into other super keyword is added by default
	//but if u have used parameterized constructor it will not added automatically
	String designation;
	public Employee() {
		System.out.println("Employee class constructor invoked");
		designation = "Manager";
	}
	public Employee(String designation) {
		super("AMIT");  //if u want to call person class parameterized constructor u have to use supper and pass the message
		System.out.println("Employee Class Parametrized constructor invoked");
		this.designation = designation;		
	}
}
public class ConstructorWithinInheritanceExample {
	public static void main(String[] args) {
		Employee employee = new Employee(); 
		//creating the employee class object ,constructor change from parent to child
		//first parent class constructor invoked then child one
		Employee employee1 = new Employee("SeniorManager");
	}
	

}
