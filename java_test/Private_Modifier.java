package java_test;

public class Private_Modifier {
	//creating two private data members
	   private int age=20;
	   private String name="kamaljit";
	   //creating a private method
	   private void details() {
		   System.out.println("My name is "+name+" and age is "+age);
	   }
	  /* public static void main(String[] args) {
		   //creating the object of Private_modifier class
		Private_modifier ref=new Private_modifier();
		//Try to access private method inside the class
		ref.details();//Private modifier give access to use data members and method inside the class only
		//Here we try the private member outside the class  and outside the package as well but we get compile time error on both the cases
		  }*/
		//comment this section for use the private members outside the class
	}


	/* public class Private_modifier{
		public static void main(String[] args) {
			Test tobj=new Test();
//			tobj.details();//here we get compile time error
		}
	}*/


