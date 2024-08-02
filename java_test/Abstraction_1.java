package java_test;
// This program is used to demonstrate that are we able to create the object of abstract method or not

// Creating an abstract class
abstract class Test {
//   As we no an abstract class both have abstract as well as concrete method
//	Creating an non static method
	public void calling() {
		System.out.println("Hello There");
		System.out.println("I am a non static method of abstract class test");
	}
}

public class Abstraction_1 {
//  creating the main method
	public static void main(String[] args) {
//		creating the object of abstract class Test
//		Test obj=new Test();//here we get compile time error

//		Explanation:-
//		We can not create an object of abstract class 
	}
}
