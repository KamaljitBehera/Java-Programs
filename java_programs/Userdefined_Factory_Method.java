package java_programs;
//this program is for to demonstrate how to create user defined factory method
///creating a class
class P_Userdefined_Factory_Method{
	//To create user defined factory method we need the private constructor
		private String name;
		
//		creating the privat constructor
		private P_Userdefined_Factory_Method(String name) {
			this.name=name;
		}
//		factory method
		public static P_Userdefined_Factory_Method getInstance(String name)
		{
//			here each time thefactory method call it return different object but we can make it single object
//			which is called as the singleton class
			return new P_Userdefined_Factory_Method(name);
		}
//		override the tostring method
		public String toString() {
			return "Name: "+ name;
		}
		
}
public class Userdefined_Factory_Method {
//	Creating the main method
	public static void main(String[] args) {
//		Creating the object by using factory method
		P_Userdefined_Factory_Method obj1 = P_Userdefined_Factory_Method.getInstance("kamal");
//		calling the to string method
		System.out.println(obj1.toString());
		P_Userdefined_Factory_Method obj2 = P_Userdefined_Factory_Method.getInstance("Adarsh");
//		calling the tostring method with different object
		System.out.println(obj2.toString());
//		checking the both object is same or not
		System.out.println(obj1.equals(obj2));
	}
}
