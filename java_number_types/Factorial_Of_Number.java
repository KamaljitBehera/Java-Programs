package java_number_types;
//Program to get the factorial number of series.
//Factorial NUmber:-Factorial of a non-negative integer, is multiplication of all integers smaller than or equal to n.
import java.util.Scanner;

public class Factorial_Of_Number {
  public static void main(String[] args) {
//	Creating the Scanner class object
	  Scanner sc= new Scanner(System.in);
//	  taking input from the user
	  System.out.println("Enter the number:");
	  int number=sc.nextInt();
	  int num=number;
//	   the factorial variable 
	  int factorial=1;
//	  calculating the factorial
	  while(number>0) {
		  factorial=factorial*number;
		  number--;
	  }
//	  print the factorial
	  System.out.println("The factorial of "+num+" is "+factorial);
	  sc.close();
}
}
