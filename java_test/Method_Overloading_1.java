package java_test;

//   This  program is used to demonstrate how up casting is occurred during method overloading
public class Method_Overloading_1 {
//      Create method having integer type as parameter
	public void square(int num) {
		System.out.println("I am the method having integer tpye as parameter");
		System.out.println("Up casting from character type to integer type is Done");
	}

//  Create method having float type as parameter
	public void square(float num) {
		System.out.println("I am the method having float tpye as parameter");
		System.out.println("Up casting from character type to float type is Done");
	}

//	 Creating the main method
	public static void main(String[] args) {
//		Create the object
		Method_Overloading_1 ref = new Method_Overloading_1();
//		Calling the square method having the character type as an argument
		ref.square('c');

		/*
		 * Explanation:- Here up casting is occurred that is lower data type character
		 * is converted to higher data type.
		 */

	}
}
