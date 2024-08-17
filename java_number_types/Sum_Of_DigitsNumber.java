package java_number_types;

import java.util.Scanner;

public class Sum_Of_DigitsNumber {
		   public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
//			taking user input
			System.out.println("Enter the number");
			int number=scanner.nextInt();
			int num=number;
//			declaring the required variable
			int sum=0,reminder=0;
//			while loop to operate the digits of number
			while(number!=0)
			{
				reminder=number%10;
				sum=sum+reminder;
				number=number/10;
			}
//			Print the sum of the digit
			System.out.println("Sum of digit of number "+num+" is "+sum);
//			close the costly resources
			scanner.close();
		}
		
}
