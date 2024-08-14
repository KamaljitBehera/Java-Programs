package java_test;
//this program is used to show that in case to resolve the conflict that arise when two interface have 
//default method having same method signature that is multiple inheritance 

//Rule-3In case Rule 1 and Rule 2 are not able to resolve the conflict then the implementing class has to specifically override and provide a method with the same method definition.
//Interface 1
interface P1_MultipleInheritance_5 {

	// m1() method of Interface 1/A
	public default void m1()
	{
		System.out.println("m1 method of interface m1");
	}
}

//Interface 2
interface P2_MultipleInheritance_5 {

	// m1() method of Interface 2/B
	public default void m1()
	{
		System.out.println("m1 method of interface B");
	}
}

//Main Class
//This class implements both the interfaces
class MultipleInheritance_5 implements P1_MultipleInheritance_5, P2_MultipleInheritance_5 {

	// Method 1
	// m1() method of class C (This class)
	public void m1()
	{

		// Super keyword called over m1() method
		// for interface 2/B
		P2_MultipleInheritance_5.super.m1();
	}

	// Method 2
	// Main driver method
	public static void main(String args[])
	{
		// Creating an object of this class
		// in the main() method
		MultipleInheritance_5 obj = new MultipleInheritance_5();

		// Calling the method 'm1()'
		// over the class object
		// in the main method()
		obj.m1();
	}
}
