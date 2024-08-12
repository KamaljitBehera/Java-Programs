package java_test;
//This program will demonstrate how the flow of constructor is happening.
//Creating a parent class
class P_Constructor_1{
//	creating a constructor
	public P_Constructor_1(){
		System.out.println("Hello There i am the parent class constructor");
	}
}
//Driver class which extends the P_Constructor_1
public class Constructor_1 extends P_Constructor_1 {
//   Creating the main method
	public static void main(String[] args) {
//		Create the object
		Constructor_1 obj=new Constructor_1();//Hello There i am the parent class constructor
		
/*		Explanation:-
		We get this output because if we doesn't provide any constructor the compiler implicitly provide a
		default constructor and each and every constructor there is a call to super() present which call the 
		parent class non-parameterised constructor.So we get that output.
*/
	}
}
