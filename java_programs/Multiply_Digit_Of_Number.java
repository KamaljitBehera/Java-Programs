package java_programs;

import java.util.Scanner;

public class Multiply_Digit_Of_Number {
	public static void main(String[] args) 
		  {
			  System.out.println("Hello there! Lets multiply the digit of the number you have entered");
			  //taking input from user
			  System.out.println("Enter the number:");
			  Scanner sc=new Scanner(System.in);
			  int num=sc.nextInt();
			  int reminder=0,mulRes=1;
			  
			  //for multiply the digits of  a number we have use the while loop here
			  while(num>1) {
				  //reminder to store the left
				  reminder=num%10;
				  System.out.println(reminder);
				 mulRes=reminder*mulRes;
				  //to reduce the number
				  num=num/10;
			  }
			  //print the multiplication  of digit of the given number
			  System.out.println("Sum of the digit of given number is::"+(mulRes));
		      sc.close();
	}
}
