package com.org.oops.constructor;
//this program will demonstrate how to use call to this() and where to use call to this()
public class CallToThis_2
{
	public CallToThis_2() {
      System.out.println("I am constructor having no parameter");
//      this("hello");//here  we get compile time error
	}

//create constructor having string type parameter
	public CallToThis_2(String s) {
		System.out.println("I am constructor having string type parameter");
	}
	
//	create the main method
	public static void main(String[] args) {
//		creating the object
		CallToThis_2 ref=new CallToThis_2();
		
/*		Explanation:-
		We eget compile time error because we have to use call to this() inside the constructor and it 
		should be the first line of code to be executed inside the constructor.
*/
	}
}
