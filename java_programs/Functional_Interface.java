package java_programs;
//Program to understand how to use the functional interface and What is a functional interface.

//Functional interface:-It is a interface which has only one abstract method. More than one abstract method is not avalid functional interface.
//It act as a normal interface

//creating a functional interface
interface InterFunction{
//	creating only one abstract method
	void ask();
}
public class Functional_Interface implements InterFunction {

	@Override
	public void ask() {
		System.out.println("I am the function interface abstract method");
		
	}
//	creating the main metthod
	public static void main(String[] args) {
//		Creating th object
		Functional_Interface fi=new Functional_Interface();
//		calling the method
		fi.ask();
	}



}
