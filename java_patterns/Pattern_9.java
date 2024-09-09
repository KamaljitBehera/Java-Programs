package java_patterns;
/*
 * Program to print numbers in below pattern
 * 2
 * 42
 * 642
 * 8642
 * 108642
 * */
public class Pattern_9 {
//Creating the main method
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
	System.out.print(j*2);
	}
	System.out.println();
	}
	}
}
