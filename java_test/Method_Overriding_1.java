package java_test;
//This program is illustrate how method overriding by using Child class reference object
//for method overriding minimum two class is required and they should be in relation
//Create a parent class
class P_Method_overriding{
	public void details() {
		System.out.println("Hello there! I am the method inside Parent class");
	}
}
//Creating the child class
public class Method_Overriding_1 extends P_Method_overriding {
	//override the parent class method
	public void details() {
		System.out.println("Hello everyone! I am the method inside child class");
	}
     public static void main(String[] args) {
//		creating object parent class and call the override method
    	 Method_Overriding_1 ref=new Method_Overriding_1();
//    	 calling the details method
    	 ref.details();
	}
}
