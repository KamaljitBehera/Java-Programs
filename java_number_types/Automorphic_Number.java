package java_number_types;
//Program to check the number is Automorphic number
//Automorphic Number:-A number whose square ends with the same digits as a number itself.
import java.util.Scanner;

public class Automorphic_Number {

	public static void main(String args[]) {
//		creating the scanner class object
		Scanner sc = new Scanner(System.in);
//		declare the variables
		int num, square1, square2, count, pow, n3;
//		taking the user input
		System.out.println("Enter a number");
		num = sc.nextInt();
		square1 = num * num;
		square2 = square1;
		count = 0;
		int rem;
		while (square1 != 0) {
			rem = square1 % 10;
			count++;
			square1 = square1 / 10;
		}
		pow = (int) Math.pow(10, count - 1);
		n3 = square2 % pow;
//		checking the condition
		if (n3 == num)
			System.out.println("Automorphic Number");
		else
			System.out.println("Not a Automorphic Number");
//		close the costly connection
		sc.close();
	}
}
