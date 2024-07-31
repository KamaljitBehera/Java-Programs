package java_programs;
//This program is used to check the number is an palindrome number or not
import java.util.Scanner;

public class Palindrome_Number {
   public static void main(String[] args) {
//	   creating the Scanner object
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");
	int number=sc.nextInt();
//	store the value to another variable
	int num=number;
	int reminder=0,sum=0;
	while(number>0) {
		reminder=number%10;
		sum=sum*10+reminder;
		number=number/10;
	}
//	check the sum is equal to the number or not
	if(num==sum) {
		System.out.println("The "+num+" is an palindrome number.");
	}
	else
	{
		System.out.println("The "+num+" is not an palindrome number.");
	}
	sc.close();
}
}
