package com.org.oops.inheritance;

//This program is used to demonstrate that how to use single inheritance by using the interface
//Creating the interface
interface P_Single_Inheritance_By_Interface {
//	creating methods
	default void greeting() {
		System.out.println("Hello there welcome!");
	}

	default void details() {
		System.out.println("I am the method of parent interface");
	}
}
//Driver class implementing the parent interface

public class Single_Inheritance_By_Interface implements P_Single_Inheritance_By_Interface {

//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Single_Inheritance_By_Interface ref = new Single_Inheritance_By_Interface();
//		calling the method
		ref.greeting();
		ref.details();
	}

}
