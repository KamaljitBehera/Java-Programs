package java_number_types;
//This program is used to get the fibbonacci series
//Fibonacci Series:-The series starts with 0 and 1, after that each successive number is the sum of its previous number plus the number previous to previous number.
import java.util.Scanner;

public class Fibbonacci_Series_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
	Scanner sc=new Scanner(System.in);
	int num,firstNum,secondNum,c;
	firstNum=0;
	secondNum=1;
//	taking the user input
	System.out.println("Enter a number");
	num=sc.nextInt();
//	checking the number is 1 or not
	if(num==1)
	System.out.print(firstNum);
	else
	{
	System.out.print(firstNum+" "+secondNum);
//	after 3 to get other number
	for(int i=3;i<=num;i++)
	{
	c=firstNum+secondNum;
	System.out.print(" "+c);
	firstNum=secondNum;
	secondNum=c;
	 }
	}
//	close the costly resources
	sc.close();
	}
}
