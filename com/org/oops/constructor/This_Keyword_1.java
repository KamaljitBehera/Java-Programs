package com.org.oops.constructor;
//This program is used to demonstrate how to use this keyword to access the current class instance variable
public class This_Keyword_1 {
//	creating the instance variable
	String name="Kamaljit";
	int age=20;
//	creating the method to print the instance variable
	public void details() {
		System.out.println("The name is "+this.name);
		System.out.println("The age is "+this.age);
	}
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		This_Keyword_1 obj=new This_Keyword_1();
//		calling the details method
		obj.details();
				
	}

}
