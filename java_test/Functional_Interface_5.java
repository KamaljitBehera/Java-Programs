package java_test;
//Program to understand the can we inherit the normal interface having the other function rather than abstract method.
//Creating the normal interface having  normal methods
interface P_Functional_Interface_5{
	//creating Static method
	static void ask() {
		System.out.println("I am the parent interface static method");
	}
	//creating the default method
	default void details() {
		System.out.println("I am the parent interface default method");
	}
}
//Creating the fuctional interface having the abstract method
@FunctionalInterface
interface C_Functional_Interface_5 extends P_Functional_Interface_5{
	void greet();
}
public class Functional_Interface_5 {
/*	Explanation:-
	We can inherit the other interface having concerete method only in function interface because it does't 
	break the condition to create the functional interface.
*/
}
