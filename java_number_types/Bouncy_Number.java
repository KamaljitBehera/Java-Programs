package java_number_types;
//Program to check the number is a bouncy number or not
//Bouncy Number:-To Check Bouncy Number Increasing Decreasing Number. Working from left-to-right if no digit is exceeded by the digit to its left it is called an increasing number.
//, for example : 134468. Similarly if no digit is exceeded by the digit to its right it is called a decreasing number, for example : 66420.
import java.util.Scanner;

public class Bouncy_Number {
	public static void main(String args[])

	{
//	Creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the required variables
	int num,num1,rem1,count,count1,count2,rem2;
//	Taking input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
//	assign the value
	num1=num;
	count=0;
	count1=0;
	count2=0;
	rem2=num%10;
//	Count the digit of a number
	while(num!=0)
	{
	rem1=num%10;
	count++;
	num=num/10;
	}
//	checking the condition according to the requirement
	while(num1!=0)
	{
	rem1=num1%10;
	if(rem1<=rem2)
	count1++;
	if(rem1>=rem2)
	count2++;
	rem2=rem1;
	 num1=num1/10;
	}
//	checking the condition
	if(count1==count || count2==count)
	System.out.println("It is Not a Bouncy No");
	else
	System.out.println("It is a Bouncy No");
//	closing the costly resources
	sc.close();
	}
}
