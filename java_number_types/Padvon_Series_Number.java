package java_number_types;
//Program to get the Padvon series.
//Padvon Series:-Starts with three 1’s, after that moves on with a function as: fx= f(x-2)+f(x-3).
import java.util.Scanner;

public class Padvon_Series_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the required variables
	int num,firstVar,secondVar,thirdVar,forthVar;
	firstVar=1;
	secondVar=1;
	thirdVar=1;
//	taking the input from user
	System.out.println("Enter a number");
	num=sc.nextInt();
//	checking the condition
	if(num==1)
	System.out.print(firstVar);
	else if(num==2)
	System.out.print(firstVar+" "+secondVar);
	else
	{
	System.out.print(firstVar+" "+secondVar+" "+thirdVar);
	for(int i=4;i<=num;i++)
	{
	forthVar=firstVar+secondVar;
	System.out.print(" "+forthVar);
	firstVar=secondVar;
	secondVar=thirdVar;
	thirdVar=forthVar;
	}
	}
//	closing the costly resources
	sc.close();
	}
}
