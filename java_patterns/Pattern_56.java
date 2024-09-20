package java_patterns;
/*
 * Program to print numbers in below pattern
  * 12345    
  * 1234
  * 123
  * 12
  * 1
 * */
public class Pattern_56 {
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
	System.out.print(a);
	a++;
	}
	System.out.println();
	}
	}
}
