package java_test;
//This program is used to demonstrate how to call a static method having primitive and non-primitive type as 
//parameter
//creating the class
class P_Static_Method_1{
//	Creating static method with primitive type as an argument
	public static void greet(int i) {
		System.out.println("Hello Good morning everyone");
	}
	
//	Creating static method with primitive type as an argument
	public static void greet(String s) {
		System.out.println("Hello Good morning everyone");
	}
	
}
//Driver class 
public class Static_Method_1 extends P_Static_Method_1 {
//	creating the main method
	public static void main(String[] args) {
//		1. By using object refernce
//		creating object
		Static_Method_1 obj = new Static_Method_1();
//		calling both the method
		obj.greet(10);
		obj.greet("hello");
		
//		2.By using directly
		greet(10);
		greet("kamal");
		
//		3.by using the class name
		P_Static_Method_1.greet(40);
		P_Static_Method_1.greet("adarsh9");
	}

}
