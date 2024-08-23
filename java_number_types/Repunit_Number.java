package java_number_types;
//Program to check whether a number is Repunit number or not.
//Repunit Number:-A number having all its digits as 1 only.
import java.util.Scanner;

public class Repunit_Number {
	public static void main(String args[])
	{
//		Creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	Declaring the required variables
	int num,count,reminder,count1,number;
//	Taking input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
	number=num;
	count=0;
	count1=0;
//	Checking the digit of a number
	while(num!=0)
	{
	reminder=num%10;
	count++;
	num=num/10;
	}
	while(number!=0)
	{
	reminder=number%10;
	if(reminder==1)
	count1++;
	number=number/10;
	}
//	checking the condition
	if(count==count1)
	System.out.println("It is a Repunit Number");
	else
	System.out.println("It is Not a Repunit Number");
//	closing the costly resources
	sc.close();
	}
}
