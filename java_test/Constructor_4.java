package java_test;
//Program to understand that can we apply the return type to any constructor or not.
public class Constructor_4 {
//	creating the constructor 
	public void Constructor_4 () {
		System.out.println("I am the constructor having return type");
//		This should be output after creating the object of this class
	}
//		creating the main method
	public static void main(String[] args) {
//		Creating the object and calling the constructor
		Constructor_4 obj = new Constructor_4(); //Here output is nothing
		obj.Constructor_4();//as it become a method 
	}
	
/*  Explanation:-
	The constructor we create with return type is actually become a method.In java we can't provid return type to 
	constructor if we give than it act as method.It doesn't give any error.
*/	
}
