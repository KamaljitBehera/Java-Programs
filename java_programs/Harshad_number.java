package java_programs;
import java.util.Scanner;
public class Harshad_number {
	//write a program to check that a number is harshad number or not.
	//Harshad number:An integer number which is divisible by the sum of its digits.
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:: ");
			int num=sc.nextInt();
			int n=num;
			int r=0,sum=0;
			while(num>0)
			{
				r=num%10;
				sum=sum+r;
				num=num/10;
			}
			System.out.println(sum);
			if(n%sum==0)
			{
				System.out.println(n+" is a harshad number.");
			}
			else
			{
				System.out.println(n+" is not a harshad number.");
			}


		sc.close();

	}
}
