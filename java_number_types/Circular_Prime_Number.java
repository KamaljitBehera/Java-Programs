package java_number_types;
//Program to check the number is Circular prime number or not.
//Circular Prime Number:-A circular prime is aprime number with the property that the number generated at each intermediate step when cyclically permuting its (base 10) digits will be prime.
import java.util.Scanner;

public class Circular_Prime_Number {
	public static void main(String args[])
	{
//		creating the Scanner class object
	Scanner sc=new Scanner(System.in);
//	Declaring the required variables
	int num,count,i,j,count1,count2,d,pow,num1,un,fd;
	count=0;
//	taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
	count2=0;
	num1=num;
	while(num1!=0)
	{
	d=num1%10;
	count++;
	num1=num1/10;
	}
    pow=(int)Math.pow(10,count-1);
	for(i=1;i<=count;i++)
	{
	count1=0;
	for(j=1;j<=num;j++)
	{
	if(num%j==0)
	count1++;
	}
	if(count1==2)
	count2++;
	un=num%pow;
	fd=num/pow;
	num=(un*10)+fd;
	}
	if(count2==count)
	System.out.println("Circular Prime Number");
	else
	System.out.println(" Not a Circular Prime Number");
	}
}
