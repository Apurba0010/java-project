import java.util.Scanner;
// Define the Purchase class
public class Purchase {
    // Attributes for the Purchase class
    private int invoiceNumber;
    private double amountOfSale;
    private double amountOfSalesTax;

    // Constructor to initialize a Purchase object
    public Purchase(int invoiceNumber, double amountOfSale, double taxRate) {
        this.invoiceNumber = invoiceNumber;
        this.amountOfSale = amountOfSale;
        this.amountOfSalesTax = calculateSalesTax(amountOfSale, taxRate);
    }

    // Method to calculate the sales tax based on the amount of sale and tax rate
    private double calculateSalesTax(double amountOfSale, double taxRate) {
        return amountOfSale * taxRate / 100;
    }

    // Getter method for invoice number
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    // Setter method for invoice number
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    // Getter method for amount of sale
    public double getAmountOfSale() {
        return amountOfSale;
    }

    // Setter method for amount of sale
    public void setAmountOfSale(double amountOfSale) {
        this.amountOfSale = amountOfSale;
        // Recalculate the sales tax whenever the amount of sale is updated
        this.amountOfSalesTax = calculateSalesTax(amountOfSale, 10); // Assuming a default tax rate of 10%
    }

    // Getter method for amount of sales tax
    public double getAmountOfSalesTax() {
        return amountOfSalesTax;
    }

    // Main method to test the Purchase class
    public static void main(String[] args) {
        // Create a Purchase object
        Purchase purchase = new Purchase(12345, 500.0, 10.0);

        // Display the details of the purchase
        System.out.println("Invoice Number: " + purchase.getInvoiceNumber());
        System.out.println("Amount of Sale: $" + purchase.getAmountOfSale());
        System.out.println("Amount of Sales Tax: $" + purchase.getAmountOfSalesTax());

        // Update the amount of sale
        purchase.setAmountOfSale(600.0);

        // Display the updated details of the purchase
        System.out.println("Updated Amount of Sale: $" + purchase.getAmountOfSale());
        System.out.println("Updated Amount of Sales Tax: $" + purchase.getAmountOfSalesTax());
    }
}
