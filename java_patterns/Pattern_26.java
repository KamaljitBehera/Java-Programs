package java_patterns;
/*
 * Program to print numbers in below pattern
  *     1
  *    31
  *   531 
  *  7531
  * 97531
 * */

public class Pattern_26 {
//	Creating main method
	public static void main(String args[])
	{
//	Outer loop is for row
	int i,j,a,k;
//	Inner loop is for column
	for(i=1;i<=5;i++)
	{
//	Inner loop is for column
	for(k=1;k<=5-i;k++)
	System.out.print(" ");
	a=5;
	for(j=1;j<=i;j++)
	{
	System.out.print((a*2)-1);
	a--;
	}
	System.out.println();
	}
	}
}
