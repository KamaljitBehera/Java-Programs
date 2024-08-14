package java_test;
//this program is used to show that in case to resolve the conflict that arise when two interface have 
//default method having same method signature that is multiple inheritance 

//Rule-2:Derived interfaces or sub-interfaces take higher precedence than the interfaces higher-up in the inheritance hierarchy.


//Interface 1
interface GP_MultipleInheritance_4 {

	// Method of Interface 1
	public default void m1()
	{

		// Execution command whenever
		// interface 1 is called
		System.out.println("m1 method of A");
	}
}

//Interface 2
//This interface is extending above interface
interface P_MultipleInheritance_4 extends GP_MultipleInheritance_4{

	// Method of Interface 1
	public default void m1()
	{

		// Execution command whenever
		// interface 2 is called
		System.out.println("m1 method of B");
	}
}

//Main class
//Which is implementing Interface 2
public class MultipleInheritance_4 implements P_MultipleInheritance_4 {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an object of this class
		// in the main method
		MultipleInheritance_4 c = new MultipleInheritance_4();

		// Calling method over class object
		// created above to illustrate sub-interface
		// has higher precedence
		c.m1();
	}
}

