package java_patterns;
/*
 * Program to print numbers in below pattern
 * 1
 * 31
 * 531
 * 7531
 * 97531
 * */
public class Pattern_10 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
//  Inner loop is for column
	for(j=i;j>=1;j--)
	{
	System.out.print((j*2)-1);
	}
	System.out.println();
	}
	}
}
