package java_test;


//Java program to demonstrate How Diamond Problem
//Is Handled in case of Default Methods

//Interface 1
interface G_inter {

	// Default method
	default void show()
	{

		// Print statement
		System.out.println("Default G_inter");
	}
}

//Interface 2
//Extending the above interface
interface inter1 extends G_inter {
}

//Interface 3
//Extending the above interface
interface inter2 extends G_inter {
}

//Main class
//Implementation class code
class MultipleInheritance_2 implements inter1,inter2 {

	// Main driver method
	public static void main(String args[])
	{

		// Creating object of this class
		// in main() method
		MultipleInheritance_2 d = new MultipleInheritance_2();

		// Now calling the function defined in interface 1
		// from whom Interface 2and 3 are deriving
		d.show();
	}

	
}

 