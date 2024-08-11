package java_test;
//This program is used to demonstrate how to use this keyword to return current class instance
public class This_Keyword_2 {
//creating some instance variable
	String name="Kamaljit";
	int age=22;
	
//	Create method that return the current class instance by using this keyword
	public This_Keyword_2 get() {
		return this;
	}
//	creating the method to print the instance variable
	public void details() {
		System.out.println("The name is "+this.name);
		System.out.println("The age is "+this.age);
	}
	
//	creating main method
	public static void main(String[] args) {
//		creating the object
		This_Keyword_2 ref=new This_Keyword_2();
		ref.get().details();
	}
}
