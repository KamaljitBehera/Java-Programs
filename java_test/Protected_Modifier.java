package java_test;

public class Protected_Modifier {
	 protected static  int age=20;
	   protected static String name="Kamaljit";
	   protected static void details() {
		   System.out.println("My name is "+name+" and age is"+age);
	   }
	 /*  public static void main(String[] args) {
		   //Try to access protected members inside the class it is possible to access it inside the class 
		details();
	}*/
	   //comment this part to use the protected members outside the class
	}
	/*class Test{
		public static void main(String[] args) {
			//creating the object of Protected_modifier class
			Protected_modifier objs=new Protected_modifier();
			objs.details();//we can access it outside the class as well
		}
	}
	to perform this program we have to make class name same as the file name if we do it in command prompt we compile it by file name and execute it by the
	class name in which main method is present.
	*/
