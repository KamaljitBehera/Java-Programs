package com.org.oops.inheritance;

//This program is used to demonstrate the multiple inheritance through interface
//creating the interface inter1
interface Inter1{
	//creating the default method show()
	default void show() {
		System.out.println("inter1 show() method is called");
	}
}
//creating the interface inter2
interface Inter2
{
	//creating the default method show()
	default void show() {
		System.out.println("inter2 show() method is called");
	}
}
//creating the implemented class 
public class Inheritance_Example_3 implements Inter1,Inter2 {
  public void show() {
  	//call the show method through interface name
  	//we can't use it directly in main method
  	Inter1.super.show();
  	Inter2.super.show();
  	}
	public static void main(String[] args) {
		//creating the object of implemented class 
		Inheritance_Example_3 ref=new Inheritance_Example_3();
		//calling the show()
		//it class the current class show() method
		ref.show();
	}

}
