package java_test;

// This program is used to demonstrate can we override the private method or not
//Create the parent class
abstract class P_Method_Overriding_4 {
//	create the private method
//	private abstract void add(int num1,int num2);// Here we get compile time error
}

//Driver class
public class Method_Overriding_4 extends P_Method_Overriding_4 {
// overriding the add method
	private void add(int num1, int num2) {

		System.out.println("The addition of two number is " + (num1 + num2));
	}

	public static void main(String[] args) {
//		creating the object of that class
		Method_Overriding_4 obj = new Method_Overriding_4();
		obj.add(10, 20);

		/*
		 * Explanation:- Because we can't access the private data members out side the
		 * class area or another class
		 */
	}
}
