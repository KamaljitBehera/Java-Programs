package java_programs;
//Program to understand the use of this() in constructor overloading.
//By using call to this() we can access the current class constructor.
//Creating the class
class P_Constructor_Overloading_With_This{
//	Creating constructor having int and string type as parameter
	public P_Constructor_Overloading_With_This(int i,String s) {
		System.out.println("I am the constructor having int and string type as parameter");
	}
//	creating the constructor having int and another int type as argument
	public P_Constructor_Overloading_With_This(int x,int y) {
		this(10,"kamal");
		System.out.println("I am the constructor having two int type as parameter");
	}
//	creating the constructor accepting object type as parameter
	public P_Constructor_Overloading_With_This(Object o) {
		this(10,10);
		System.out.println("I am the constructor accepting object type as parameter");
	}
}
public class Constructor_Overloading_With_This {
//	creating the main method
	public static void main(String[] args) {
//		creating the object of P_Constructor_Overloading_With_This class
		P_Constructor_Overloading_With_This obj = new P_Constructor_Overloading_With_This("kamal");
		
//		By using call to this() we can access multiple constructor by creating only one object.
	}
}
