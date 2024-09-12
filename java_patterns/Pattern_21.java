package java_patterns;
/*
 * Program to print numbers in below pattern
 *      @
 *     ##
 *    @@@
 *   ####
 *  @@@@@
 * */
public class Pattern_21 {
//	Creating main method
	public static void main(String args[])
	{
//  Declaring the loop variables
	int i,j,k;
//  Outer loop is for row
	for(i=1;i<=5;i++)
	{
//  Inner loop is for column
	for(k=1;k<=5-i;k++)
	System.out.print(" ");
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
