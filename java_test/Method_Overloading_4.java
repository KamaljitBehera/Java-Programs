package java_test;

//This program is used to  demonstrate method overloading with non-premitive as parameter
public class Method_Overloading_4 {
//	Creating a method having string as parameter
	public void calling(String s) {
		System.out.println("Method having String parameter is called");
	}

//	Creating a method having Method_Overloading_4 object as parameter
	public void calling(Method_Overloading_4 obj) {
		System.out.println("Method having Method_overloaing object parameter is called");
	}

//	creating the main method
	public static void main(String[] args) {
//		Creating the object
		Method_Overloading_4 ref = new Method_Overloading_4();
//		calling method having null as argument
//		ref.calling(null);//here we get compile time error

		/*
		 * Explanation:- In case of non primitive type parameter method overloading
		 * occurs when 1.All the overloaded method all the argument are related to each
		 * other then priority goes to child class 2.if not then we got ambiguity error
		 * Here in this case between String and Method_overloading_4 is both not related
		 * so we got compile time error
		 */
	}
}
