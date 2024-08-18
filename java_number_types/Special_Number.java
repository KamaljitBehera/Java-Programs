package java_number_types;
//This is the program to check the number is special number or not.
//Special Number:-A number which is equal to the sum of factorial of each digits.
//This number is otherwise called as Krishnamurthi Number or Peterson Number.
import java.util.Scanner;

public class Special_Number {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num,sum=0,facto,reminder,number;
//	Taking the user input
	System.out.println("Enter the number");
	num=sc.nextInt();
	number=num;
	while(num!=0) {
		reminder=num%10;
		facto=1;
//		find out the factorial of each digits
		for(int i=1;i<=reminder;i++) {
			facto=facto*i;
		}
		sum=sum+facto;
		num=num/10;
	}
//	checking the condition meet the requirement
	if(sum==number) {
		System.out.println("The number "+number+" is a special number");
	}
	else
	{
		System.out.println("The number "+number+" is not a special number");

	}
//	close the costly connection
	sc.close();
}
}
