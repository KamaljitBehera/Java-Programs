package java_test;

//This program will demonstrate that if a class overloaded method and one of method is override then and call the parent class method and inside that method calling the other 
//Overloaded method then which method getting executed either parent class or not
//For btter undersatnding prefer the program.
//creating the parent class
class P_Method_Overloading_And_Overriding {
	// Creating the first method
	public void greet(int i) {
		System.out.println("I am the parent class method having the int type parameter");
		greet("kamal");
	}

//	creating the overloaded method with string type as an parameter
	public void greet(String n) {
		System.out.println("I am the parent class method having the String type parameter");
	}
}

//Driver class extending the parent class
public class Method_Overloading_And_Overriding extends P_Method_Overloading_And_Overriding {
//	override the one of the overloaded method
	public void greet(String n) {
		System.out.println("I am the child class method having the String type parameter");
	}

//	creating the main method
	public static void main(String[] args) {
//		Creating the object of child class
		Method_Overloading_And_Overriding obj = new Method_Overloading_And_Overriding();
//		calling the method having in type parameter
		obj.greet(10);
		/*
		 * Explantion:- Child class method inherited all the method of child class.but
		 * whent we call the method always overriden method executed.
		 */
	}

}
