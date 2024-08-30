package java_test;
//Program to understand the test case that is related to copy constructor.
//Creating the class
class P_Copy_Constructor_1{
//	Creating the instance variables
	String name;
	int age;
//	Creating the constructor to initialize the instance variables
	public P_Copy_Constructor_1(String name,int age) {
		this.name=name;
		this.age=age;
	}
/*//	creating the copy constructor
	P_Copy_Constructor_1(P_Copy_Constructor_1 pc){
		System.out.println("Copy constructor is called");
		name=pc.name;
		age=pc.age;
	}
	public String toString() {
		return name +"   "+age;
		
	}
*/
	
}
public class Copy_Constructor_1 {
//	Creating the main method
	public static void main(String[] args) {
//		Creating the object of  P_Copy_Constructor_1
		P_Copy_Constructor_1 obj=new P_Copy_Constructor_1("kamaljit", 20);
//		P_Copy_Constructor_1 obj1=new P_Copy_Constructor_1(obj);//Here we get compile time error
//		System.out.println(obj1.toString());
		
/*		Explanation:-
		We can't use the copy constructor until we not declare that copy constructor.
		
*/
	}
}
