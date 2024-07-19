package java_programs;

import java.util.Scanner;

public class Odd_And_Even {
public static void main(String[] args) {
	//program to find out the given number is odd or even
	Scanner sc=new Scanner(System.in);
	//taking the input from user
	System.out.println("Enter the number to check::");
	int num=sc.nextInt();
	//applying the  condition
	if(num%2==0)
	{
		System.out.println("The number "+num+" is a even number");
	}
	else {
		System.out.println("The number "+num+" is a odd number");
	}
	sc.close();
}
}

