package java_programs;
//This program is used to demonstrate that the role of init block at the time of constructor invocation.
public class Initializer_Block {
//	declaring the instance variable
	int number;
//	creating the constructor
	public Initializer_Block() {
		System.out.println("The number is "+number);
	}
//	Initialize block or instance block
	{
		number=30;
	}
public static void main(String[] args) {
//Creating the object
	Initializer_Block obj = new Initializer_Block();
}
}
