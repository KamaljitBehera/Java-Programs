package java_number_types;

import java.util.Scanner;

//Program to check whether a number is nelson number or not.
//Nelson number:-A three digit number whose all digits are same.
public class Nelson_Number {
	public static void main(String args[]) {
//	creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the required variables
	int num,x,reminder,count;
//	taking input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
//	ckecking the number is less then 1000 and greater than 100
	if(num>99 && num<1000)
	{
	count=0;
	x=num%10;
//	checking the reverse of number
	while(num!=0)
	{
	reminder=num%10;
	if(reminder==x)
	{
	count++;
	}
	 num=num/10;
	}
	if(count==3)
	System.out.println("It is a Nelson Number");
	else
	System.out.println("It is Not a Nelson Number");
	}
	else
	System.out.println("It is Not a Nelson Number");
	
//	closing the costly resources
	sc.close();
	}
}
