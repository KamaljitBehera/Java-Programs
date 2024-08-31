package java_programs;
//This program is used to demonstrate how the data abstraction happening with abstract class.
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();
    
    // Regular method
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {
    // Providing implementation of the abstract method
    public void sound() {
        System.out.println("The dog barks.");
    }
}
//Driver class
public class Data_Abstraction_With_Abstract_Class {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Outputs: The dog barks.
        myDog.sleep();  // Outputs: The animal is sleeping.
    }
}

