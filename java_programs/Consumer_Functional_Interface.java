package java_programs;

import java.util.function.Consumer;

//Program to understand that how to use and implement Functional Interface
//Consumer is a functional Interface and it ake only generic type as input and return nothing.
//And it has only one method that is accept(<T>)
public class Consumer_Functional_Interface  implements Consumer<Integer>{
//Implementing by overriding it
	@Override
	public void accept(Integer t) {
		System.out.println("implementation is provided by overriding it");
	}
//	creating the main method
	public static void main(String[] args) {
//		Implementing by using the anonymous class
		Consumer_Functional_Interface obj=new Consumer_Functional_Interface() {
			@Override
			public void accept(Integer t) {
				System.out.println("implementation is provided by anonymous class only");
			}
		};
		
//		Implementing using lambda expression
		Consumer<Integer> con=(value) -> System.out.println("Implemented by the lambda expression.");
		
//		calling the implemented memebers
		obj.accept(10);
		con.accept(20);
//		creating the object of the class
		Consumer_Functional_Interface obj2=new Consumer_Functional_Interface();
		obj2.accept(40);
	}
		}
