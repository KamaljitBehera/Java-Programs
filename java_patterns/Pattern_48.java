package java_patterns;
/*
 * Program to print numbers in below pattern
  * 1010101010    
  * 8888
  * 666
  * 44
  * 2
 * */
public class Pattern_48 {
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
	System.out.print(i*2);
	}
	System.out.println();
	}
	}
}
