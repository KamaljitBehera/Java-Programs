package java_programs;
//Program to understand how to access the access protected modifier class in another packages
import java_test.Protected_Modifier;

public class Access_Protected_Modifier extends Protected_Modifier {
	public static void main(String[] args) {
		Protected_Modifier objects=new Protected_Modifier();
		objects.details(); //here we can access the protected data members because of it is a child class  
	}
}