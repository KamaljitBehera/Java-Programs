package java_patterns;
/*
 * Program to print numbers in below pattern
 * 
 * 1
 * 33
 * 555
 * 7777
 * 99999
 * */
public class Pattern_7 {
//	Creating main method
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
	System.out.print((i*2)-1);
	}
	System.out.println();
	}
	}
}
