package java_patterns;
/*
 * Program to print numbers in below pattern
 *     1
 *    24
 *   135
 *  2468
 * 13579
 * */

public class Pattern_22 {
//	Creating the main method
	public static void main(String args[])
	{
//  Declaring the loop variables
	int i,j,a,b,k;
//  Outer loop is for row
	for(i=1;i<=5;i++)
	{
//  Inner loop is for column
	for(k=1;k<=5-i;k++)
	System.out.print(" ");
	a=2;
	b=1;
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
