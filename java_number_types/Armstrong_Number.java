package java_number_types;
//Demonstrate the program is to check whether a given number is an armstrong number or not
//Armstrong Number:-An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits.
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
//    	creating the object of Scanner class
		Scanner scanner=new Scanner(System.in);
//		declaring the necessary variables
		int number,reminder=0,sum=0,num,count=0,cNum;
//		Taking the number from user
		System.out.println("Enter the number");
		number=scanner.nextInt();
		num=number;
		cNum=num;
//		Use while loop to count the digit of number
		while(number!=0) {
			reminder=number%10;
			count++;
			number=number/10;
		}
//		this loop is used to add the power of each digit
		while(num!=0) {
			reminder=num%10;
			sum=sum+(int)Math.pow(reminder, count);
			num=num/10;
		}
//		if-else is used to print the number is armstrong number or not
		if(cNum==sum) {
			System.out.println("The number "+cNum+" is an armstrong number.");
		}
		else
		{
			System.out.println("The number "+cNum+" is not an armstrong number.");
		}
		scanner.close();
	}
}
