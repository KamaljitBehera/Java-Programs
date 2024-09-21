package java_patterns;
/*
 * Program to print numbers in below pattern
  * 97531    
  * 7531 
  * 531 
  * 31
  * 1
 * */
public class Pattern_64 {
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
	System.out.print((j*2)-1);
	}
	System.out.println();
	}
	}
}
