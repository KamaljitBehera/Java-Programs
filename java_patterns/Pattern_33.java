package java_patterns;
/*
 * Program to print numbers in below pattern
  *          2
  *         44
  *        666
  *       8888
  * 1010101010
 * */
public class Pattern_33 {
//	Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j,k;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	 {
//	Inner loop is for column
	for(k=1;k<=5-i;k++)
	System.out.print(" ");
	for(j=1;j<=i;j++)
	{
	System.out.print(i*2);
	}
	System.out.println();
	}
	}
}
