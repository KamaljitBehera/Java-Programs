package java_number_types;

import java.util.Scanner;

//This program is use to describe the program to check the number is buzz number or not.
//Buzz Number:-A number is divisible by 7 or its last digit is 7
public class Buzz_Number {
  public static void main(String[] args) {
//	  Creating the object of Scanner class
	Scanner sc=new Scanner(System.in);
//	Taking the input from user
	System.out.println("Enter the number");
	int number=sc.nextInt();
//	Using the if-else to check the condition required to be a buzz number.
	if(number%7==0||number%10==7)
	{
		System.out.println("The number "+number+" is a buzz number");
	}
	else
	{
		System.out.println("The number "+number+" is not a buzz number");
	}
//	Closing the costly resources
	sc.close();
}
}
