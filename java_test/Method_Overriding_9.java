package java_test;
//This program is used to demonstrate how can we change the return type of method at time of method overriding
//Creating the parent class
class P_Method_Overriding_9{
	public Object details() {
		System.out.println("I am the method having Object type as return type");
		return null;
	}
	
}
//Driver class
public class Method_Overriding_9 extends P_Method_Overriding_9{
//	Create the override method with string type as return type
	public String details() {
		System.out.println("I am the method having String type as return type");
		return null;
	}
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Method_Overriding_9 obj=new Method_Overriding_9();
		obj.details();
	}
/*	Explanation:-
	When we try to change the return type of both override and overridden method having non-primitive returntype
	then it should follow the co_varient concept
	
	co-varient concept:-
	---------------------
	If the method have non-primitive type return type then at the time of overriding the override method return type should
	be the child class of Overridden method return type
*/
}
