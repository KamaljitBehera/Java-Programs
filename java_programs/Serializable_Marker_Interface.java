package java_programs;
//Java program to illustrate Serializable interface 
//Creating the class implementing the serializable marker interface

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// By implementing Serializable interface 
// we make sure that state of instances of class A 
// can be saved in a file. 
class P_Serializable_Marker_Interface implements Serializable{
	int i; 
    String s; 
  
    // A class constructor 
    public P_Serializable_Marker_Interface(int i,String s) 
    { 
        this.i = i; 
        this.s = s; 
    } 
}
//Driver class
public class Serializable_Marker_Interface {
//	creating the main method
	public static void main(String[] args) throws IOException,ClassNotFoundException
	{
		P_Serializable_Marker_Interface a = new P_Serializable_Marker_Interface(20,"GeeksForGeeks"); 
		  
        // Serializing 'a' 
        FileOutputStream fos = new FileOutputStream("xyz.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(a); 
  
        // De-serializing 'a' 
        FileInputStream fis = new FileInputStream("xyz.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        P_Serializable_Marker_Interface b = (P_Serializable_Marker_Interface)ois.readObject();//down-casting object 
  
        System.out.println(b.i+" "+b.s); 
  
        // closing streams 
        oos.close(); 
        ois.close(); 
	}
}
