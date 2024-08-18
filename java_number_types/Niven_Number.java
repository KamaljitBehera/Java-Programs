package java_number_types;
//this program to check whether the number is niven number or not.
//Niven Number:-A number which is divisible by the sum of its digits.
import java.util.Scanner;

public class Niven_Number {
	public static void main(String args[]) {
//		creating the scanner class object
		Scanner sc = new Scanner(System.in);
//		declaring the required variable
		int num, reminder, sum = 0, number;
//		taking the user input
		System.out.println("Enter a number");
		num = sc.nextInt();
		number = num;
//		While loop to calculate the sum of digits
		while (num != 0) {
			reminder = num % 10;
			sum = sum + reminder;
			num = num / 10;
		}
//		checking the number is niven number or not
		if (number % sum == 0) {
			System.out.println("The number "+number+" is a Niven Number");
		} else {
			System.out.println("The number "+number+" is not a Niven Number");
		}
//		closing the costly resources
		sc.close();
	}
}
