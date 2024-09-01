package java_programs;

import java.util.function.Supplier;

//Program is used to demonstrate how to use and implement the Suplier interface. 
public class Suplier_Functional_Interface implements Supplier<Integer> {
// Implemented by method overriding
	@Override
	public Integer get() {
		System.out.println("I am implemented by overriding");
		return 10;
	}
	 
//	creating the main
	public static void main(String[] args) {
		
	}
	
	
}
