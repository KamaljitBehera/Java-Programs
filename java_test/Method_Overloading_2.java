package java_test;

//    This program demonstrate how up casting is performed at the time of method overloading
public class Method_Overloading_2 {
//    Creating the method having byte type as parameter
	public void called(byte b) {
		System.out.println("I am the method having byte tpye as parameter");
		System.out.println("Up casting from character type to byte type is Done");
	}
//  Creating the method having double type as parameter
	public void called(double d) {
		System.out.println("I am the method having double tpye as parameter");
		System.out.println("Up casting from character type to double type is Done");
	}
	
//	creating main method
	
	public static void main(String[] args) {
//		Creating the object
		Method_Overloading_2 obj=new Method_Overloading_2();
//		Calling the method by passing the character type as argument
		obj.called('c');
		
/*		Explanation:-
 *       Here up casting is performed until a compatible type is not found.
 *       Here in this case character is greater then byte type so it is not compatible but 
 *       double is greater than character type so it is compatible
 */
		
		
	}
}
