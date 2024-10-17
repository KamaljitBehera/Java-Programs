package com.org.oops.Abstraction._interface;
//Program to understand how to utilize the nested interface inside the class 
class P_NestedInterface_1 {
//	creating the method
	
	public void info() {
		System.out.println("I am the method of outer class");
	}
	
//	Creating the nested interface
	interface InnerInterface_1{
//		creating an default method
		default void information() {
			System.out.println("I am the method inside the inner interface");
		}
	}
}
//Driver class extends the parent class
public class NestedInterface_1 extends P_NestedInterface_1 implements P_NestedInterface_1.InnerInterface_1{
//	creating the main method
	public static void main(String[] args) {
//		creating the object 
		NestedInterface_1 obj = new NestedInterface_1();
//		calling both the  methods
		obj.info();
		obj.information();

		
//To use the inner interface method we have to implement that it is mandatory.Without doing that we cannot 
//		access it
		

	}
}
