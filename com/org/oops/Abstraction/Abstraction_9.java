package com.org.oops.Abstraction;
//This program demonstrate that the abstract class can have instance variable and if there then how to initialize it.
//Creating the abstract class
abstract class P_Abstraction_9 {
	String name;
	int age;
	
//	In abstract class we can create constructor but can't create object of abstract class
	
	public P_Abstraction_9(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
//	creating the method to print the data
	public void details() {
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
	}
}
//Driver class
public class Abstraction_9 extends P_Abstraction_9 {
	public Abstraction_9(String name, int age) {
		super(name, age);
		
	}
//	creating the main method
	public static void main(String[] args) {

		
//		creating the object
		
		Abstraction_9 ref=new Abstraction_9("kamaljit",20);
//		calling the method
		ref.details();
		
	}
}
