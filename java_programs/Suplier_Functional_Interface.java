package java_programs;

import java.util.function.Supplier;

//Program is used to demonstrate how to use and implement the Suplier interface. 
//Suplier interface is the functional interface which doesn't take any input but return any type of data.
//And it has the method get().
public class Suplier_Functional_Interface implements Supplier<Integer> {
// Implemented by method overriding
	@Override
	public Integer get() {
		System.out.println("I am implemented by overriding");
		return 10;
	}
	 
//	creating the main
	public static void main(String[] args) {
//		Implementing using the anonymous class
		Suplier_Functional_Interface SFI = new Suplier_Functional_Interface() {
			public Integer get() {
				System.out.println("I am implemented by anonymous class");
				return 10;
			}
		};
		
//		Implementing by using the lambda expression
		Supplier<Integer> obj=()->{
				System.out.println("Implemented by the lambda expression.");
			return 10;
		};
		
//		Access all the ways of mplementation
//		Calling the override method
//		creating the object of class
		Suplier_Functional_Interface ref = new Suplier_Functional_Interface();
		ref.get();
//		Calling the anonymous class
		SFI.get();
//		Calling the lambda expression
		obj.get();
	}
	
	
}
