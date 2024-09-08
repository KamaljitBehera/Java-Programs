package java_patterns;
/*
 * Program to print numbers in below pattern
 * 
 * 2
 * 24
 * 246
 * 2468
 * 246810
 * */

public class Pattern_4 {
//	Creating the main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
//  Inner loop is for column
	for(j=1;j<=i;j++)
	{
	System.out.print(j*2);
	}
	System.out.println();
	}
	}
}
