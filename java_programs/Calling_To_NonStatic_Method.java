package java_programs;
//This is used for get understanding about how to call the nonstatic method of a class or another class.
//To calling a nonstatic method inside a static area we have to create the object of the class.This is the one and only way to access.

//We can use the nonstatic method calling in inheritance similar way.

//Creating anew class
class P_Calling_To_NonStatic_Method{
//	Creating nonstatic method
	public void greet() {
		System.out.println("Hello Good morning everyone");
	}
}
public class Calling_To_NonStatic_Method {
//	creating the nonstatic method here
	public void details() {
		System.out.println("I am the nonstatic method present in side the Calling_To_NonStatic_Method class ");
		
//		calling the nonstatic method from a nonstatic area
		message();
	}
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		P_Calling_To_NonStatic_Method obj = new P_Calling_To_NonStatic_Method();
//		calling the nonstatic method
		obj.greet();
//		creating the current class object
		Calling_To_NonStatic_Method ref = new Calling_To_NonStatic_Method();
//		calling the nonstatic method
		ref.details();
	}
	
//	Craeting a new nonstatic method
	
	public void message() {
		System.out.println("i am a nonstatic method call from a nonstatic area");
	}
}
