package java_number_types;

import java.util.Scanner;

//program to check whether the number is amicable number or not.
//Amicable Number:-The amicable numbers are two different numbers (a pair of numbers) so related that the sum of the proper divisors (excluding the number itself) of one of the numbers is equal to the other. A proper divisor of a number is a divisor other than the number itself. It is also known as friendly numbers.
public class Amicable_Number {
	 public static void main(String args[])
	    {
//		 Creating the scanner class object
	       Scanner sc=new Scanner(System.in);
//	       declaring the required variables
	        int num1,num2,sum1,sum2,i;
//	        taking input from user
	        System.out.println("Enter first number= ");
	        num1=sc.nextInt();
	        System.out.println("Enter second number= ");
	        num2=sc.nextInt();
	        sum1=0;
//	        closing the costly resources
	        sc.close();
//	        loop to get the sum of numbers
	        for(i=1;i<num1;i++)
	        {
	        if(num1%i==0)  
	        sum1=sum1+i;
	        }
	         sum2=0;
	        for(i=1;i<num2;i++)
	        {
	        if(num2%i==0)  
	        sum2=sum2+i;
	        }
//	        checking the condition
	        if(sum1==num2 && sum2==num1)
	        System.out.println("It is an Amicable number");
	        else
	        System.out.println("It is Not a Amicable number");
	        
	    }
}
