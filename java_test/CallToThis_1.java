package java_test;
//This program is used to check whether call to this() is used inside the method
public class CallToThis_1 {
// Create the first method 
	void method1()
	{
		System.out.println("Hello there i am method1");
	}
//	Create the second method
	void method2(int x)
	{
//		this();//here we get compile time error
		System.out.println("Hello there i am method1");
	}
//	create the second method
	public static void main(String[] args) {
//		create the object
		CallToThis_1 obj=new CallToThis_1();
//		calling the method 2
		obj.method2(10);
		
/*		Explanation:-
		We get compile time error because call to this() is only used inside the constructors.
*/
	}
}
