package java_programs;
//Program to understand how the constructor overloading is perferm and the use of constructor overloading
//Creating a class
class P_Constructor_Overloading{
//	creating a constructor with no argument
	public P_Constructor_Overloading() {
		System.out.println("I am the constructor having no parameter");
	}
//	creating constructor having integer type parameter
	P_Constructor_Overloading(int i){
		System.out.println("I am the constructor having integer type parameter");
	}
//	Creating an constructor having String type parameter
	public P_Constructor_Overloading(String s) {
		System.out.println("I am the constructor having string type as parameter");
	}
}

public class Constructor_Overloading {
public static void main(String[] args) {
//	creating the constructor having no argument
	P_Constructor_Overloading obj = new P_Constructor_Overloading();
//		creating the constructor having in type as argument
	P_Constructor_Overloading obj1 = new P_Constructor_Overloading(10);
//	creating the constructor having string type argument
	P_Constructor_Overloading obj2 = new P_Constructor_Overloading("Kamal");
}
}
