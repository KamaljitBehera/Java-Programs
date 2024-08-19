package java_number_types;
//Program to check the number is happy number or not.
//Happy Number:-A number is called Happy number, if sum of its square digits are calculated till the single digit is obtained by recursively adding the sum of its square digits. If the single digit comes is 1 then only the number is a Happy number.
import java.util.Scanner;

public class Happy_Number {
	public static void main(String args[])
	{
//		creating the scanner class object
		Scanner sc=new Scanner(System.in);
//		Taking the input from user
		System.out.println("Enter the number");
		int n=sc.nextInt();
//		declaring the variable
        int sum=0,rem=0,count=0;
//While loop is for checking the condition 
		while(sum!=1)
		{   
			if(count<=4)
			{
				sum=0;
				while(n>0)
				{
                  rem=n%10;
				  sum=sum+(rem*rem);
				  n=n/10;
				}
				n=sum;
				count++;
				if(sum==1)
				{
					System.out.println("It is a happy Number");
				}
			}
			else
			{
				System.out.println("It is not a happy number");
				break;
			}
			//n=sum;
		}
//		close the costly connection
		sc.close();
	}

}

