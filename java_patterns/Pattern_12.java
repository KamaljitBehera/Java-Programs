package java_patterns;
/*
 * Program to print numbers in below pattern
 * 10
 * 108
 * 1086
 * 10864
 * 108642
 * */
public class Pattern_12 {
//  Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j,a;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
	a=5;
//  Inner loop is for column
	for(j=1;j<=i;j++)
	{
	System.out.print(a*2);
	a--;
	}
	System.out.println();
	}
	}
}
