package java_test;

//rogram to demonstrate that can we overload the main method and how to do that
public class Method_Overloading_9 {
	// Normal main()
	public static void main(String[] args) {
		System.out.println("Hi Geek (from main)");
		main("Geek");
	}

	// Overloaded main methods
	public static void main(String arg1) {
		System.out.println("Hi, " + arg1);
		main("Dear Geek", "My Geek");
	}

	public static void main(String arg1, String arg2) {
		System.out.println("Hi, " + arg1 + ", " + arg2);
	}

	/*
	 * Explanation:- Main method is a simple static method which can be overloaded.
	 */
}
