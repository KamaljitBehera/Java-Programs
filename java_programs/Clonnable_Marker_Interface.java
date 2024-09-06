package java_programs;
//Java program to illustrate Cloneable interface 

//Creating a parent class

//By implementing Cloneable interface 
//we make sure that instances of class A 
//can be cloned.
class P_Cloneable_Marker_Interface implements Cloneable{
	 int i; 
	    String s; 
	  
	    // A class constructor 
	    public P_Cloneable_Marker_Interface(int i,String s) 
	    { 
	        this.i = i; 
	        this.s = s; 
	    } 
	  
	    // Overriding clone() method 
	    // by simply calling Object class 
	    // clone() method. 
	    @Override
	    protected Object clone() 
	    throws CloneNotSupportedException 
	    { 
	        return super.clone(); 
	    } 
}
//driver class
public class Clonnable_Marker_Interface {
//	Creating the main method
	public static void main(String[] args) throws CloneNotSupportedException
	{
		P_Cloneable_Marker_Interface a = new P_Cloneable_Marker_Interface(20, "GeeksForGeeks"); 
		  
	        // cloning 'a' and holding 
	        // new cloned object reference in b 
	  
	        // down-casting as clone() return type is Object 
		P_Cloneable_Marker_Interface b = (P_Cloneable_Marker_Interface)a.clone(); 
	  
	        System.out.println(b.i); 
	        System.out.println(b.s); 
	}
}
