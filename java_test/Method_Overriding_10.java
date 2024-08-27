package java_test;
// This program is used to demonstrate how to invoke the overridden method from the overriding method

// Creating the parent class
class P_Method_Overriding_10 {
//	creating the method 
	public void details() {
		System.out.println("I am the parent class method");
	}
}

//Driver class
public class Method_Overriding_10 extends P_Method_Overriding_10 {
//Overriding the details() method
	public void details() {
		super.details();
		System.out.println("I am the child class method");
	}

//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Method_Overriding_10 obj = new Method_Overriding_10();
		// calling the override method
		obj.details();
	}
}
