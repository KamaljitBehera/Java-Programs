package java_programs;
//This program is used to demonstrate to multiply the even number and odd number in a range separately
import java.util.Scanner;

public class Multiplication_Even_And_Odd {
	public static void main(String[] args) {
//		   creating the object of Scanner class
		Scanner sc= new Scanner(System.in);
//		Taking the input
		System.out.println("Enter the range of number:");
		int range=sc.nextInt();
		int mulEven=1,mulOdd=1;
//		by using the for loop and checking the odd and even and multiply it
		for(int i=1;i<range;i++) {
			if(i%2==0) {
				mulEven=mulEven+i;
			}
			else {
				mulOdd=mulOdd+i;
			}
		}
		System.out.println("The multiplication of even number in "+range+" is "+mulEven);
		System.out.println("The multiplication of odd number in "+range+" is "+mulOdd);
		
		sc.close();
	}
}
