package java_programs;
//This program is used to demonstrate how to achieve multilevel inheritance by using interface
//Grand parent interface
interface G_MultiLevel_Inheritance_By_Interface{
 void details();
 
}
//parent interface implements grand parent interface
interface P_MultiLevel_Inheritance_By_Interface extends G_MultiLevel_Inheritance_By_Interface{
	void details();
}
//driver class as well as child class
public class MultiLevel_Inheritance_By_Interface implements P_MultiLevel_Inheritance_By_Interface {
//	creating the main method
	public static void main(String[] args) {
//		creating the object
		MultiLevel_Inheritance_By_Interface obj=new MultiLevel_Inheritance_By_Interface();
//      calling the methods of parent and grand parent
		obj.details();
		
	}

	@Override
	public void details() {
		System.out.println("In the child method both the parent method are override");
		
	}
}
