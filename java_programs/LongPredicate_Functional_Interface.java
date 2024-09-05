package java_programs;

import java.util.function.LongPredicate;

//Program to understand how to pass the long type date to an predefined functional interface.
public class LongPredicate_Functional_Interface {
//	Creating the main method
	public static void main(String[] args) {
		// Predicate to check for equal to 500000
		LongPredicate longPredicate = (x) -> {
			return (x == 500000);
		};
		System.out.println("499999 is equal to 500000 " + longPredicate.test(499999));

		// Predicate to check for less than equal to 500000
		LongPredicate longPredicate1 = (x) -> {
			return (x <= 500000);
		};
		System.out.println("499999 is less than equal to 500000 " + longPredicate1.test(499999));

		// ANDing the two predicates
		LongPredicate longPredicate2 = longPredicate.and(longPredicate1);
		System.out.println("500000 is equal to 500000 " + longPredicate2.test(500000));

		// ORing the two predicates
		longPredicate2 = longPredicate.or(longPredicate1);
		System.out.println("500001 is less than equal to 500000 " + longPredicate2.test(500001));

		// Negating the predicate
		longPredicate2 = longPredicate1.negate();
		System.out.println("499999 is greater than 500000 " + longPredicate2.test(499999));

	}
	/*
	 * Note:-This is the example where we can pass int type of data in the
	 * predefined functional interface. And similarly all the predefined functional
	 * interface have their on varient and they are specially for passing the
	 * primitive type data type.
	 */

}
