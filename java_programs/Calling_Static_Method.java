package java_programs;
//This program is used to demonstrate how to call the static methods
//Basically we can call a static method using three ways 

//creating the class
class P_Calling_Static_Method{
//	Creating static method
	public static void greet() {
		System.out.println("Hello Good morning everyone");
	}
	
//	creating the nonststic method
	public void message() {
		System.out.println("i am a nonstatic method call from a nonstatic area");
//		calling the static method 
		greet();
	}
}
public class Calling_Static_Method extends P_Calling_Static_Method{
///creating the main method
	public static void main(String[] args) {
//		1.By using object reference
//		creating the object
		P_Calling_Static_Method obj = new P_Calling_Static_Method();
//		calling the method 
		obj.greet();
		
//		2.By directly 
		greet();
		
//		3.By using the class name
		P_Calling_Static_Method.greet();
	}
}
