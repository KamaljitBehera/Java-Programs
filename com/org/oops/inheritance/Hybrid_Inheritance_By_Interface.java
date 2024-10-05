package com.org.oops.inheritance;
//This used to demonstarte the hybrid inheritance and how to immplement it by using interface.
//Hybrid inheritance is the combination of all type of inheritance 

//Creating interface Super_Parent
interface Super_Parent {
	public void superMethod();
}

//Creating the Grand_Parent interface extending the Super_Parent
interface Grand_Parent extends Super_Parent {
	public void grandMethod();
}

//Creating the Most_Parent interface extending the Grand_Parent
interface Most_Parent extends Grand_Parent {
	public void mostMethod();
}

//By using the Super_Parent Grand_Parent and Most_Parent creating multilevel inheritance

//Creating One_1 interface extending Most_Parent
interface One_1 extends Most_Parent {
	public void greeting();
}

//Creating Two_2 interface extending Most_Parent
interface Two_2 extends Most_Parent {
	public void welcome();
}

//By using One_1 and Two_2 interface extends Most_parent is creating hirarchical inheritance


//Creating Three_3 interface extending One_1,Two_2 
interface Three_3 extends One_1, Two_2 {
	public void details();
}

//By extending the One_1,Two_2 is creating multiple inheritance

//Creating the child class implementing the Three_3
class Child_4 implements Three_3 {
//	Overriding all the abstract method of parent interfaces
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

	public void superMethod() {
		System.out.println("I am Super_Parent interface");
	}

	public void grandMethod() {
		System.out.println("I am Grand_Parent interface");
	}

	public void mostMethod() {
		System.out.println("I am Most_Parent interface");
	}
}

//And here implementing the Three_3 interface creating single inheritance 

public class Hybrid_Inheritance_By_Interface {
	public static void main(String[] args) {
		// Creating object of Child_4 class
		Child_4 ref = new Child_4();
//		Accessing all the methods
		ref.superMethod();
		ref.grandMethod();
		ref.mostMethod();
		ref.greeting();
		ref.welcome();
		ref.details();
	}

}
