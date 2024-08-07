package java_test;
//This program is used to demonstrate that can we override the static method or not.

// creating the parent class
class P_Method_Overriding_7{
	
//	creating the static method
	static void details() {
		System.out.println("Hello there i am static method of parent class");
	}
}
//Driver class
public class Method_Overriding_7 extends P_Method_Overriding_7 {
//	override the static method
	static void details() {
		System.out.println("Hello there i am static method of parent class");
	}
//	creating the main method
	public static void main(String[] args) {
//		calling the static method
		details();//Hello there i am static method of parent class
		
/*		Explanation:-
		Because when we try to override the static method of parent class with the child class the 
		child class method content is being hide in parent implementations so we get the output 
		from parent implementation This concept is called Method hiding
*/
	}
}