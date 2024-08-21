package java_number_types;
//Checking the number is neon number or not
//Neon Number:-A number where the sum of digits of square of the number is equal to the number.
import java.util.Scanner;

public class Neon_Number {
	public static void main(String args[])
	{
//		creating scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the required variables
	int num,reminder,sum,numSquare;
//	taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
	sum=0;
	numSquare=num*num;
//	adding the digit of number
	while(numSquare!=0)
	{
	reminder=numSquare%10;
	sum=sum+reminder;
	numSquare=numSquare/10;
	}
//	checking the condition
	if(num==sum)
	System.out.println("It is a Neon Number");
	else
	System.out.println("It is Not a Neon Number");
	
//	Closing the costly resources
	sc.close();
	}
}
