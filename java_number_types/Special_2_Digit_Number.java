package java_number_types;
//Program to check whether a number is a Special 2 Digit Number or not.
//Special 2 Digit Number:-A number such that when the sum of digits of a number is added to the product of digits of a number, then the result is equal to the original 2 digit number.
import java.util.Scanner;

public class Special_2_Digit_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the variable
	int num,fd,ld,sum,product,t;
//	taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
//	checking the number length
	if(num>9 && num<100)
	{
	fd=num/10;
	ld=num%10;
	sum=fd+ld;
	product=fd*ld;
	t=sum+product;
	 if(t==num)
	System.out.println("It is a Special 2 digit Number");
	else
	System.out.println("It is Not a Special 2 digit Number");
	}
	else
	System.out.println("It is Not a Special 2 digit Number");
//	closing the costly connection
	sc.close();
	}
}
