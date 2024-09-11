package java_patterns;
/*
 * Program to print numbers in below pattern
 * 9
 * 79
 * 579
 * 3579
 * 13579
 * */
public class Pattern_16 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j,a,b;
	a=5;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
	b=a;
//  Inner loop is for column
	for(j=1;j<=i;j++)
	{
	System.out.print((b*2)-1);
	b++;
	}
	a--;
	System.out.println();
	}
	}
}
