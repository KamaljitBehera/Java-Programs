package java_programs;
//This program is used to demonstrate that how the data abstraction happening with the help of interfaces.
interface ShapeAll {
//	creating the abstract methods
    void draw();
    double area();
}

class Circle implements ShapeAll {
//	Creating a private data members
    private double radius;
//    implementing all the parent interface abstract method
    Circle(double radius) {
        this.radius = radius;
    }
    
    public void draw() {
        System.out.println("Drawing a circle.");
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
}
//Driver class
public class Data_Abstraction_With_Interface  {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        myCircle.draw();  // Outputs: Drawing a circle.
        System.out.println("Area: " + myCircle.area());  // Outputs: Area: 78.54
    }
}

