package java_programs;

import java.util.Scanner;

public class Largest_Bet_Two {
	//Program to find out the largest among two inputed number
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Taking input from user
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		//cheking the greater number by using the if-else statement
			if(num1==num2)
		{
			System.out.println(num1+" and "+num2+" both are same");
		}
		else if(num1>num2)
		{
			System.out.println(num1+" is greater");
		}
		else {
			System.out.println(num2+" is greater");
		}
		//or we can do it by the help of ternary operator
	//   int max1=(num1>num2)?num1:num2;
	//   System.out.println(max1+" is greater");
		sc.close();
	}

}
