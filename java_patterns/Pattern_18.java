package java_patterns;
/*
 * Program to print numbers in below pattern
 * @
 * ##
 * @@@
 * ####
 * @@@@@
 * */
public class Pattern_18 {
//	Creating the main method
	public static void main(String args[])
	{
//  Declaring the required variables
	int i,j;
//	Outer loop is for row
	for(i=1;i<=5;i++)
	{
//  Inner loop is for column
	for(j=1;j<=i;j++)
	{
	if(i%2==0)
	System.out.print("#");
	else
	System.out.print("@");
	}
	 System.out.println();
	}
	}
}
