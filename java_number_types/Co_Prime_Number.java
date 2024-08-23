package java_number_types;
//Program to check whether a number is co Prime number or not.
//Co Prime Number:-A number whose HCF is 1.
import java.util.Scanner;

public class Co_Prime_Number {
	public static void main(String args[])
	{
//		Creating the Scanner class object
	Scanner sc=new Scanner(System.in);
//	Declaring the required variables
	int num1,num2,reminder,firstNum,secNum;
//	Taking the first number input
	System.out.println("Enter 1st number");
	num1=sc.nextInt();
//	Taking second number input
	System.out.println("Enter 2nd number");
	num2=sc.nextInt();
//	check the first num is greater than or not.
	if(num1>num2)
	{
	firstNum=num1;
	secNum=num2;
	}
	else
	{
	firstNum=num2;
	 secNum=num1;
	}
	while((reminder=firstNum%secNum)!=0)
	{
	firstNum=secNum;
	secNum=reminder;
	}
//	checking the condition
	if(secNum==1)
	System.out.println("Co-Prime Number");
	else
	System.out.println("Not a Co-Prime Number");
//	closing the costly resources
	sc.close();
	}
}
