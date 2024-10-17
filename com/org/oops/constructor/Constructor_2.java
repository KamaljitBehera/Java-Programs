package com.org.oops.constructor;

//This program will demonstrate how the flow of constructor is happening.
//Creating a parent class
class P_Constructor_2 {
//	creating a constructor
	public P_Constructor_2(int x) {
		System.out.println("Hello There i am the parent class constructor");
	}
}

//Driver class which extends the P_Constructor_1
public class Constructor_2 extends P_Constructor_2 {
//	creating the constructor

//	to resolve the error we have to pass the call to super with argument explicitly
	public Constructor_2(int x) {
		super(x);
		System.out.println("Hello There i am the child class constructor");
	}

	/*
	 * public Constructor_2(){
	 * System.out.println("Hello There i am the child class constructor"); }//here we get compile time error
	 */
// Creating the main method
	public static void main(String[] args) {
//		Create the object
		Constructor_1 obj = new Constructor_1();// Hello There i am the parent class constructor

		/*
		 * Explanation:- We get error because compiler call the default constructor
		 * which has super() caller without any argument but the parent class
		 * constructor have parameterized constructor that's why we get compile time
		 * error.
		 */
	}
}