package java_patterns;
/*
 * Program to print numbers in below pattern
  * 246810    
  * 2468
  * 246
  * 24
  * 2
 * */
public class Pattern_57 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j,a;
//	Outer loop is for row
	for(i=5;i>=1;i--)
	{
	a=1;
//	Inner loop is for column
	for(j=1;j<=i;j++)
	{
	System.out.print(a*2);
	a++;
	}
	System.out.println();
	}
	}
}
