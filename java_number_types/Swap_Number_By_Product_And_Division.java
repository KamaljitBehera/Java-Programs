package java_number_types;
//program to swap number using the product and division without third variable.
import java.util.Scanner;

public class Swap_Number_By_Product_And_Division {
	public static void main(String args[])
	{
//		creating the Scanner class object
	Scanner sc=new Scanner(System.in);
//	creating the variables
	int firstNumber,secondnumber;
//	taking the 1st number from user
	System.out.println("Enter 1st number");
	firstNumber=sc.nextInt();
//	taking the 2nd number from user
	System.out.println("Enter 2nd number");
	secondnumber=sc.nextInt();
//	printing the variables before swaping
	System.out.println("Before swapping:");
	System.out.println("a= "+firstNumber);
	System.out.println("b= "+secondnumber);
	firstNumber=firstNumber*secondnumber;
	secondnumber=firstNumber/secondnumber;
	firstNumber=firstNumber/secondnumber;
//	printing the variables after swaping
	System.out.println("After swapping:");
	System.out.println("firstNumber= "+firstNumber);
	System.out.println("secondNumber= "+secondnumber);
//	closing the costly resources
	sc.close();
	}
}
