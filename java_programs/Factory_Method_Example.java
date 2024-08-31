package java_programs;
//This program is use to demonstrate what is a factory method and how to use it.
//Factory method:-A method which is call by its class name and return the object of class.
public class Factory_Method_Example {
	public static void main(String[] args) {
//		Runtime class is predefined class to demonstrate the factory method
		Runtime rt = Runtime.getRuntime();
		Runtime rt1 = Runtime.getRuntime();
//		Checking the two object are same or deferent
		
//		When we use factory method to create the object of a class the it always return the same object.
//		Which is also called as the singleton class
		if(rt.equals(rt1)) {
			System.out.println("Both the object are same");
		}
		else
		{
			System.out.println("Both the object are not same");
		}
	}

}
