package java_programs;

//Java program to illustrate the
	// concept of Hierarchical  inheritance
//creating class A
class AA {
  public void print_A() { System.out.println("Class AA"); }
}
//creating class B and extends A
class BB extends AA {
  public void print_B() { System.out.println("Class BB"); }
}
//creating class C and extends A
class CC extends AA {
  public void print_C() { System.out.println("Class CC"); }
}
//creating class D and extends A
class DD extends AA {
  public void print_D() { System.out.println("Class DD"); }
}
//Driver Class
public class Hybrid_Inheritance {
	    public static void main(String[] args)
	    {
	    	//creating object of class B
	        BB obj_B = new BB();
	        obj_B.print_A();
	        obj_B.print_B();
	        
	    	//creating object of class C
	        CC obj_C = new CC();
	        obj_C.print_A();
	        obj_C.print_C();
	        
	    	//creating object of class D
	        DD obj_D = new DD();
	        obj_D.print_A();
	        obj_D.print_D();
	    }
	}


