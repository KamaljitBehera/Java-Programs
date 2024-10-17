package com.org.oops.constructor;
//This program is used to demonstrate how to use this key word as method argument
public class This_Keyword_3 {
//    creating some instance variable
	String city="Bhubaneswar";
	String state="Odisha";
	
//	create a method that take object as an argument
	public void display(This_Keyword_3 obj) {
		System.out.println("The city is "+obj.city+"The state is "+obj.state);
	}
//	create a method that call the display method by passing this keyword as an argument
	public void get(){
		display(this);
	}
	
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		This_Keyword_3 ref=new This_Keyword_3();
//		call the get method
		ref.get();
	}
}
