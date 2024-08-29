package java_test;
//program to check whether the private method can be overloaded or not.
public class Method_Overloading_12 {
//	creating the private method
	private void ask() {
		System.out.println("I am the private method having no parameter");
	}
//overloading the private method with int type parameter
	private void ask(int i) {
		System.out.println("I am the overloaded method having the int type parameter");
	}
	
//	Creating the main method
	public static void main(String[] args) {
//		Creating th eo bject of the class
		Method_Overloading_12 ref = new Method_Overloading_12();
//		calling the method
		ref.ask();
		ref.ask(10);
	}
}
