package java_test;
//Program to understand can we provide more than one abstract method to a fuctional interface with using @FunctionalInterface.
//creating the interface
@FunctionalInterface
interface P_Functional_Interface_2 {
//	Creating multiple abstract method
	void ask();
//	creating another abstract method
//	void details();//here we get compile time error.
	
/*	Explanation:-
	We can't provide the functional interface another abstract method with @FunctionalInterface notation because the notation makes a restriction 
	that the following interface will contain only one bstract method if we provide another abstract method then it will throw the compile time error.
*/	
}

