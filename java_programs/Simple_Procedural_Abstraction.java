package java_programs;
//This program is used to demonstrate that how the procedural abstraction is happening with simple example.
//creating the class
class PA_Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
}
//Driver class
public class Simple_Procedural_Abstraction  {
//	creating the main method
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        Calling the methods
        int sum = calculator.add(5, 3);          // Outputs: 8
        int difference = calculator.subtract(10, 4); // Outputs: 6
        int product = calculator.multiply(7, 2);  // Outputs: 14
//        printing the values
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}


