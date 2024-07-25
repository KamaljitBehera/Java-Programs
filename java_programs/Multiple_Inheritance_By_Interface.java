package java_programs;

//This program is used to illustrate how multiple inheritance is working in interface
//Creating Parent_1 interface
//Java program to illustrate the
//concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

interface One {
public void greeting();
}

interface Two {
public void welcome();
}
interface Three extends One, Two {
  public void details();
}
class Child_1 implements Three {
  @Override public void greeting()
  {
      System.out.println("Hello There");
  }

  public void welcome() 
  { 
  	System.out.println("welcome everyone");
  }
  public void details() {
  	System.out.println("Multiple inheritance by interface program executed successfully");
  }
}
public class Multiple_Inheritance_By_Interface{
	public static void main(String[] args) {
		Child_1 c = new Child_1();
      c.greeting();
      c.welcome();
      c.details();
	}
}
