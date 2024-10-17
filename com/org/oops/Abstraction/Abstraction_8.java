package com.org.oops.Abstraction;
//This program is used to demonstrate that an abstract class can implements an interface or not
//Creating an interface
interface GP_Abstraction_8{
//	dclaring a method
	void greet();
}
abstract class P_Abstraction_8 implements GP_Abstraction_8{

	@Override
	public void greet() {
		System.out.println("good morning Everyone.");	
	}

}
//Driver class
//creating main method
public class Abstraction_8 extends P_Abstraction_8{
	public static void main(String[] args) {
//		creating the object
		Abstraction_8 obj=new Abstraction_8();
//		calling the overridden method
		obj.greet();
	}
}

