package java_test;
//This program is used to demonstrate how to handle exception at the time of method overriding

//grand parent class
class G_Method_Overriding_13 {
	public void details() throws RuntimeException
	{
		System.out.println("I am the method inside Grand parent");
	}
}
//parent-1class
class P1_Method_Overriding_13 extends G_Method_Overriding_13 {
	public void details() throws RuntimeException
	{
		System.out.println("I am the method inside Parent 1");
	}
}
//parent 2 class
class P2_Method_Overriding_13 extends G_Method_Overriding_13 {
	public void details() 
	{
		System.out.println("I am the method inside parent 2");
	}
}
public class Method_Overriding_13 extends G_Method_Overriding_13 {
/*	public void details() throws Exception
	{
		System.out.println("I am the method inside Driver class");
	}here we get compile time error
*/	
	
	public static void main(String[] args) {
/*		Explanation:-
		We get compile time error because if parent class throw any exception then the subclass overriding 
		method only throw the same exception or subclass exception but it does not throw the parent class 
		exception of the throwed exception.
*/		
	}
}
