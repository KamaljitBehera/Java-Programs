package java_programs;

import java_test.Default_Modifier;

public class Access_Default_modifier {
  public static void main(String[] args) {
	  //Creating Default_modifier object in JavaPrograms packages
	Default_Modifier obj=new Default_Modifier();
	//try to access display method inside Default_modifier
//	obj.display();//here we get compile time error because of Default access modifier which is only access inside the same package only

	}
 
}
