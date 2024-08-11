package java_test;
//A java program to demonstrate if more than one subclass override the same method then whose
//implementation is going to work

//Lets create the parent class
abstract class P_Method_Overriding_15{
	 void details() {
		 System.out.println("Hello there every one");
	 }
}
//Creating the child class
class C1_Method_Overriding_15 extends P_Method_Overriding_15 {
	 void details() {
		 super.details();
		System.out.println("I am the impementation of Child 1");
	}
}
//Creating the child class
class C2_Method_Overriding_15 extends P_Method_Overriding_15{
	void details() {
		System.out.println("I am the impementation of Child 2");
	}
}
//Driver class
public class Method_Overriding_15 {
public static void main(String[] args) {
	P_Method_Overriding_15 obj=new C1_Method_Overriding_15();
//	calling the details() by using child 1 reference
	obj.details();
	P_Method_Overriding_15 ref=new C2_Method_Overriding_15();
//	calling the details() by using child 1 reference
	ref.details();
		}
}
