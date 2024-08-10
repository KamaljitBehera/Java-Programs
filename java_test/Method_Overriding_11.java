package java_test;

//This program is used to demonstrate can we override the constructor or not 
//Creating the parent class
class P_Method_Overriding_11 {
//	creating the constructor
	public P_Method_Overriding_11() {
		System.out.println("I am the parent class constructor in side parent class");
	}
}

//Child class
public class Method_Overriding_11 extends P_Method_Overriding_11 {
//try to override the parent class constructor

	/*
	 * public P_Method_Overriding_11() {
	 * System.out.println("I am the parent class constructor in side child class");
	 * }//Here we get compile time error
	 */

	public static void main(String[] args) {
		/*
		 * Explanation:- We can't override the constructor because constructor name is
		 * same as the class namee but when we try to override it we need another class
		 * and creating the constructor inside the class but class name can't be similar
		 * to parent class. So we can't create the parent class constructor in child
		 * class.
		 */
	}
}
