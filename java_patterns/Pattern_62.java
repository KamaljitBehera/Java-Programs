package java_patterns;
/*
 * Program to print numbers in below pattern
  * 54321    
  * 4321
  * 321
  * 21
  * 1
 * */
public class Pattern_62 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j;
//	Outer loop is for row
	for(i=5;i>=1;i--)
	{
//	Inner loop is for column
	for(j=i;j>=1;j--)
	{
	System.out.print(j);
	}
	System.out.println();
	}
	}
}
