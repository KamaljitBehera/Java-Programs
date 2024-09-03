package java_test;
//This program is used for understanding that can we override the static method
//creating a class
class P_Static_Method_2{
	public static void greet() {
		System.out.println("I am the parent class static method");
	}
}
public class Static_Method_2 extends P_Static_Method_2{
//	Override the parent class method
	public static void greet() {
		System.out.println("I am the child class static method");
	}
	
//	creat main method
	public static void main(String[] args) {
//		creating the object
		P_Static_Method_2 obj=new Static_Method_2();
//		creating the object
		Static_Method_2 obj2=new Static_Method_2();
//     calling the method
		obj.greet();
		obj2.greet();
	}
}
