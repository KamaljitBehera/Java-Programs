package java_number_types;

import java.util.Scanner;

//Demonstrate the program to check the number is palindrome or number
//Palindrome Number:-A number that remains same even it is reversed
public class Palindrome_Number {
   public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
//	taking user input
	System.out.println("Enter the number");
	int number=scanner.nextInt();
	int num=number;
//	declaring the required variable
	int sum=0,reminder=0;
//	while loop to operate the digits of number
	while(number!=0)
	{
		reminder=number%10;
		sum=(sum*10)+reminder;
		number=number/10;
	}
//	if-else to print the number is palindrome or not
	if(num==sum) {
		System.out.println("The number "+num+" is a palindrome number");
	}
	else
	{
		System.out.println("The number "+num+" is not a palindrome number");
	}
//	closing the costly resources
	scanner.close();
}
}
