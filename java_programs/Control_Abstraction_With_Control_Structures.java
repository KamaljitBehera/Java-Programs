package java_programs;
//This program is used to demonstrate hoew the control abstraction work with the control structures like loops .
public class Control_Abstraction_With_Control_Structures {
    public static void main(String[] args) {
//    	creating an array
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        
        // Using a for loop to sum the elements of the array
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of array elements: " + sum);  // Outputs: Sum of array elements: 15
    }
}

