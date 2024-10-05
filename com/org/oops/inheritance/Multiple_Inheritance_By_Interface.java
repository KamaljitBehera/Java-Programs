package com.org.oops.inheritance;
// This program is used to demonstarte how the mutiple inheritance is implemented by the interface

//Creating interface One
interface One {
	public void greeting();
}

//Creating interface Two
interface Two {
	public void welcome();
}

//Create interface three extending both the interface simultaneously
interface Three extends One, Two {
	public void details();
}


//Creating a class inplementing the interface Three
class Child_1 implements Three {
//	Override all the parent interface method
	@Override
	public void greeting() {
		System.out.println("Hello There");
	}

	public void welcome() {
		System.out.println("welcome everyone");
	}

	public void details() {
		System.out.println("Multiple inheritance by interface program executed successfully");
	}
}

//Driver class
public class Multiple_Inheritance_By_Interface {
	public static void main(String[] args) {
		
//		Creating the object of implemented child class
		Child_1 c = new Child_1();
//		Accessing the methods
		c.greeting();
		c.welcome();
		c.details();
	}
}
