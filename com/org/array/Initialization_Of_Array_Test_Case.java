package com.org.array;

//This program is used to demonstarte what data we can store in an array
public class Initialization_Of_Array_Test_Case {
	String name;
	public Initialization_Of_Array_Test_Case(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
//		We can store any type of data in an array but condition is data type of an array is declared according the data 
//		stored in the array,if it is primitive the primitive datatype is declared other wise object type is declared.
//		And array can store similar type of data.

//		Storing integer type data
		int arr[]= {10,20,30,40};
		
//		Storing string type data
		String [] array= {"hello","there"};
		
//		We can store the object of class as well
		
		Initialization_Of_Array_Test_Case obj[]= {new Initialization_Of_Array_Test_Case("kamal"),new Initialization_Of_Array_Test_Case("adarsha")};
		
	}
}
