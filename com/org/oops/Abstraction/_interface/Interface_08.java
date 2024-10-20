package com.org.oops.Abstraction._interface;
//This program is used to demonstrate that how to implement a method having same
//method signature but different non primitive return type.
interface ClassParent_1 {
	// Creating method
	public Object details();
}

//Creating interface 2
interface ClassParent_2 {
	// Creating same method
	public String details();
}

//implemented class
public class Interface_08 implements ClassParent_1,ClassParent_2 {
public static void main(String[] args) {
	{
		Interface_08 ref=new Interface_08();
		System.out.println(ref.details());
/*		
    	Explanation:-
		if method having same method signature but different non primitive return type then implementation provided according to the co_varient concept
*/ 
	}
}
	@Override
	public String details() {
		// TODO Auto-generated method stub
		return "Hello there";
	}

}
