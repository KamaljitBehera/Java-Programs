package java_programs;
//This program is used to demonstrate to check whether the given number is Armstrong number or not
import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
//		creating the object of Scanner class
		Scanner sc=new Scanner(System.in);
//		taking input from the user 
		System.out.println("Enter the number to check where it is Armstrong number or not::");
		int number=sc.nextInt();
//      store the inputed the value in another variable
		int num=number;
		int fnum=num;
		int count=0,reminder=0,sum=0;
//      to count the number of digits
		while(number>0) {
			count++;
			number=number/10;
		}
//		to find out the Armstrong number
		while(num>0) {
			reminder=num%10;
			sum=sum+(int)Math.pow(reminder, count);
			num=num/10;
		}
//		checking the sum is equal to the number or not
		if(fnum==sum) {
			System.out.println("The "+fnum+" is an armstrong number.");
		}
		else
		{
			System.out.println("The "+fnum+" is not an armstrong number.");
		}
		sc.close();
	}

}
