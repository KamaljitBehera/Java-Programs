package java_test;
//Program to understand the multiple way to implements the functional interface methods
//There basically three ways to implements the functional interface methods.

//creating the functional interface 
@FunctionalInterface
interface P_Functional_Interface_6{
	void greet();
}
//Driver class extending the functional interface 
public class Functional_Interface_6 implements P_Functional_Interface_6 {
//1. This is the one way of implementing the fuctional interface
	@Override
	public void greet() {
		System.out.println("Hello there everyone!");
	}
	
//Creating the main method
	public static void main(String[] args) {
//		2.By using Anonymous class
		P_Functional_Interface_6 obj=new P_Functional_Interface_6() {
			
			@Override
			public void greet() {
				System.out.println("I am get the implemetation by the anonymous class");
				
			}
		};
		
//		3.By using Lambda Expression
		P_Functional_Interface_6 obj1= ()-> System.out.println("I am get implemented by lambda expression");
		
//		Creating the object
		Functional_Interface_6 obj2 = new Functional_Interface_6();
		
		obj2.greet();
		obj1.greet();
		obj.greet();
	}


}
