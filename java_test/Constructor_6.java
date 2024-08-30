package java_test;
//Program to check that can we inherit the constructor or not.
//creating the parent class
class P_Constructor_6{
//	creating the constructor
	public P_Constructor_6() {
		System.out.println("I am the parent class onstructor");
	}
}
//Child class
public class Constructor_6 extends P_Constructor_6 {
//	overriding the constructor
/*	public P_Constructor_6() {
		System.out.println("I am overridden method");
	}//Here we get compile time error
*/
//	creating the main method
	public static void main(String[] args) {
//		Creating the object
		Constructor_6 obj = new Constructor_6();
	}

}
