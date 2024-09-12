package java_patterns;

/*
 * Program to print numbers in below pattern
  *     10
  *    810
  *   6810 
  *  46810
  * 246810
 * */
public class Pattern_24 {
//	Creating main method
	public static void main(String args[])
	{
//  Declaring the loop variables
	int i,j,a,b,k;
	a=5;
//  Outer loop is for row
	for(i=1;i<=5;i++)
	{
//	Inner loop is for column
	for(k=1;k<=5-i;k++)
	System.out.print(" ");
	b=a;
	for(j=1;j<=i;j++)
	{
	System.out.print(b*2);
	b++;
	}
	a--;
	System.out.println();
	}
	}
}
