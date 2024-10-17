package com.org.oops.constructor;
//This program is used to describe the risk may package java_programs;

//creating a parent class

class P_Risk_In_ConstructorChaining {
//	creating a constructor having no parameter
	public P_Risk_In_ConstructorChaining() {
		this(10);
		System.out.println("I am the parent class constructor having no parameter");
	}
	
//	creating a constructor having integer as parameter
	public P_Risk_In_ConstructorChaining(int x) {
		this("hello");
		System.out.println("I am the parent class constructor having integer as parameter");
	}
//	creating a constructor having string as parameter
	public P_Risk_In_ConstructorChaining(String s) {
//		this();//By adding this line we get compile time error
		System.out.println("I am the parent class constructor having string as parameter");
	}
}
//driver class extends the P_Risk_In_ConstructorChaining
public class Risk_In_ConstructorChaining extends P_Risk_In_ConstructorChaining{
//	creating the main method
	public static void main(String[] args) {
		System.out.println("main method start executing");
		
//		Creating the object
		Risk_In_ConstructorChaining ref=new Risk_In_ConstructorChaining();
		
		System.out.println("Main method execution completed");
		
/*		Explanation:-
		Because if we use that line the it create a loop which will never terminate so we get compile time error.
*/
	}
}
 