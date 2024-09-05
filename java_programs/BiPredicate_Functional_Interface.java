package java_programs;
//Program to understand how to use the bipredicate functional interface and the method that offfers it and how to use them.
import java.util.function.BiPredicate;

public class BiPredicate_Functional_Interface {
//creating the main method
	public static void main(String[] args) {
		// Simple predicate for checking equality 
        BiPredicate<Integer, String> biPredicate = (n, s) -> 
        { 
            if (n == Integer.parseInt(s)) 
                return true; 
            return false; 
        }; 
  
        System.out.println(biPredicate.test(2, "2")); 
  
        // Predicate for checking greater than 
        BiPredicate<Integer, String> biPredicate1 = (n, s) -> 
        { 
            if (n > Integer.parseInt(s)) 
                return true; 
            return false; 
        }; 
     // ANDing the two predicates 
        BiPredicate<Integer, String> biPredicate2 
            = biPredicate.and(biPredicate1); 
        System.out.println(biPredicate2.test(2, "3")); 
        
        
        // ORing the two predicates 
        biPredicate2 = biPredicate.or(biPredicate1); 
        System.out.println(biPredicate2.test(3, "2")); 
  
        // Negating the predicate 
        biPredicate2 = biPredicate.negate(); 
        System.out.println(biPredicate2.test(3, "2")); 
	}
/*	Note:- Similar to the Biprdicate functional interface there have other predefined fuctional interface have
	also there own bifunctional interface as well.
*/
}
