package java_programs;

import java.util.Scanner;

public class Prime_In_Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter the range::");
		int range=sc.nextInt();
		int j;
		for(int i=1;i<=range;i++) {
			int count=0;
			////using for loop divide the input number with all the number from zero to that number
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			///checking that the count is equal to 2 or not
			if(count==2) {
				System.out.print(i+" ");
			}
			
		}
		sc.close();
	}
}
