package java_number_types;
//Program is used to check the number is ISBN number or not.
//ISBN Number:-An ISBN (International Standard Book Number) is a ten digit code which uniquely identifies a book. The first nine digits represent the Group, Publisher and Title of the book and the last digit is used to check whether ISBN is correct or not. Each of the first nine digits of the code can take a value between 0 and 9.
import java.util.Scanner;

public class ISBN_Number {
	public static void main(String args[])
	{
//		creating the Scanner class object
	Scanner sc=new Scanner(System.in);
//	Declaring the required the variables
	long num,num1,rem,sum;
	int count;
//	Taking the user input
	System.out.println("Enter a number");
	num=sc.nextLong();
	num1=num;
	count=0;
	sum=0;
//	count the nuber of digit
	while(num!=0)
	{
	rem=num%10;
	count++;
	num=num/10;
	}
	if(count==10)
	{
	while(num1!=0)
	{
	rem=num1%10;
	sum=sum+(rem*count);
	count--;
	num1=num1/10;
	}
//	checking the conditions
	if(sum%11==0)
	System.out.println("It is an ISBN Number");
	else
	System.out.println("It is Not a ISBN Number");
	}
	else
	 System.out.println("Not a ISBN Number");
//	closing the costly resources
	sc.close();
	}
}
