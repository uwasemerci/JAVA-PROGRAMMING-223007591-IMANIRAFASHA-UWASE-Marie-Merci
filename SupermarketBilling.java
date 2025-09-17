
package quickapp;

import java.util.Scanner;

public class SupermarketBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask cashier how many items the customer bought
        System.out.print("Enter number of different items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Arrays to store item details
        String[] itemNames = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        double[] subtotals = new double[n];

        double grandTotal = 0;

        // Input details for each item
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");

            System.out.print("Item name: ");
            itemNames[i] = sc.nextLine();

            System.out.print("Price per unit: ");
            prices[i] = sc.nextDouble();

            System.out.print("Quantity: ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); // consume newline

            // Calculate subtotal for this item
            subtotals[i] = prices[i] * quantities[i];
            grandTotal += subtotals[i];
        }

        // Apply discount if applicable
        double discount = 0;
        if (grandTotal > 50000) {
            discount = grandTotal * 0.05; // 5% discount
        }
        double finalAmount = grandTotal - discount;

        // Print receipt
        System.out.println("\n========== SUPERMARKET RECEIPT ==========");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Subtotal");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", 
                itemNames[i], quantities[i], prices[i], subtotals[i]);
        }
        System.out.println("-----------------------------------------");
        System.out.printf("Grand Total: %.2f\n", grandTotal);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Amount Payable: %.2f\n", finalAmount);
        System.out.println("=========================================");

        sc.close();
    }
}