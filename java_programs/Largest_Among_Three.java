package java_programs;

import java.util.Scanner;

public class Largest_Among_Three {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter the first number::");
		int num1=sc.nextInt();
		System.out.println("Enter the first number::");
		int num2=sc.nextInt();
		System.out.println("Enter the first number::");
		int num3=sc.nextInt();
		//Checking the largest by using nested if else statement
		if(num1>num2)
		{
			if(num1<num3)
			{
				System.out.println(num3+" is greater");
			}
			else {
				System.out.println(num1+" is greater");
			}
		}
		else
		{
			if(num2<num3)
			{
				System.out.println(num3+" is greater");
			}
			else {
				System.out.println(num2+" is greater");

			}
		}
		
		sc.close();
	}

}
