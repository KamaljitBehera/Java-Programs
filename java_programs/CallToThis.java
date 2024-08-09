package java_programs;
//This program is used to demonstrate how we can use the call to this().

//Basically call to this() is used to call current class constructor.And used to achieve the constructor chaining concept.
public class CallToThis {
//create constructor having no parameter
	public CallToThis() {
		this("hello");
      System.out.println("I am constructor having no parameter");
	}

//create constructor having integer type parameter
	public CallToThis(int x) {
		this();
		System.out.println("I am constructor having int type parameter");
	}

//create constructor having string type parameter
	public CallToThis(String s) {
		System.out.println("I am constructor having string type parameter");
	}
	
//	creating the main method
	
	public static void main(String[] args) {
//		creating the abundant or anonymous object
		new CallToThis(10);
		
	
	}
}
