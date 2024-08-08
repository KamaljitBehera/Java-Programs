package java_test;
//A Java program to demonstrates
//an abstract class with constructors

//Creating an abstract class Car
abstract class Car {

//Creating a constructor in
//the abstract class
	Car() { 
	System.out.println("car is created"); 
	}
}

//A class that extends the 
//abstract class Car
class Maruti extends Car {

//Method defining inside
//the Maruti class
	void run() { 
	System.out.println("Maruti is running"); 
	}
}
//Driver class
 public class Abstraction_7  {

	public static void main(String[] args)
	{
		Maruti c = new Maruti();
		c.run();
	}
}

