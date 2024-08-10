package java_programs;
//This program is used to demonstrate how constructor chaining happens.

//creating a parent class

class P_ConstructorChaining {
//	creating a constructor having no parameter
	public P_ConstructorChaining() {
		this(10);
		System.out.println("I am the parent class constructor having no parameter");
	}
	
//	creating a constructor having integer as parameter
	public P_ConstructorChaining(int x) {
		this("hello");
		System.out.println("I am the parent class constructor having integer as parameter");
	}
//	creating a constructor having string as parameter
	public P_ConstructorChaining(String s) {
		System.out.println("I am the parent class constructor having string as parameter");
	}
}
//driver class extends the P_ConstructorChaining
public class ConstructorChaining extends P_ConstructorChaining{
//	creating the main method
	public static void main(String[] args) {
		System.out.println("main method start executing");
		
//		Creating the object
		ConstructorChaining ref=new ConstructorChaining();
		
		System.out.println("Main method execution completed");
	}
}
