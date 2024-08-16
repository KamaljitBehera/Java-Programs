package java_programs;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//initializing the user choice to play the game
	String choice="yes";
	while(choice.equals("yes")) {
		Random rand=new Random();
		//generate the the random number between 1 to 100
		int randNum=rand.nextInt(100);
		int tries=0;
		int guess=-1;
		System.out.println("Guess the number between 1 to 100::");
		while(guess!=randNum) {
		//taking the guess value from user
		guess=sc.nextInt();
		tries++;
		if(guess==randNum) {
			System.out.println("you got the right guess");
			System.out.println("Congratulation!!! You got the right guess in "+tries+" guess number");
			System.out.println("Are you want to play again???::");
			choice=sc.next().toLowerCase();
		}
		else if(guess<randNum){
			System.out.println("You guess nuber is smaller then the actual one.\nTry again::");
		}
		else
		{
			System.out.println("You guess nuber is greater then the actual one.\nTry again::");
		}
		}
		
		
	}
	sc.close();
}
}
