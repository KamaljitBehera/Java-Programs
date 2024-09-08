package java_patterns;
/*
 * Program to print numbers in below pattern
 * 
 * 1
 * 13
 * 135
 * 1357
 * 13579
 * */
public class Pattern_5 {
//   Creating main method
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
	System.out.print((j*2)-1);
	}
	System.out.println();
	}
	}
}
