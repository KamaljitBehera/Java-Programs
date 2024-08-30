package java_test;
//Program to understand the execution flow of the default constructor.
//creating the class
class Branch{
	public Branch() {
		System.out.println("i am the Branch class constructor");
	}
}
//creating the child class
class CSE extends Branch{
	public void intro() {
		System.out.println("Hello there i am the cse branch");
	}
}
//Driver class
public class Default_Constructor_1 {
//  creating the main method
	public static void main(String[] args) {
//		Creating the cse class object
		CSE cse = new CSE();
//		calling the method
		cse.intro();
		
/*   	Explanation:-
		If the user forget to create or don't want to create the constructor but jvm will create the construtor 
		called as default constructor.And inside default constructor there is one line of code is there that is 
		call to super() which call the current parent class constructor.
*/
	}
}
