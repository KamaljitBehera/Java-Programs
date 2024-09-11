package java_patterns;
/*
 * Program to print numbers in below pattern
 * 1
 * 24
 * 135
 * 2468
 * 13579
 * */
public class Pattern_17 {
//	Creating the main method
	public static void main(String args[])
	{
//  Declaring the required variables
	int i,j,a,b;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
	a=2;
	b=1;
//  Inner loop is for column
	for(j=1;j<=i;j++)
	{
	if(i%2==0)
	{
	System.out.print(a);
	a=a+2;
	}
	else
	{
	System.out.print(b);
	b=b+2;
	}
	}
	System.out.println();
	}
	}
}
