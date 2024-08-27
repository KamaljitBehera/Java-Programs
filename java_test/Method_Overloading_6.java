package java_test;
//This program is used to demonstrate how the method overloading is performed 

class Animal {
	// some code
}

class Dog extends Animal {
//	some code 
}

class Cat extends Dog {
//	some code
}

public class Method_Overloading_6 {
//	Creating method having object type as parameter
	public void calling(Object o) {
		System.out.println("I am the method having object type parameter");
	}

//	Creating method having object type as parameter
	public void calling(Dog d) {
		System.out.println("I am the method having Dog type parameter");
	}

//	Creating method having object type as parameter
	public void calling(Cat c) {
		System.out.println("I am the method having Cat type parameter");
	}

//	Creating the main method
	public static void main(String[] args) {
//		creating the object

		Method_Overloading_6 obj = new Method_Overloading_6();
//		calling the method
		obj.calling(null);

		/*
		 * Explanation:- Here priority goes to the smallest child class in relaton
		 * between the parameter
		 */
	}

}
