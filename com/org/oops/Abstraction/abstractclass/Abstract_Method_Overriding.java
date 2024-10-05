package com.org.oops.Abstraction.abstractclass;
// This program is used to demonstrate how to override the method of an abstract class

// Creating an abstract class

abstract class Abs{
//	creating two abstract method that to be override by the child class
	public abstract void details();
	public abstract void greeting();
}
//creating the child class
public class Abstract_Method_Overriding extends Abs{

	@Override
	public void details() {
		System.out.println("Hello there I am override by the child class method");
		
	}

	@Override
	public void greeting() {
		System.out.println("Welcome to my git hub java series");
		
	}
	
//	creating the main method
	public static void main(String[] args) {
//		creating the parent reference and child class object store in it.
		Abs obj=new Abstract_Method_Overriding();
//		calling the overridden method
		obj.greeting();
		obj.details();
		
	}
   
}
