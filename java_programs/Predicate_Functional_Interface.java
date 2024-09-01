package java_programs;

import java.util.function.Predicate;

//Program to understand that how to use and implement Predicate Functional Interface.
//Predicate is a functional Interface and it take only generic type as input and return boolean type data.
//And it has only one method that is test(<T>)
public class Predicate_Functional_Interface  implements Predicate<Integer>{
//Implementing by overriding it
	@Override
	public boolean test(Integer t) {
		System.out.println("Implemetation provided by overriding the method");
		return false;
	}
//	creating the main method
	public static void main(String[] args) {
//		Implementing by using the anonymous class
		Predicate_Functional_Interface obj=new Predicate_Functional_Interface() {
			@Override
			public boolean test(Integer t) {
				System.out.println("implementation is provided by anonymous class only");
				return false;
			}
		};
		
//		Implementing using lambda expression
		Predicate<Integer> pd=(value) -> {
			System.out.println("Implemented by the lambda expression.");
			return false;
		};
		
		
//		calling the implemented memebers
		obj.test(10);
		pd.test(20);
//		creating the object of the class
		Predicate_Functional_Interface obj2=new Predicate_Functional_Interface();
		obj2.test(40);
	}

		}


