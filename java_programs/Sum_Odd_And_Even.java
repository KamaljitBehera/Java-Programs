package java_programs;
//This program is used to demonstrate to add the even number and odd number in a range separately
import java.util.Scanner;

public class Sum_Odd_And_Even {
   public static void main(String[] args) {
//	   creating the object of Scanner class
	Scanner sc= new Scanner(System.in);
//	Taking the input
	System.out.println("Enter the range of number:");
	int range=sc.nextInt();
	int sumEven=0,sumOdd=0;
//	by using the for loop and checking the odd and even and add it
	for(int i=1;i<range;i++) {
		if(i%2==0) {
			sumEven=sumEven+i;
		}
		else {
			sumOdd=sumOdd+i;
		}
	}
	System.out.println("The sum of even number in "+range+" is"+sumEven);
	System.out.println("The sum of odd number in "+range+" is"+sumOdd);
	
	sc.close();
}
}
