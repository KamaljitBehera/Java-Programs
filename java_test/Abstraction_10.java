package java_test;
//This program is used to demonstrate that can an abstract class contain normal method or concrete method.
//Creating an abstract class

abstract class P_Abstraction_10{
//	creating an abstract method
	public abstract void details();
	
//	creating a concrete method
	public void greet() {
		System.out.println("Hello there everyone!");
	}
}
//Driver class extending the abstract class
public class Abstraction_10 extends P_Abstraction_10 {

	@Override
	public void details() {
		System.out.println("I am the method present inside the abstract class and override");
	}
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Abstraction_10 obj=new Abstraction_10();
		
//		calling the concrete method
		obj.greet();
//		calling the overriden method
		obj.details();
	}

}
