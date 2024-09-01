package java_programs;

//This program is used to demonstarte that how the procedural abstraction work with multiple methods.
class ShoppingCart {
//	 Procedural abstraction: calculate the total price before tax
	public double calculateTotalBeforeTax(double[] prices) {
		double total = 0;
		for (double price : prices) {
			total += price;
		}
		return total;
	}

//	 Procedural abstraction: calculate the tax amount
	public double calculateTax(double totalBeforeTax, double taxRate) {
		return totalBeforeTax * taxRate;
	}

//	 Procedural abstraction: calculate the final total after tax
	public double calculateTotalAfterTax(double totalBeforeTax, double tax) {
		return totalBeforeTax + tax;
	}
}
//Driver class
public class Procedural_Abstraction_With_Multiple_Methods {
//Creating the main method	
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		double[] prices = { 100.0, 200.0, 300.0 }; // Prices of items
		double taxRate = 0.07; // 7% tax rate

//		 Using the procedures
		double totalBeforeTax = cart.calculateTotalBeforeTax(prices);
		double tax = cart.calculateTax(totalBeforeTax, taxRate);
		double totalAfterTax = cart.calculateTotalAfterTax(totalBeforeTax, tax);
//        printing the value
		System.out.println("Total before tax: $" + totalBeforeTax);
		System.out.println("Tax: $" + tax);
		System.out.println("Total after tax: $" + totalAfterTax);
	}
}
