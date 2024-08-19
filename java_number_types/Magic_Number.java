package java_number_types;
//program to demonstrate to check whether a number is magic number or not.
//Magic Number:-A number is called Magic number, if sum of its digits are calculated till the single digit is obtained by recursively adding the sum of its digits. If the single digit comes is 1 then only the number is a magic number.
import java.util.Scanner;

public class Magic_Number {
	public static void main(String args[])
	{
//		Creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the variable
	int num,sum,reminder;
//	taking input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
//	find out the sum of digit of numbers
	while(true)
	{
	sum=0;
	while(num!=0)
	{
	reminder=num%10;
	sum=sum+reminder;
	num=num/10;
	}
//	checking the condition
	if(sum>0 && sum<=9)
	break;
	else
	num=sum;
	}
	if(sum==1)
	System.out.println("It is a Magic Number");
	else
	System.out.println("It is Not a Magic Number");
//	close the costly resources
	sc.close();
	}
}
