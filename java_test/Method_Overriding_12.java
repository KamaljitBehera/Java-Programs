package java_test;

//Java program to demonstrate overriding when
//superclass method does not declare an exception

class P_Method_Overriding_12 {
	void m1() { System.out.println("From parent m1()"); }

	void m2() { System.out.println("From parent m2()"); }
}

public class Method_Overriding_12 extends P_Method_Overriding_12 {
	@Override
	// no issue while throwing unchecked exception
	void m1() throws ArithmeticException
	{
		System.out.println("From child m1()");
	}

	// compile-time error
	// issue while throwing checked exception
/*	void m2() throws IOException
	{
		System.out.println("From child m2");
	}
*/
	public static void main(String[] args) {
/*		Explanation:-
		--------------
		We get compile time error because if parent class or interface overridden method does not throw any
		exception then the child class can only throw thw unchecked exception if throw checked exception then 
		we get error
*/
	}
}
