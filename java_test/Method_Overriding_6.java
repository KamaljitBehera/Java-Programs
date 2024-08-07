package java_test;

//This program is used to demonstrate can we override the final method
// Creating the parent class
abstract class P_Method_Overriding_6 {
//	creating the final method
//	public final void details() ;//here we get compile time error
}

public class Method_Overriding_6 extends P_Method_Overriding_6 {
//	trying to override the final method
	public final void details() {
		System.out.println("hello there");
	}

//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Method_Overriding_6 obj = new Method_Overriding_6();
		obj.details();

		/*
		 * Explanation:- We can't override the final method because the final method
		 * must have body parts provided once and in override we try to provide the
		 * bodyparts again so it raise the compile time error.
		 */
	}
}
