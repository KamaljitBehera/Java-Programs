package com.org.oops.Abstraction.abstractclass;
//This program is used to demonstrate how to use the abstract class 

// Let's create an abstract class Shape
abstract class Shape{
	String name;
	String color;
//	creating the constructor to initialize the variable
	public Shape(String name,String color) {
		this.color=color;
		this.name=name;
	}
	//creating an abstract method
	public abstract void area(int width,int height) ;
//	create an no abstract method showing that an abstract class both have abstract as well as concrete method
	public void details(){
		System.out.println("This is in "+name+" shape");
		System.out.println("The color of the shapee is "+color);
	}
}

//creating an child class of Shape
class Rectangle extends Shape{
//       creating the parameterized constructor having name and color as an parameter
	public Rectangle(String name, String color) {
		super(name, color);
		System.out.println("Hello there");
		
	}
// overriding the area method
	@Override
	public void area(int width, int height) {
		System.out.println("The area of the shape is "+(width*height));
		
	}
	
}
public class Abstract_Class_Example {
  public static void main(String[] args) {
	
//	 Creating the object of Rectangle class
	  
	  Rectangle rc=new Rectangle("Rectangle","Red");
//	  Caling the methods
	  rc.area(10,20);
	  rc.details();
}
}
