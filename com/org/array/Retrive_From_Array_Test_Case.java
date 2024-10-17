package com.org.array;
//This program is used to get understand some facts about the retrive the data.
public class Retrive_From_Array_Test_Case {
	public static void main(String[] args) {
//		What happen when we try to access the data of index which is not present in array
//		let's see
		
		int arr[]= {10,20,30,40};
		System.out.println(arr[5]);//It does't give anny error but it throw an excption that is 
//		"ArrayindexOutOfBoundsException".
	}
}
