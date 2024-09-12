package java_patterns;
/*
 * Program to print numbers in below pattern
  *     10
  *    108
  *   1086 
  *  10864
  * 108642
 * */
public class Pattern_27 {
//	Creating main method
	public static void main(String args[])
	{
//  Declaring the loop variables
	int i,j,a,k;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
//	Inner loop is for column
	for(k=1;k<=5-i;k++)
	System.out.print(" ");
	a=5;
	for(j=1;j<=i;j++)
	{
	System.out.print(a*2);
	a--;
	}
	System.out.println();
	}
	}
}
