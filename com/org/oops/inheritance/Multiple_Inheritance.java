package com.org.oops.inheritance;

//This program is illustrate the concept of multiple inheritance
//By the way the multiple inheritance is not supported in Class but supported in interface

//In Multiple inheritance, A single child class extend more than one parent class

//Parent_1 class
class PArent_1{
	  public PArent_1() {
		  System.out.println("Hello there! i am first parent of Child class");
	}
}
//Parent_2 class
class PArent_2{
	  public PArent_2() {
		System.out.println("Hello There! I am the second parent of Child class");
	}
}
//creating the child class
/*  class Child extends Parent_1{
	  
}
class Child extends Parent_2{
	  
}
class Child1 extends PArent_1,PArent_2
{
	//Due to multiple inheritance not support in class so we get compile time error
	public Child1(){
	 System.out.println("hello There! I am the Child class");
//	}
//}*/
//Driver class
public class Multiple_Inheritance {
  //creating main method
	public static void main(String[] args) {
		//creating the object of child class 
//		Child1 ref=new Child1();
	}
}
