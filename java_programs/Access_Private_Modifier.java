package java_programs;

import java_test.Private_Modifier;

public class Access_Private_Modifier {
 public static void main(String[] args) {
	 //Creating the object of Private_modifier.
	Private_Modifier object=new Private_Modifier();
	//object.details();compile time error because of the it is a private member which is not access outside the class and packages also.
}
}
