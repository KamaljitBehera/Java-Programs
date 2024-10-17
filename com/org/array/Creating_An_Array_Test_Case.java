package com.org.array;
//This program shows of some facts to creating an array.
public class Creating_An_Array_Test_Case {
	public static void main(String[] args) {
//		At the time of creating an array can we pass the size of an array as 0;
//		Let's try
		int arr[]=new int[0];//It is possible to create an array having 0 size
		
//		Can we give the negetive size to the array or not.
//		let's try
		int array[]=new int[-5];//we can't give the size of an array as negetive 
//		It doesn't give any error but it throw an exception That is "NegetiveSizeArrayException"
		
		
//		Which type of data can be accepted for the size of the array
//		int arr1[]=new int[flase];
//		int arr2[]=new int[10.2];
//		int arr3[]=new int[10.1f];
		int arr4[]=new int['a'];
//		int arr5[]=new int["kamal"];
		
//		We can use byte short int and char type value cn be used as the size of an array
	}

}
