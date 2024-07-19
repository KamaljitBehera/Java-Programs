package java_programs;
//This program used to demonstrate the swapping of number without using third variable
import java.util.Scanner;
public class Swap_Without_Third {
	public static void main(String[] args) {
        //Swapping two number without using third variable
        Scanner sc=new Scanner(System.in);
		//Taking the first number as input
		System.out.println("Enter the first number");
		int first_num=sc.nextInt();
		//Taking the Second number as input
		System.out.println("Enter the Second number");
		int second_num=sc.nextInt();
		//printing the number before swapping
		System.out.println("The first number before swapping is:"+first_num);
		System.out.println("The second numberbefore swapping is:"+second_num);
		//starting swapping
          first_num=first_num+second_num;
          second_num=first_num-second_num;
          first_num=first_num-second_num;
		//printing the swapped variable
		System.out.println("The first number is:"+first_num);
		System.out.println("The second number is:"+second_num);
		sc.close();
    }
}
