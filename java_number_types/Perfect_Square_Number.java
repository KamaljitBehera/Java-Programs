package java_number_types;
//Program to check the number is a perfect square number or not.
//Perfect Square Number:-A number is a perfect square number if it is a square of any number.
import java.util.Scanner;

public class Perfect_Square_Number {
	public static void main(String args[])
	{
//		Creating scanner class object
	Scanner sc=new Scanner(System.in);
//	declaring the variable
	int num,square;
	System.out.println("Enter a number");
	num=sc.nextInt();
	square=(int)Math.sqrt(num);
	if((square*square)==num)
	System.out.println("It is a Perfect Square Number");
	else
	System.out.println("It is Not a Perfect Square Number");
//	closing the scanner class object
	sc.close();
	}
}
