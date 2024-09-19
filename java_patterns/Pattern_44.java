package java_patterns;
/*
 * Program to print numbers in below pattern
  * 246810    
  * 2468
  * 246
  * 24
  * 2
 * */
public class Patttern_44 {
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
	System.out.print(j*2);
	}
	System.out.println();
	}
	}
}
