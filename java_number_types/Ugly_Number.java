package java_number_types;
//Program to check whether a number is a ugly number or not.
//Ugly Number:-A number is divisible by numbers 2, 3, and 5.
import java.util.Scanner;

public class Ugly_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter a number");
	num=sc.nextInt();
	if(num%2==0 && num%3==0 && num%5==0)
	System.out.println("It is an Ugly No");
	else
	System.out.println("It is Not a Ugly No");
//	closing the costly resources.
	sc.close();
	}
}
