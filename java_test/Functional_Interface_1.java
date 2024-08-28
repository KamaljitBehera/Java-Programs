package java_test;
//Program to understand can we provide more than one abstract method to a fuctional interface without using @FunctionalInterface.
//creating the interface
interface P_Functional_Interface_1{
//	Creating multiple abstract method
	void ask();
	
	void details();
}
//Driver class implements parent interface
public class Functional_Interface_1 implements P_Functional_Interface_1{

	@Override
	public void ask() {
		System.out.println("I am the ask method");	
	}

	@Override
	public void details() {
		System.out.println("i am the details method");
	}
//	Creating the main method
	public static void main(String[] args) {
//		creating the object
		Functional_Interface_1 obj = new Functional_Interface_1();
//		calling the methods
		obj.details();
		obj.ask();
		
		
/*		Explanation:-
		Yes we can provide more abstract method to an function interface without using @FunctionalInterface annotation
		but it is act as the normal interface.
*/		
	}
	
}
