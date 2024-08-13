package java_test;

interface GP_Static_Method{
	public static void greet() {
		System.out.println("Hello");
	}
}
interface P_Static_Method extends GP_Static_Method{
	public static void greetings() {
		System.out.println("Hello there!");
	}
}
public class Static_Method implements P_Static_Method{

	public static void main(String[] args) {
		greet();
		greetings();
	}
}
