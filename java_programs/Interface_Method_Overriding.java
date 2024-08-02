package java_programs;

//This program is used to demonstrate how to override the method of an abstract class

//Creating an abstract class

interface Inter{
//	creating two abstract method that to be override by the child class
	public abstract void details();
	public abstract void greeting();
}
//creating the child class
public class Interface_Method_Overriding implements Inter{

	@Override
	public void details() {
		System.out.println("Hello there I am override by the child class method");
		
	}

	@Override
	public void greeting() {
		System.out.println("Welcome to my git hub java series");
		
	}
	
//	creating the main method
	public static void main(String[] args) {
//		creating the parent reference and child class object store in it.
		Inter ref=new Interface_Method_Overriding();
//		calling the overridden method
	    ref.greeting();
	    ref.details();
		
	}

}