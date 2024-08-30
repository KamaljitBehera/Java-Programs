package java_test;
//Program to check at the time of method overriding can we override the instance data members or not.
//Creating the class
class P_Method_Overriding_16{
//	Declaring the instance variables
	String greet="Good Morning";
	public void greet() {
		System.out.println(greet);
	}
}
public class Method_Overriding_16 extends P_Method_Overriding_16 {
   
//	greet="HEllo There";//here we get compile time error
	String greet="Hello there!";
//	Overrid the parent class method
	public void greet() {
		System.out.println(greet);
	}
	
//	Creating the main method
	public static void main(String[] args) {
//		creating the object of both parent as well as child class
		Method_Overriding_16 obj=new Method_Overriding_16();
		System.out.println(obj.greet);
//		calling the method
		obj.greet();
		
		P_Method_Overriding_16 ref=new P_Method_Overriding_16();
		System.out.println(ref.greet);
//		calling the method
		ref.greet();
		
		
/*    	Explantion:-
		We can override the method or function present inside the super class but not able to override the instance variable present
		inside that.Late binding cannot achive by the data members.
*/	
	}
}
