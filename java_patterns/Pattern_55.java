package java_patterns;
/*
 * Program to print numbers in below pattern
  * 11111    
  * 3333
  * 555
  * 77
  * 9
 * */
//Creating main method
//Declaring the loop variables
//Outer loop is for row
//Inner loop is for column
public class Pattern_55 {
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
	System.out.print((a*2)-1);
	}
	a++;
	System.out.println();
	}
	}
}
