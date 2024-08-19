package java_number_types;
//This program is to print the Tribonacci series numbers in a range.
//Tribonacci series:-Starts with 0 and twice 1’s, after that moves on with a function as: fx=f(x-1)+f(x-2)+f(x-3).
import java.util.Scanner;

public class Tribonacci_Series_Number {
	public static void main(String args[])
	{
//		Creating the object of Scanner Class
	Scanner sc=new Scanner(System.in);
//	declaring the required variable
	int num,firstNum,secondNum,thirdNum,forthNum;
	firstNum=0;
	secondNum=1;
	thirdNum=1;
//	taking the input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
//	checking the condition
	if(num==1)
	System.out.print(firstNum);
	else if(num==2)
	System.out.print(firstNum+" "+secondNum);
	else
	{
	System.out.print(firstNum+" "+secondNum+" "+thirdNum);
	for(int i=4;i<=num;i++)
	{
	 forthNum=firstNum+secondNum+thirdNum;
	System.out.print(" "+forthNum);
	firstNum=secondNum;
	secondNum=thirdNum;
	thirdNum=forthNum;
	}
	}
//	closing the costly resources
	sc.close();
	}
}
