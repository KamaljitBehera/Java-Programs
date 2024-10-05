package java_programs;
//If we not implementing the clonable interface and try to use it then see what happpened.

 class P_Clonable_Test_Case {
//	Creating some instance variable
	int id;
	String name;

	public P_Clonable_Test_Case(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
 
// Driver class
 public class Clonable_Test_Case{
	 public static void main(String[] args) throws CloneNotSupportedException {
//			Creating the object of P_Clonable_Marker_Interface
		 P_Clonable_Test_Case obj = new P_Clonable_Test_Case(10, "Kamaljit");

		 P_Clonable_Test_Case ref = (P_Clonable_Test_Case) obj.clone();

				System.out.println(ref.id);
				System.out.println(ref.name);
			}
	 
//	 Basically it throw the exception called CloneNotSupportedException
 }
