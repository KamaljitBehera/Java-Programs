package com.org.oops.Abstraction._interface;
//Program to understand how to utilize the inner interface inside an interface.
//creating the parent interface
interface P_NestedInterface_2{
//	creating the default method
	default void info() {
		System.out.println("I am the method of outer interface");
	}
//	creating the nested interface
	interface InnerInterface_1{
		default void information() {
			System.out.println("I am the method of inner interface");
		}
	}
}
//Driver class implementing the interface having nested interface
public class NestedInterface_2 implements P_NestedInterface_2.InnerInterface_1,P_NestedInterface_2{
//	creating the main method
	public static void main(String[] args) {
//		creating the object 
		NestedInterface_2 obj = new NestedInterface_2();
//		calling both the  methods
		obj.info();
		obj.information();

		
//To use the inner interface method we have to implement that it is mandatory.Without doing that we cannot 
//		access it
}
}
