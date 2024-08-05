package java_test;

//This program is used to  demonstrate method overloading with non-premitive as parameter
public class Method_Overloading_5 {
//	Creating method having Object type as an argument
	public void calling(Object o) {
		System.out.println("I am the method having object type parameter");
	}

//	Creating method having String type as an argument
	public void calling(String s) {
		System.out.println("I am the method having string type parameter");
	}

//	Creating main method
	public static void main(String[] args) {
//	Creating the object
		Method_Overloading_5 ref = new Method_Overloading_5();
//		calling the method
		ref.calling("hello there");

		/*
		 * Explanation:- Here String and Object are both related to each other so here
		 * priority goes tochild class that is string.
		 */
	}

}
