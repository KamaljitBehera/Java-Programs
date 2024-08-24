package java_number_types;
//Program to check whether a number is twin prime number or not.
//Twin Prime Number:-Both numbers are prime and the difference between them is 2.
import java.util.Scanner;

public class Twin_Prime_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	Declaring the required variables
	int num1,num2,count1,count2;
//	Taking the first number
	System.out.println("Enter 1st number");
	num1=sc.nextInt();
//	taking the second number
	System.out.println("Enter 2nd number");
	num2=sc.nextInt();
//	initialise the variables
	count1=0;
	count2=0;
	for(int i=1;i<=num1;i++)
	{
	if(num1%i==0)
	count1++;
	}
//	for loop to check whether the number is prime number
	for(int i=1;i<=num2;i++)
	{
	if(num2%i==0)
	count2++;
	}
//	checking the condition
	if(count1==2 && count2==2 && (num1-num2)==2 || (num2-num1)==2)
	System.out.println("It is a Twin Prime Number");
	else
	System.out.println("It is Not a Twin Prime Number");
//	closing the costly connection
	sc.close();
	}
}
