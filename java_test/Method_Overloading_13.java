package java_test;
//Program to check can we overload the final method or not
public class Method_Overloading_13 {
//	Creating the final method
	public final void details() {
		System.out.println("I am the final method with no parameter");
	}
	
//	create final method having string type parameter
	
	public final void details(String s) {
		System.out.println("I am the final method having the string type parameter");
	}
	
//	Creating the main method
	public static void main(String[] args) {
//	Creating the object
		Method_Overloading_13 obj = new Method_Overloading_13();
//		calling the methods
		obj.details();
		obj.details("hello");
		
	}

}
