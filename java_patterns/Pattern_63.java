package java_patterns;
/*
 * Program to print numbers in below pattern
  * 108642    
  * 8642 
  * 642 
  * 42
  * 2
 * */
public class Pattern_63 {
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
	System.out.print(j*2);
	}
	System.out.println();
	}
	}
}
