package java_number_types;
//Program to chek a number is evil number or not.
//Evil Number:-Convert the number to its equivalent binary number, than if the number of 1’s is even than only the number is called evil number.
import java.util.Scanner;

public class Evil_Number {
	public static void main(String args[])
	{
//	creating the scanner class object.
	Scanner sc=new Scanner(System.in);
//	declaring the required variable
	int num,reminder,count;
	count=0;
//	taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
//	using while loop to find out the count no.
	while(num!=0)
	{
	reminder=num%2;
	if(reminder==1)
	count++;
	num=num/2;
	}
//	checking the condition
	if(count%2==0)
	System.out.println("It is a Evil No");
	else
	 System.out.println("It is Not a Evil No");
//	closing the costly resources
	sc.close();
	}
}
