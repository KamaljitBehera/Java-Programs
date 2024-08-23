package java_number_types;
//checking the number is a Disarium Number or not.
//Disarium Number:-The sum of its digits raise to the power of their respective positions is equal to the number itself.
import java.util.Scanner;

public class Disarium_Number {
	public static void main(String args[])
	{
//		Creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the required variables
	int num,count,rem,number,sum,num2;
//	taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
	number=num;
	num2=num;
	count=0;
	sum=0;
//	checking the digit of a number
	while(num!=0)
	{
	rem=num%10;
	count++;
	num=num/10;
	}
	while(number!=0)
	{
	rem=number%10;
	sum=sum+(int)Math.pow(rem,count);
	count--;
	number=number/10;
	}
//	checking the condition
	if(num2==sum)
		System.out.println("It is a Disarium Number");
		else
		 System.out.println("It is Not a Disarium Number");
//	closing the costly resources
	sc.close();
		}
}
