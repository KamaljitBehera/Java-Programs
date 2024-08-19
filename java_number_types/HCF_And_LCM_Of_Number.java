package java_number_types;
//Write the program to find out the highest and least number which is completely divisible by both numbers.

import java.util.Scanner;

public class HCF_And_LCM_Of_Number {
	public static void main(String args[])
	 {
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
	int num1,num2,reminder,x,y,l;
//	taking the first number input from user
	System.out.println("Enter 1st number");
	num1=sc.nextInt();
//	taking the first number input from user
	System.out.println("Enter 2nd number");
	num2=sc.nextInt();
//	checking the first number is greater than second number or not
	if(num1>num2)
	{
	x=num1;
	y=num2;
	}
	else
	{
//		storing the variable in highest value order
	x=num2;
	y=num1;
	}
	while((reminder=x%y)!=0)
	{
	x=y;
	y=reminder;
	}
//	Print the HCF
	System.out.println("HCF= "+y);
	l=(num1*num2)/y;
//	print the LCM
	System.out.println("LCM= "+l);
//	closing the costly resource
	sc.close();
	}

}
