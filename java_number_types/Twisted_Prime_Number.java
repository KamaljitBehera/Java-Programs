package java_number_types;
//Program to check the number is twisted prime number or not.
//Twisted Prime Number/Emirp Number:-A number which is a prime number and its reversed number is also a prime number
import java.util.Scanner;

public class Twisted_Prime_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the variables
	int n,s,c1,c2,i,d;
//	taking the user input
	System.out.println("Enter a number");
	 n=sc.nextInt();
//	 initialise the variables
	s=0;
	c1=0;
	c2=0;
//	closing the costly connection
	sc.close();
//	checking the number is prime or not
	for(i=1;i<=n;i++)
	{
	if(n%i==0)
	c1++;
	}
	while(n!=0)
	{
	d=n%10;
	s=(s*10)+d;
	n=n/10;
	}
//	checking the reverse of the number is prime or not
	for(i=1;i<=s;i++)
	{
	if(s%i==0)
	c2++;
	}
	if(c1==2 && c2==2)
	System.out.println("It is a Twisted Prime Number");
	else
	System.out.println("It is Not a Twisted Prime Number");
	}
}
