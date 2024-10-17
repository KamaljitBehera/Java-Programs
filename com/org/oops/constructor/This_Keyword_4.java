package com.org.oops.constructor;
//This Program is used to demonstrate how to use this keyword to invoke the current class method
public class This_Keyword_4 {
//	create the first non-static method
	public void display() {
		this.greet();
		System.out.println("I want to become a very good software developer");
	}
//	creating the second method call by the first method 
	void greet() {
		System.out.println("Hello there everyone Welcome to my github repository");
	}
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		This_Keyword_4 obj=new This_Keyword_4();
//		calling the first method
		obj.display();
	}

}
