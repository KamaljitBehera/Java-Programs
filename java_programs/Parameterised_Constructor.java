package java_programs;
//This program is used to demonstrate the usage and creation of parameterized constructor

public class Parameterised_Constructor {
	//more than two parameter
 public Parameterised_Constructor(int age,String name) {
	   System.out.println("Parameterized constructor is called");
	   System.out.println("My name is "+name+" and age is "+age);
}
 //string type parameter
 public Parameterised_Constructor(String college) {
	   System.out.println("College name is "+college);
}
 public static void main(String[] args) {
	//Creating non_parameterized constructor
	   //Parameterized_constructor obj=new Parameterized_constructor();//This give error because if in the current class there is 
	   //any type of constructor is present then JVM not call the Default constructor
	   
	   //Creating Parameterized constructor with string type as an argument
	 Parameterised_Constructor object=new Parameterised_Constructor("BPUT");
	   
	   //creating object with both int and String type as an argument
	 Parameterised_Constructor refer=new Parameterised_Constructor(20, "Kamaljit");
	   
}
}
