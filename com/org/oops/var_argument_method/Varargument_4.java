package com.org.oops.var_argument_method;
//This program is used to demonstrate the importance of var-argument method in method overloading 
public class Varargument_4 {
//	creating method having normal parameter
	public void details(int num) {
		System.out.println("I am the method having normal parameter");
	}
//	creating the method having var-argument method
	public void details(int... num ) {
		System.out.println("I am the method having var-argument parameter");
	}
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Varargument_4 obj=new Varargument_4();
		obj.details(1);//Here priority goes to the normal method 
	}

}
