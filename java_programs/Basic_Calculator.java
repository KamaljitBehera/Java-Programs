package java_programs;

// This program demonstrate the basic functionality of a calculator by using switch case
import java.util.Scanner;

public class Basic_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's calculate::");
		// taking input from the user
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		// print the instruction
		System.out.println("Enter '+' for addition");
		System.out.println("Enter '-' for substraction");
		System.out.println("Enter '/' for division");
		System.out.println("Enter '*' for multiplication");
		// read the operator
		System.out.println("Enter the operator that you want to peferm an operation:");
		char ch = sc.next().charAt(0);

		// using switch case

		switch (ch) {
		case '+':
			System.out.println("The addition of two number is " + (num1 + num2));
			break;
		case '-':
			System.out.println("The substraction of two number is " + (num1 - num2));
			break;
		case '/':
			System.out.println("The division of two number is " + (num1 / num2));
			break;
		case '*':
			System.out.println("The multiplication of two number is " + (num1 * num2));
			break;
		default:
			System.out.println("Enter a valid operator to perferm the operation");

		}

		sc.close();
	}
}
