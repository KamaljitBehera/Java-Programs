package java_test;
//this program is used to show that in case to resolve the conflict that arise when two interface have 
//default method having same method signature that is multiple inheritance 

//Rule-1: Classes take higher precedence than interfaces 
//interface 1
interface P1_MultipleInheritance_3{
	public default void details() {
		System.out.println("I am the method inside the parent 1 interface");
	}
}
//interface 2
interface P2_MultipleInheritance_3{
	public default void details() {
		System.out.println("I am the method inside the parent 2 interface");
	}
}
//creating the class
class HighClass{
	public void details() {
		System.out.println("I am the method inside the HighClass");
	}
}
//Driver Class extending HighClass and implements both the interface
public class MultipleInheritance_3 extends HighClass implements P1_MultipleInheritance_3,P2_MultipleInheritance_3{
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		MultipleInheritance_3 obj=new MultipleInheritance_3();
		obj.details();//output=I am the method inside the HighClass
		
	}
}
