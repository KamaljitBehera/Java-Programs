package java_patterns;
/*
 * Program to print numbers in below pattern
  * 22222    
  * 4444
  * 666
  * 88
  * 10
 * */
public class Pattern_54 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j,a;
	a=1;
//	Outer loop is for row
	for(i=5;i>=1;i--)
	{
//	Inner loop is for column
	for(j=1;j<=i;j++)
	{
	System.out.print(a*2);
	}
	a++;
	System.out.println();
	}
	}
}
