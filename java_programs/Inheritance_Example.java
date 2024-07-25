package java_programs;

//This program is used to illustrate the inheritance concept0

//Creating a parent class
class Parent{
	String name;
	int age;
	long roll_number;
	//creating setDetails non-static method
	public void setDetails(String name,int age,long roll_number) {
		this.name=name;
		this.age=age;
		this.roll_number=roll_number;
	}
	//creating getDetails non-static method
	public void getDetails() {
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My Roll number is "+roll_number);
	}
}
//making the Example_Inheritance is the child class of Parent class by using extend keyword
public class Inheritance_Example extends Parent{
	//creating main method
	public static void main(String[] args) {
		//Through inheritance you can use the parent class Members in the child class
		//creating child class object
		Inheritance_Example obj=new Inheritance_Example();
		//now providing the input details to the setDetails method of parent class
		obj.setDetails("Kamaljit behera", 20, 2101297105);
		//now geting the value by using the getDetails method
		obj.getDetails();
		
	}
}

