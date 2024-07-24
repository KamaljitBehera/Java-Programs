package java_programs;

	class A{
		public A(int a) {
			System.out.println(a);
		}
	}
	class B extends A{
		public B() {
			//to avoid error we have to provide the argumented call to super()
			super('a');
			System.out.println("No argumented constructor is called");
			//Here it gives error because each and every constructor first line code is super() 
			//which call the current parent class constructor in this we have a parameterized constructor of A class is there.
		}
		public B(String nname) {
			super(10);
			System.out.println("Argumented constructor is called");
		}
	}
	public class Constructor_Interview_Question_1 {
	  public static void main(String[] args) {
		//creating object of B class
//		  B obj=new B("Kamal");
//		  B ref=new B();
	}
	}


