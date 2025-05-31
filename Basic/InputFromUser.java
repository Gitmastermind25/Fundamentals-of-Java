package basics;

import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter your Gender(M/F): ");
		char gender = scanner.next().charAt(0);
		
		System.out.println("enter your contact number");
		double contact = scanner.nextDouble();
		
		System.out.println("user details: ");
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Gender:"+ gender);
		System.out.println("Contact number: "+ contact);
		
	}

}
