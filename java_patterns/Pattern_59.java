package java_patterns;
/*
 * Program to print numbers in below pattern
  * 12345    
  * 2345
  * 345
  * 45
  * 5
 * */
public class Pattern_59 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j,a,b;
	a=1;
//	Outer loop is for row
	for(i=5;i>=1;i--)
	{
	b=a;
//	Inner loop is for column
	for(j=1;j<=i;j++)
	{
	System.out.print(b);
	b++;
	}
	a++;
	System.out.println();
	}
	}
}
