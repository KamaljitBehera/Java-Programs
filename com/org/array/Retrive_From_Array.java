package com.org.array;
//This program is used to demonstrate how we can access the data from the array.
public class Retrive_From_Array {
	public static void main(String[] args) {
//		We can access the data from the array by using loops 
		
//		By using while loop
		int array[]= {12,43,23,67,13,45,34,41};
		int arr_len=array.length;//Give the length of an array
		int i=0;
		while(arr_len>0) {
			System.out.println(array[i]);
			i++;
			arr_len--;
		}
		
//		By using for loop
		
		for(int j=0;j<array.length;j++) {
			System.out.println(array[j]);
		}
		
//		By using forEach loop
		
		for(int k:array) {
			System.out.println(k);
		}
	}
}
