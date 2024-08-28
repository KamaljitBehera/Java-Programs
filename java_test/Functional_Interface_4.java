package java_test;

//Program to understand can we inherit the fuctional interface to interface or not.
//Creating the functional Interfae
@FunctionalInterface
interface P_Functional_Interface_4 {
//	creating the abstract method
	void ask();
}

//Creating an normal interface with extendinf the functional interface.
interface C_Functional_Interface_4 extends P_Functional_Interface_4 {
//	creating own methods
	void details();
}

public class Functional_Interface_4 {
	/*
	 * Explanation:- We can inherit the functional interface because inheriting
	 * fuctional interface does't change any thing in the fuctional interface.
	 */
}
