package java_programs;
//This Program is used to demonstrate how thw control abstraction work with the help of funtion.
class Calculator {
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
public class Control_Abstraction_With_Function{
    public static void main(String[] args) {
//    	creating the calculator class object
        Calculator calculator = new Calculator();
//      Calling the method present in the calculator class with required argument.
        int sum = calculator.add(5, 3);          // Outputs: 8
        int difference = calculator.subtract(10, 4); // Outputs: 6
        int product = calculator.multiply(7, 2);  // Outputs: 14
//      Printing the return value
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}
