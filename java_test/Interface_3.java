package java_test;

//This program demonstrate how we can create method with body part inside an interface
//creating an interface
interface InterfaceTry {
//   creating a method with body part by using static keyword
	static void details() {
		System.out.println("Hello! I am a method inside interface having body part by using static keyword");
	}

//	creating a method with body part by using default keyword
	default void greeting() {
		System.out.println("Hello! I am a method inside interface having body part by using default keyword");
	}
}

public class Interface_3 implements InterfaceTry {
	public static void main(String[] args) {
		// creating object of Interface_3
		Interface_3 obj = new Interface_3();
//      access by using the object of child class
		obj.greeting();
//		access directly
		InterfaceTry.details();
		/*
		 * Explanation:- static and default are introduce in interface in java 8
		 * features. By using these we can provide implementation to the method inside
		 * an interface as well.
		 */

	}
}
