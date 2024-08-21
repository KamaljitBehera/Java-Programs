package java_number_types;
//Program to check the number is Pronic number or not.
//ronic Number:-A number which is a product of two consecutive numbers.
import java.util.Scanner;

public class Pronic_Number {
	public static void main(String args[])
	{
//	creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the requiredd variable
	int num,iterator,f;
	f=0;
//	taking input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
//	useing for loop to check the consequtive order of number 
//	closing the costly resources 
	sc.close();
	for(iterator=1;iterator<num/2;iterator++)
	{
	if(iterator*(iterator+1)==num)
	{
	f=1;
	break;
	}
	}
//	cheking the condition
	if(f==1)
	System.out.println("It is a Pronic Number");
	else
	System.out.println("It is Not a Pronic Number");
	

	}
}
