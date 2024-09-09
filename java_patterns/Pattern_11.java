package java_patterns;
/*
 * Program to print numbers in below pattern
 * 5
 * 54
 * 543
 * 5432
 * 54321
 * */
public class Pattern_11 {
//Creating main method
	public static void main(String args[])
	{
//	Declaring the loop variables
	int i,j,a;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
//  Inner loop is for column
	a=5;
	for(j=1;j<=i;j++)
	{
	System.out.print(a);
	a--;
	}
	System.out.println();
	}
	 }
}
