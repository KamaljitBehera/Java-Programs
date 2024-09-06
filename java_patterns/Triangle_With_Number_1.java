package java_patterns;
/*
 * Program to print numbers in below pattern
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * */

public class Triangle_With_Number_1 {
//Creat the amin method
	public static void main(String args[]) {
//	declaring the loop variables
		int i, j;
//	Outer loop is for row
		for (i = 1; i <= 5; i++) {
//  inner loop is for column
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
