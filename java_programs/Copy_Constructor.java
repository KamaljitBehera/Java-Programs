package java_programs;

public class Copy_Constructor {
	static int age;
	static String name;
	//initialize variable by constructor
   public Copy_Constructor(int age,String name) {
	  this.name=name;
	  this.age=age;
	  System.out.println("My name is "+name);
	  System.out.println("My age is "+age);
}
   //creating copy constructor
   public Copy_Constructor(Copy_Constructor obj) {
	   System.out.println("Copy constructor called successfully");
	   this.name=obj.name;
	   this.age=obj.age;
	   System.out.println("My name is "+name);
	   System.out.println("My age is "+age);
   }
  public static void main(String[] args) {
	//creating object having int and string type as an argument
	  Copy_Constructor obj=new Copy_Constructor(20,"Kamaljit");
	  
	  //calling copy constructor by passing the obj object as an argument
	  Copy_Constructor ref=new Copy_Constructor(obj);
	  
}

}
