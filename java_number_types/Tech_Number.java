package java_number_types;
//Program to check whether a number is tech number or not.
//Tech Number/Karpekar Number:-A number has a even number of digits, then the number is split into two halves. The square of the sum of that two halves is equal to the number.
import java.util.Scanner;

public class Tech_Number {
	public static void main(String args[])
	{
//  Creating the Scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the required variables
	int num,count,d,number,sum,square,fp,lp,pow;
//	taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
	count=0;
	number=num;
//	finding the number of digit
	while(num!=0)
	{
	d=num%10;
	count++;
	num=num/10;
	}
//	checking the number of digit is two or high
	if(count%2==0)
	{
	pow=(int)Math.pow(10,count/2);
	fp=number/pow;
	lp=number%pow;
	sum=fp+lp;
	square=sum*sum;
	if(square==number)
	System.out.println("It is a Tech Number");
	else
	System.out.println("It is Not a Tech Number");
	}
	else
	System.out.println("Not a Tech Number");
//	closing the costly resources.
	sc.close();
	}
}
