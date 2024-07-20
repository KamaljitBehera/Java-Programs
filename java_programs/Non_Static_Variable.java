package java_programs;

public class Non_Static_Variable {
	//This program is used to prove that the nonstatic variable value varies from object to object.
	int x=10;
 public static void main(String[] args) {
	//creating multiple object of the class
	 Non_Static_Variable var1=new Non_Static_Variable();
	 Non_Static_Variable var2=new Non_Static_Variable();
	 Non_Static_Variable var3=new Non_Static_Variable();
	 Non_Static_Variable var4=new Non_Static_Variable();
	 //Printing the value for each object
	 System.out.println(var1.x);
	 System.out.println(var2.x);
	 System.out.println(var3.x);
	 System.out.println(var4.x);
	 //Changing the value of var2 object
	 var2.x=20;
	 //After changing the value print the value for each object
	 System.out.println(var1.x);
	 System.out.println(var2.x);
	 System.out.println(var3.x);
	 System.out.println(var4.x);
	 //here value is only change for var2 object not for all object instead.
}
}
