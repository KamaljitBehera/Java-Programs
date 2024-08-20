package java_number_types;
//Program to check the number is a sad number or not.
//Sad Number:-A number which are not Happy number.
import java.util.Scanner;

public class Sad_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the required variable
	int num,sum,reminder;
//	taking the input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
//	find out the sum of each number power
	while(true)
	{
	sum=0;
	while(num!=0)
	{
	reminder=num%10;
	sum=sum+(reminder*reminder);
	num=num/10;
	}
//	checking the condition
	if(sum>0 && sum<=9)
	break;
	else
	num=sum;
	}
//	checking the number is one or not
	if(sum!=1)
	System.out.println("It is a Sad Number");
	else
	System.out.println("It is Not a Sad Number");
//	closing the costly resources
	sc.close();
	}
}
