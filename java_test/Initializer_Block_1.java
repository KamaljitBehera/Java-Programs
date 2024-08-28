package java_test;
//This program is used to understand that the execution flow of the initializer block.
//Java Program to Illustrate Initializer Block 

//Importing required classes 
import java.io.*; 

//Main class 
public class Initializer_Block_1 { 

	// Initializer block starts.. 
	{ 
		// This code is executed before every constructor. 
		System.out.println( 
			"Common part of constructors invoked !!"); 
	} 
	// Initializer block ends 

	// Constructor 1 
	// Default constructor 
	public Initializer_Block_1()  
	{ 

		// Print statement 
		System.out.println("Default Constructor invoked"); 
	} 

	// Constructor 2 
	// Parameterized constructor 
	public Initializer_Block_1(int x) 
	{ 

		// Print statement 
		System.out.println( 
			"Parameterized constructor invoked"); 
	} 

	// Main driver method 
	public static void main(String arr[]) 
	{ 

		// Creating variables of class type 
		Initializer_Block_1 obj1, obj2; 

		// Now these variables are 
		// made to object and interpreted by compiler 
		obj1 = new Initializer_Block_1(); 

		obj2 = new Initializer_Block_1(0); 
	} 
}
