package java_programs;
//This program is used to demonstrate the construction of singleton class
//Singlton class:-A class which has the ability to create only one object by the help of private constructor and static memebers
//Creating the class
class P_Singleton_Class{
	//creating a static object 
	static P_Singleton_Class obj=new P_Singleton_Class();
//	creating the private data member
	private P_Singleton_Class() {
	}
	
//	creating the factory method always returning the same object
	public static P_Singleton_Class getInstance() {
		return obj;
	}
}
//driver class
public class Singleton_Class {
//	Creating the main method
	public static void main(String[] args) {
//		creating the object using the factory method we created
		P_Singleton_Class obj1 = P_Singleton_Class.getInstance();
		P_Singleton_Class obj2 = P_Singleton_Class.getInstance();
//		checking the objects are same or not
		System.out.println(obj1.equals(obj2));
	}
}
