package java_patterns;
/*
 * Program to print numbers in below pattern
  *     *
  *    **
  *   ***
  *  ****
  * *****
 * */
public class Pattern_38 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j,k;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
//	Inner loop is for column
	for(k=1;k<=5-i;k++)
	System.out.print(" ");
	for(j=1;j<=i;j++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	}
}
