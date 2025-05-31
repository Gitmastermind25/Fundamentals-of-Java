package basics;

import java.awt.Point;

public class Datatypes {
	public static void main(String[] args) {
		//Primitive data type
		byte age = 20;
		long  views = 2_223_3;
		float price = 238.4F;
		char gender = 'M';
		boolean isValid = true;
		System.out.println(age);
		System.out.println(views);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(isValid);
		
		//Non primitive data type:
		String name = "madhu";
		System.out.println(name);
		
		Point point1= new Point(10,20);
		Point point2 = point1;
		System.out.println(point1.x + " : " +point1.y);
		System.out.println(point2.x + " : "+point2.y);
		point1.y = 25;
		System.out.println(point1.x + " : " +point1.y);
		System.out.println(point2.x + " : "+point2.y);
		
		
		
		
		
	}

}
