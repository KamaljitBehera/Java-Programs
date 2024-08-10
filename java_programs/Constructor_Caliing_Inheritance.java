package java_programs;

//This program used to demonstrate how the constructor calling is happening in inheritance
//Creating the parent class
class P_Constructor_Caliing_Inheritance {
	public P_Constructor_Caliing_Inheritance() {
		System.out.println("I am the parent class constructor");
	}
}

//Driver class extending the P_Constructor_Caliing_Inheritance
public class Constructor_Caliing_Inheritance extends P_Constructor_Caliing_Inheritance {
//   creating the constructor
	public Constructor_Caliing_Inheritance() {
//		super();//here it is written by programmer or else JVM it is executed automatically
		
		System.out.println("I am the child class constructor");
	}

//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Constructor_Caliing_Inheritance obj = new Constructor_Caliing_Inheritance();

	}
}
