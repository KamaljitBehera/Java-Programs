package java_patterns;
/*
 * Program to print numbers in below pattern
  *     1
  *    13
  *   135
  *  1357
  * 13579
 * */
public class Pattern_34 {
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
	System.out.print((j*2)-1);
	}
	System.out.println();
	}
	}
}
