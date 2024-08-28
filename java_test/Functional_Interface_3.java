package java_test;

//This program will demonstrate that can we extend the functional interface by another interface having abstract method only.
//creating an  normal interface having only one abstract method
interface GP_Functional_Interface_3 {
	void ask();
}

/*
 * @FunctionalInterface //Creating the faunctional interface interface
 * P_Functional_Interface_3 extends GP_Functional_Interface_3{//Here we get
 * compile time error. void details(); }
 */
public class Functional_Interface_3 {

	/*
	 * Explanation:- We can't inherit the normal interface having abstract method
	 * only to an fuctional interface because the functional interface inherits the
	 * normal interface method and contians more than one abstarct method so it is
	 * not a valid functional interface.
	 */
}
