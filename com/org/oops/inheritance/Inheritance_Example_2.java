package com.org.oops.inheritance;

//This program is used to understanding to access the constructor by using the parent class object references.
//Creating Parent_no1 class
class Parent_no1 {
	public Parent_no1() {
		System.out.println("Parent_no1 constructor is called");
	}
}

//creating Parent_no2 class extending the Parent_no1 class
class Parent_no2 extends Parent_no1 {
	public Parent_no2() {
		System.out.println("Parent_no2 constructor is called");
	}
}

//creating the driver class and extending with Parent_no2
public class Inheritance_Example_2 extends Parent_no2 {
	public static void main(String[] args) {
		// creating parent class reference and store the child class object
		Parent_no2 obj = new Inheritance_Example_2();
	}
}
