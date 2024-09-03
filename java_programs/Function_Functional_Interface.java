package java_programs;

import java.util.function.Function;
import java.util.function.Supplier;

public class Function_Functional_Interface implements Function<Integer, Integer>{
// Overriding the Function interface abstract method
	@Override
	public Integer apply(Integer t) {
		System.out.println("I am implemeted by the method overriding");
		return null;
	}
	
//	Creating the main method
	
	public static void main(String[] args) {
//		Implementing using the anonymous class
		Function_Functional_Interface ffi = new Function_Functional_Interface() {
			public Integer apply(Integer t) {
				System.out.println("I am implemeted by the anonymous class");
				return null;
			}
		};
//		Implementing using lambda expression
		Function<Integer, Integer> ref = (x) -> {
			System.out.println("Implementation Provided by the Lambda expression");
			return x;
			};
	   
			
//			Access the implementation ways
//			Calling the override way
//			Creating the object
			
			Function_Functional_Interface obj = new Function_Functional_Interface();
			obj.apply(10);
			
//			Calling the anonymous class
			ffi.apply(20);
			
//			calling the lambda expression
			ref.apply(30);
	

}
}
