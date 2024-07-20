package java_programs;

import java.util.Scanner;

public class Odd_In_Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking the range from user
		System.out.println("Enter the range::");
		int num=sc.nextInt();
		//to print the odd number in the range we have to use for loop
		for(int i=0;i<num;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
