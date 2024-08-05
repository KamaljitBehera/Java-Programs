package java_test;

//       This program demonstrate how up casting is performed at the time of method overloading
public class Method_Overloading_3 {
//	Creating a method having byte type as an argument
	public void ask(byte b) {
		System.out.println("Hello There! I am ask method having byte type As parameter");
	}

//	Creating a method having byte type as an argument
	public void ask(short s) {
		System.out.println("Hello There! I am ask method having short type As parameter");
	}

//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Method_Overloading_3 obj = new Method_Overloading_3();
//		Calling method having byte type as argument
		byte b = 10;
		obj.ask(b);
//		Calling method having short type as argument		
		short s = 10;
		obj.ask(s);

//		obj.ask(10);//Here we get compile time error

		/*
		 * Explanation:- Here as we pass directly 10 as an argument it take it as by
		 * default integer type. And here we have short and byte type parameter method
		 * which is not compatible
		 */

	}

}
