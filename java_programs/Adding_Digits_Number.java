package java_programs;

import java.util.Scanner;

public class Adding_Digits_Number {
  public static void main(String[] args) {
		  System.out.println("Hello there! Lets add the digit of the number you have entered");
		  //taking input from user
		  System.out.println("Enter the number:");
		  Scanner sc=new Scanner(System.in);
		  int num=sc.nextInt();
		  int reminder=0,sum=0;;
		  
		  //for adding the digits of  a number we have use the while loop here
		  while(num>1) {
			  //reminder to store the left
			  reminder=num%10;
			  System.out.println(reminder);
			  sum=reminder+sum;
			  //to reduce the number
			  num=num/10;
		  }
		  //print the sum of digit of the given number
		  System.out.println("Sum of the digit of given number is::"+(sum));
		  sc.close();
}
}
