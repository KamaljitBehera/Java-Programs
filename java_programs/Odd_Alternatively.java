package java_programs;

import java.util.Scanner;

public class Odd_Alternatively {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
			//taking the range from user
				System.out.println("Enter the range::");
				int range=sc.nextInt();
				int count=0;
				//to print the odd number in the range we have to use for loop
				System.out.println("The odd number in range are:");
				for(int i=0;i<range;i++) {
					if(i%2!=0) {
						count++;
						System.out.print(i+" ");
					}
				}
				System.out.println();
//				print the odd number alternatively 
				System.out.println("The alternative order of odd number in range is:");
				for(int i=0;i<range;i++) {
					if(i%2!=0) {
						count++;
						if(count%2!=0)
						System.out.print(i+" ");
					}
				
		sc.close();
		}
	 }

}
