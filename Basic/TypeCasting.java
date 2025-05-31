package basics;

public class TypeCasting {
	public static void main(String[] args) {
	/*int intValue = 100;
		//implicit type casting from int to long
		long longvalue= intValue;
		//implicit type casting from long to double
		double doublevalue=longvalue;
		System.out.println(intValue);
		System.out.println(longvalue);
		System.out.println(doublevalue);
		*/
		double doublevalue = 100.98;
		//explicit type casting from double to int
		int intvalue = (int)doublevalue;
		System.out.println(doublevalue);
		System.out.println(intvalue);
	}

}
