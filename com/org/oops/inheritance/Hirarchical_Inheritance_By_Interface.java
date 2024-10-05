package com.org.oops.inheritance;

//this program is used to demonstrate how thw Hirachical inheritace is happening with the help of interface.
//Creating the parent Interface
interface P_Hirarchical_Inheritance_By_Interface {
	void greet();
}

//Creating the first child interface
interface C1_Hirarchical_Inheritance_By_Interface extends P_Hirarchical_Inheritance_By_Interface {
//	Override the parent interface method
	void greet();
}

//Creating the second child interface
interface C2_Hirarchical_Inheritance_By_Interface extends P_Hirarchical_Inheritance_By_Interface {
//	Override the parent interface method
	void greet();
}

//driver class
public class Hirarchical_Inheritance_By_Interface
		implements C1_Hirarchical_Inheritance_By_Interface, C2_Hirarchical_Inheritance_By_Interface {
//	creating the main method
	public static void main(String[] args) {
//		 creating the object
		C1_Hirarchical_Inheritance_By_Interface obj = new Hirarchical_Inheritance_By_Interface();
//		calling the method
		obj.greet();
//		creating the second child class object
		C2_Hirarchical_Inheritance_By_Interface ref = new Hirarchical_Inheritance_By_Interface();
//		calling the method
		ref.greet();
	}

	@Override
	public void greet() {
		System.out.println("Hello There!");

	}

}
