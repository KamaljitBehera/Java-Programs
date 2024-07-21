package java_programs;

public class Static_Variable {
	//This program is used to prove that the static variable value doesn't varies from object to object
		static int x=10;
	 public static void main(String[] args) {
		//creating multiple object of the class
		Static_Variable var1=new Static_Variable();
		Static_Variable var2=new Static_Variable();
		Static_Variable var3=new Static_Variable();
		Static_Variable var4=new Static_Variable();
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
		 //here value is only change for all object.
	}

}
