package java_programs;

//This program will demonstrate how to create own default constructor
public class User_Default_constructor {
public User_Default_constructor() {
	System.out.println("Userdefined default constructor is called");
}
public static void main(String[] args) {
	//creating an object to call the default constructor
	 User_Default_constructor obj= new User_Default_constructor();//Userdefined default constructor is called
	 User_Default_constructor ref= new User_Default_constructor();
	 //the constructor is called as we create an new object
}
}
