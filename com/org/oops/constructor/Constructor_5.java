package com.org.oops.constructor;
//Program to understand that can use modifiers with the constructor or not.
public class Constructor_5 {
//	Creating an constructor with access modifires
	public Constructor_5() {
		System.out.println("I am the constructor having public access modifier");
	}
	protected Constructor_5(int i) {
		System.out.println("I am the constructor having protected access modifier");
	}
	 Constructor_5(byte b) {
		System.out.println("I am the constructor having default access modifier");
	}
	private Constructor_5(String s) {
		System.out.println("I am the constructor having private access modifier");
	}
	
//	Creating the non-access modifer
/*	static Constructor_5(String s,innt i) {
		
	}
	abstract Constructor_5(String s,byte b)
	{
		
	}
	final Constructor_5(String s,String y) {
		
	}
*/
//	creating the main method
	public static void main(String[] args) {
		Constructor_5 obj1 = new Constructor_5();
		Constructor_5 obj2 = new Constructor_5(10);
		Constructor_5 obj3 = new Constructor_5((byte)10);
		Constructor_5 obj4 = new Constructor_5("Kamal");
		
/*		Explanation:-
		We cannot use the non access modifier with the constructor.
*/
	}
}
