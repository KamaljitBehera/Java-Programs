package java_patterns;
/*
 * Program to print numbers in below pattern
  * 99999    
  * 7777
  * 555
  * 33
  * 1
 * */
public class Pattern_49 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j;
//	Outer loop is for row
	for(i=5;i>=1;i--)
	{
//	Inner loop is for column
	for(j=1;j<=i;j++)
	{
	System.out.print((i*2)-1);
	}
	System.out.println();
	}
	}
}
