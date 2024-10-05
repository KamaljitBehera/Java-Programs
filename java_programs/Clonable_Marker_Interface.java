package java_programs;

//Understand how to implement the clonable interface.

//Creating a class implementing the Clonable interface
class P_Clonable_Marker_Interface implements Cloneable {

//	Creating some instance variable
	int id;
	String name;

	public P_Clonable_Marker_Interface(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

//Driver class
public class Clonable_Marker_Interface {
	public static void main(String[] args) throws CloneNotSupportedException {
//	Creating the object of P_Clonable_Marker_Interface
		P_Clonable_Marker_Interface obj = new P_Clonable_Marker_Interface(10, "Kamaljit");

		P_Clonable_Marker_Interface ref = (P_Clonable_Marker_Interface) obj.clone();

		System.out.println(ref.id);
		System.out.println(ref.name);
	}
}
