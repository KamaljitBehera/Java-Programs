package java_patterns;
/*
 * Program to print numbers in below pattern
 * 
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * */
public class Triangle_With_Number {
//creating the main method
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
		System.out.print(i);
		}
		System.out.println();
		}
		}
}
