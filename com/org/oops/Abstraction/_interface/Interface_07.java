package com.org.oops.Abstraction._interface;

//this program is used to demonstrate that how to implement a method contained by two different interface having same method signeture 
// but different primitive type of return type.
// Creating interface 1
interface ClassParent1 {
	// Creating method
	public int details();
}

//Creating interface 2
interface ClassParent2 {
	// Creating same method
	public float details();
}

//implemented class
public class Interface_07
{
	public static void main(String[] args) {
//    	creating the object of implemented class
		Interface_07 obj = new Interface_07();
//    	obj.details(10);
		/*
		 * Explanation:- If more than one interface having same method signature but
		 * different return type then it is impossible to provide the implementation
		 */
	}

	/*
	 * public int details() {
	 * System.out.println("Hello there i am a method with float return type");
	 * }//here we get compile time error public float details() {
	 * System.out.println("Hello there i am a method with float return type");
	 * }//here we get compile time error
	 */
}
