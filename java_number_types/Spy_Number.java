package java_number_types;
//Program to check whether the number is spy number or not.
//Spy Number:-Sum and Product of a given number are same.
import java.util.Scanner;

public class Spy_Number {
	public static void main(String args[])
	{
//	creating the scanner class object	
	Scanner sc=new Scanner(System.in);
//	Declaring the required variables
	int num,d,sum,product;
	sum=0;
	product=1;
	System.out.println("Enter a number");
	num=sc.nextInt();
//	adding th each digit
	while(num!=0)
	{
	d=num%10;
	sum=sum+d;
	product=product*d;
	num=num/10;
	}
//	Checking the condition
	if(sum==product)
	System.out.println("It is a Spy Number");
	else
	System.out.println("It is Not a Spy No");
//	closing the costly resources
	sc.close();
	}
}
