package UpcastingAndDownCasting;
class Vehicle{
	void drive() {
		System.out.println("Driving a vehicle");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Driving a car");
	}
	void speedUp() {
		System.out.println("Speeding up a car");
	}
}
public class UpcastingAndDownCastingExample {
	public static void main(String[] args) {
		//UPcasting
		Vehicle vehicle1 = new Car();
		vehicle1.drive();
		//DownCasting
		Vehicle vehicle = new Car();
		Car car= (Car) vehicle;  
		car.drive();
		car.speedUp();
		
		                        
	}

}
