package java_programs;
//This program is used to demonstrate how constructor chaining happens.

//creating a parent class

class P_ConstructorChainingByThis {
//	creating a constructor having no parameter
	public P_ConstructorChainingByThis() {
		this(10);
		System.out.println("I am the parent class constructor having no parameter");
	}
	
//	creating a constructor having integer as parameter
	public P_ConstructorChainingByThis(int x) {
		this("hello");
		System.out.println("I am the parent class constructor having integer as parameter");
	}
//	creating a constructor having string as parameter
	public P_ConstructorChainingByThis(String s) {
		System.out.println("I am the parent class constructor having string as parameter");
	}
}
//driver class extends the P_ConstructorChaining
public class ConstructorChainingByThis extends P_ConstructorChainingByThis{
//	creating the main method
	public static void main(String[] args) {
		System.out.println("main method start executing");
		
//		Creating the object
		ConstructorChainingByThis ref=new ConstructorChainingByThis();
		
		System.out.println("Main method execution completed");
	}
}
