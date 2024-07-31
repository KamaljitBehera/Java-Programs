package java_programs;

import java.util.Scanner;

public class Happy_Number {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
        int sum=0,rem=0,count=0;

		while(sum!=1)
		{   
			if(count<=4)
			{
				sum=0;
				while(n>0)
				{
                  rem=n%10;
				  sum=sum+(rem*rem);
				  n=n/10;
				}
				n=sum;
				count++;
				if(sum==1)
				{
					System.out.println("happy no.");
				}
			}
			else
			{
				System.out.println("not a happy no.");
				break;
			}
			//n=sum;
		}
		sc.close();
	}

}
