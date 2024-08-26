package java_programs;
//This program is used to demonstrate that how we can usethe super keyword to perform the constructor chaining.
//Creating parent class
class GP_ConstructorChainingUsingSuper{
	public GP_ConstructorChainingUsingSuper(int i) {
		this(30d);
		System.out.println("i am the parent class constructor having int type as an argument");
}
public GP_ConstructorChainingUsingSuper(String s) {
	System.out.println("i am the parent class constructor having string type as an argument");
}
public GP_ConstructorChainingUsingSuper(double d) {
	this("hello");
	System.out.println("i am the parent class constructor having double type as an argument");
}
}
//Creating child class
class P_ConstructorChainingUsingSuper extends GP_ConstructorChainingUsingSuper{
	public P_ConstructorChainingUsingSuper(int i) {
		this(10d);
		System.out.println("i am the child class constructor having int type as an argument");
}
public P_ConstructorChainingUsingSuper(String s) {
	super(10);
	System.out.println("i am the child class constructor having string type as an argument");
}
public P_ConstructorChainingUsingSuper(double d) {
	this("kamal");
	System.out.println("i am the child class constructor having double type as an argument");
}
}
//Driver class
public class ConstructorChainingUsingSuper {
   public static void main(String[] args) {
//	Creating the object of child class
	   P_ConstructorChainingUsingSuper obj = new P_ConstructorChainingUsingSuper(10);
}
}
