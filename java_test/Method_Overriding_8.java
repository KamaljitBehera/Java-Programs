package java_test;
//This program is used to demonstrate is the return type of overridden method is different or not
// creating the parent class
class  P_Method_Overriding_8{
//	creating a method having integer type return type
	public int details() {
		System.out.println("I am the integer type return type method");
		return 0;
	}
}
//Driver Class

public class Method_Overriding_8 extends P_Method_Overriding_8{
  //Overriding the details() with float return type
/*	public float details() {
		System.out.println("I am the float type return type method");
		return 0;
	
	}
*/
/*
 * Explanation:- We can change the return type of any method at the time of
 * overriding but both override and overridden method should be in non-primitive
 * and follow some rules . We can't change the return type if it is primitive
 * type return type
 */
	public static void main(String[] args) {
		
	}
}
