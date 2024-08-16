package java_programs;

import java.util.Random;
import java.util.Scanner;

public class Rock_Papper_Scissor {
	static String arr[]= {"rock","paper","scissor"};
	static String userChoice;
	static String userWish="yes";
	public void game(){
		Scanner sc=new Scanner(System.in);
		  while(userWish.equals("yes"))
		    {
		    	System.out.println("Enter your choice rock or paper or scissor ");
			    userChoice=sc.next().toLowerCase();
			    Random rand=new Random();
				int randNum=rand.nextInt(3);
				String computerChoice=arr[randNum];
		    	if(computerChoice.equals(userChoice)) {
			    	System.out.println("This game is draw.");
			    	System.out.println("Your choice is:"+userChoice);
			    	System.out.println("And Computer Choice is:"+computerChoice);
			    }
			    else{
			    	if(userChoice.equals("rock")&& computerChoice.equals("scissor")
			    	   ||userChoice.equals("paper")&& computerChoice.equals("rock")
			    	   ||userChoice.equals("scissor")&& computerChoice.equals("paper")
			    			) {
			    		System.out.println("Congratulation!!!!!");
			    		System.out.println("You won");
			    		System.out.println("Your choice is:"+userChoice);
				    	System.out.println("And Computer Choice is:"+computerChoice);
			    	}
			    	else {
			    		System.out.println("sorry you lose this game");
			    		System.out.println("Better luck next time");
			    		System.out.println("Your choice is:"+userChoice);
				    	System.out.println("And Computer Choice is:"+computerChoice);
			    	}
			    }

		    	System.out.println("Are you want to try again????");
		    	System.out.println("Type yes or no");
		    	userWish=sc.next().toLowerCase();
		    }

		}
	 
	
	
	public static void main(String[] args) {
		Rock_Papper_Scissor obj=new Rock_Papper_Scissor();
		obj.game();
	}
}

