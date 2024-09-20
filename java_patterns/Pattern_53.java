package java_patterns;
/*
 * Program to print numbers in below pattern
  * 11111    
  * 2222
  * 333
  * 44
  * 5
 * */
public class Pattern_53 {
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
	System.out.print(a);
	}
	a++;
	System.out.println();
	}
	 }
}
