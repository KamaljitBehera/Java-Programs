package com.org.oops.constructor;

//To demonstrate that can we use the this keyword inside main method or any static method
public class This_Keyword_0 {
//	creating the instance variable
	String name="Kamaljit";
	int age=20;
//	creating the method to print the instance variable
/*	public static void details() {
		System.out.println("The name is "+this.name);
		System.out.println("The age is "+this.age);
	}//here we get compile time error because this keyword cann't use inside the static method
*/	
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		This_Keyword_1 obj=new This_Keyword_1();
//		calling the details method
		obj.details();
				
	}
}
