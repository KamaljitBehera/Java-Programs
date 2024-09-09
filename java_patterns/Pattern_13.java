package java_patterns;
/*
 * Program to print numbers in below pattern
 * 9
 * 97
 * 975
 * 9753
 * 97531
 * */
public class Pattern_13 {
//	Creating the main method
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
	System.out.print((a*2)-1);
	a--;
	}
	System.out.println();
	}
	}
}
