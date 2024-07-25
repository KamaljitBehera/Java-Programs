package java_programs;

//This program is illustrate the concept of Multilevel inheritance
//Creating the grand parent class
class GrandParent{
	public GrandParent() {
		System.out.println("Hello There! i am the GrandParent Class");
	}
}

//creating parent class
class Parent_Of_Child extends GrandParent{
	public Parent_Of_Child () {
		super();
		System.out.println("hello There! I am the Parent1 class");
	}
}
//creating the child class
class Child extends Parent_Of_Child{
	public Child() {
		super();
		System.out.println("Hello there! I am the child class");
	}
}
//This is the driver class
public class MultiLevel_Inheritance {
 //creating main method
	public static void main(String[] args) {
		//Creating the object of Child class 
		GrandParent ref=new Child();
	}
}
