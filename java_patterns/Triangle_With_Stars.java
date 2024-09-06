package java_patterns;
/*
 * Program to print numbers in below pattern
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * */
public class Triangle_With_Stars {
//Creating the main method
	public static void main(String args[])
	{
//		declaring the loop variables
		int i,j;
//		outer loop is for count the row
		for(i=1;i<=5;i++)
		{
//			inner loop is for print the column
		for(j=1;j<=i;j++)
		 {
		System.out.print("*");
		}
		System.out.println();
	}
	
	}
}
