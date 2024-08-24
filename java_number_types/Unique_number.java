package java_number_types;
//Program to check the number is unique number or not.
//Unique Number:-A number in which all the digits are different.
import java.util.Scanner;
public class Unique_number {
	public static void main(String args[])
	{
//		Creating the scanner class object
	Scanner sc=new Scanner(System.in);
//	Declaring the variables
	int num,c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,d;
//	Taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
//	checking the digit repeatation in a number
	while(num!=0)
	 {
	d=num%10;
	if(d==0)
	c0++;
	if(d==1)
	c1++;
	if(d==2)
	c2++;
	if(d==3)
		c3++;
	if(d==4)
	c4++;
	if(d==5)
	c5++;
	if(d==6)
	c6++;
	if(d==7)
	c7++;
	if(d==8)
	c8++;
	if(d==9)
	c9++;
	num=num/10;
	}
	if(c0<=1 && c1<=1 && c2<=1 && c3<=1 && c4<=1 && c5<=1 && c6<=1 && c7<=1 && 
	c8<=1 && c9<=1)
	System.out.println("It is a Unique Number");
	else
	System.out.println("It is Not a Unique Number");
//	closing the costly resources.
	sc.close();
	}
}
