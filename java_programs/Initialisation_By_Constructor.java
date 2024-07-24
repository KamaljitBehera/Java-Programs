package java_programs;

public class Initialisation_By_Constructor {
	//this program is demonstrate how to initialize the global variables and static variables

		static int age;
		static String name;
		//initialize variable by constructor
	  public Initialisation_By_Constructor(int age,String name) {
		  this.name=name;
		  this.age=age;
	}
	  public static void main(String[] args) {
		  //creating the object
		  Initialisation_By_Constructor obj=new Initialisation_By_Constructor(20,"Kamaljit");
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
	}

}
