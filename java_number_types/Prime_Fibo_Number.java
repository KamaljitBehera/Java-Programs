package java_number_types;
//Program is used to check the number is Prime Fibo Number or not
//Prime Fibo Number:-A number which is a part of Fibonacci series and is a prime number also.
import java.util.Scanner;

public class Prime_Fibo_Number {
		public static void main(String args[])
		{
//	    Create the scanner class object
		Scanner sc=new Scanner(System.in);
//		Declaring the required variables
		int num,firstNum,secondNum,count,count1;
		firstNum=0;
		secondNum=1;
//		taking input from user
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(true)
		 {
		count=firstNum+secondNum;
		count1=0;
		for(int i=1;i<=count;i++)
		{
		if(count%i==0)
		count1++;
		}
		if(count>=num)
		break;
		firstNum=secondNum;
		secondNum=count;
		}
//		checking the condition
		if(count1==2)
		System.out.println("It is a Prime Fibo Number");
		else
		System.out.println("It is Not a Prime Fibo Number");
//		closing the costly resources
		sc.close();
		}
}
