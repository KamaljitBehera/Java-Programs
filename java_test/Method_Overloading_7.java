package java_test;
//This program demonstrate can  we overload the static method or not
public class Method_Overloading_7 {
//  Create method having integer type as parameter
public static void square(int num) {
	System.out.println("I am the method having integer tpye as parameter");
	System.out.println("Up casting from character type to integer type is Done");
}

//Create method having float type as parameter
public static void square(float num) {
	System.out.println("I am the method having float tpye as parameter");
	System.out.println("Up casting from character type to float type is Done");
}

// Creating the main method
public static void main(String[] args) {
//	Calling the square method having the character type as an argument
	square('c');

	/*
	 * Explanation:- Here up casting is occurred that is lower data type character
	 * is converted to higher data type. And we can overload both static and non static
	 * as method. 
	 */

}
}
