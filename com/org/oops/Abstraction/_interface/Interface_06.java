package com.org.oops.Abstraction._interface;
//this program is used to demonstrate that how to implement a method contained by two different interface
// Creating interface 1
interface Parent_1{
	//Creating method
	public void details();
}
//Creating interface 2
interface Parent_2{
	//Creating same method
	public void greeting();
}
//implemented class
public class Interface_06 implements Parent_1,Parent_2 {
    public static void main(String[] args) {
//    	creating the object of implemented class
    	Interface_06 obj=new Interface_06();
    	obj.details();
    	obj.greeting();
/*   	
    	Explanation:-
    	If more than one interface having different method signature the we have to
    	provide implementation separately.
*/
	}

	@Override
	public void details() {
		System.out.println("Hello There i am the implemented method for Parent_1 the interface.");
		
	}

	@Override
	public void greeting() {
		System.out.println("Hello There i am the implemented method for Parent_2 the interface.");
		
	}
}
