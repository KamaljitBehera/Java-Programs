package java_programs;

//Write a program to check a number is a spy number or not.
//Spy number:- An integer is said to be a spy number if the sum of all digits is equal to the multiplication of each digits of that number.
import java.util.Scanner;
public class Spy_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
    int num=sc.nextInt();
		int n=num;
		int number=n;
    int rem=0,sum=0,mul=1,r=0;

//for getting the sum of the digits
		while(num>0)
		{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		}
		//System.out.println(sum);
	//for getting the multiplication of the digits
		while(n>0)
		{
		r=n%10;
		mul=mul*r;
		n=n/10;
		}
		//System.out.println(mul);
		//checking if the sum value is equal to the mul value than it is a spy number.
		if(sum==mul)
		{
			System.out.println(number +" is a spy number.");
		}
		else
		{
        System.out.println(number +" is not a spy number.");
		}

		
        sc.close();
	}

}
