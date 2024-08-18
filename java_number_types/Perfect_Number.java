package java_number_types;

import java.util.Scanner;
//This program is used to demonstrate that check whether a number is perfect number or not.
//Perfect Number:-A number which is equal to the sum of its proper divisors.
public class Perfect_Number {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0,num;
//	taking input from user
	System.out.println("Enter the number");
	num=sc.nextInt();
//	find out the sum of divisors.
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
	}
//	checking the number is perfect number or not
	if(sum==num) {
		System.out.println("The number "+num+" is a perfect number");
	}
	else{
		System.out.println("The number "+num+" is a not perfect number");
	}
//	close the costly resources
	sc.close();
}
}
