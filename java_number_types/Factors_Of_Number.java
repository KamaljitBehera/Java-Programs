package java_number_types;
//This program is used to describe the program to get the factors of the given number
import java.util.Scanner;

public class Factors_Of_Number {
    public static void main(String[] args) {
//    	creating the Scanner class 
		Scanner sc=new Scanner(System.in);
//		taking the input from the user
		System.out.println("Enter the number to get the factors");
		int number=sc.nextInt();
//		for loop to get the factors of the given number
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
//				printing the factors find out by the for loop
				System.out.println(i);
			}
		}
//		close the connection
		sc.close();
		
	}
    
}
