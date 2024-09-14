package java_patterns;
/*
 * Program to print numbers in below pattern
  *      2
  *     24
  *    246
  *   2468
  * 246810
 * */
public class Pattern_35 {
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
	System.out.print(j*2);
	}
	System.out.println();
	}
	}
}
