package java_programs;


//Java program to illustrate the
	// concept of Hierarchical  inheritance
//creating class A
class AAA {
  public void print_A() { System.out.println("Class AA"); }
}
//creating class B and extends A
class BBB extends AAA {
  public void print_B() { System.out.println("Class BB"); }
}
//creating class C and extends A
class CCC extends AAA {
  public void print_C() { System.out.println("Class CC"); }
}
//creating class D and extends A
class DDD extends AAA {
  public void print_D() { System.out.println("Class DD"); }
}
//Driver Class
public class Hierarchical_Inheritance {
	    public static void main(String[] args)
	    {
	    	//creating object of class B
	        BBB obj_B = new BBB();
	        obj_B.print_A();
	        obj_B.print_B();
	        
	    	//creating object of class C
	        CCC obj_C = new CCC();
	        obj_C.print_A();
	        obj_C.print_C();
	        
	    	//creating object of class D
	        DDD obj_D = new DDD();
	        obj_D.print_A();
	        obj_D.print_D();
	    }
	}

