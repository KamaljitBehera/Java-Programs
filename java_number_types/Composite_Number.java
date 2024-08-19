package java_number_types;
//The program is used to demonstrate the program to check whether a number is composite number or not.
//Composite number:-A number which are not prime numbers.
import java.util.Scanner;

public class Composite_Number {
	public static void main(String args[])
	{
//		Creating scanner class object
	Scanner sc=new Scanner(System.in);
	int num,count;
	count=0;
//	taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
//	for loop to check number of divisors
	for(int i=1;i<=num;i++)
	{
	if(num%i==0)
	count++;
	}
//	checking the condition 
	if(count>2)
	System.out.println("The number "+num+" is a Composite Number");
	else
	System.out.println("The number "+num+" is not a Composite Number");
//	closing the costly resources
	sc.close();
	}
}
