package java_number_types;
//Program is used to check whether number is prime number or not
//Prime Number:-A number which is divisible by itself and 1 only.
import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking the input from user
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		//for getting two time division we initialize count variable
		int count=0;
		////using for loop divide the input number with all the number from zero to that number
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		///checking that the count is equal to 2 or not
		if(count==2) {
			System.out.println("The "+num+" is a prime number");
		}
		else
		{
			System.out.println("The "+num+" is not a prime number");
		}
//		closing the costly resources
		sc.close();
		}

}
