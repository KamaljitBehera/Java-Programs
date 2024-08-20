package java_number_types;
//Program to get the Jacobsthal series to a particular.
//Jacobsthal series:-The series starts with 0 and 1, after that each successive number is the sum of its previous number plus twice the number previous to previous number.
import java.util.Scanner;

public class Jacobsthal_Series_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the reequired variables
	int num,firstVar,secondVar,thirdVar;
//	initialising the variables
	firstVar=0;
	secondVar=1;
//	taking input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
//	checking the conditions
	if(num==1)
	System.out.print(firstVar);
	else
	{
	System.out.print(firstVar+" "+secondVar);
	for(int i=3;i<=num;i++)
	{
	thirdVar=(2*firstVar)+secondVar;
	System.out.print(" "+thirdVar);
	firstVar=secondVar;
	secondVar=thirdVar;
	}
	}
//	closing the costly resources
	sc.close();
	}
}
