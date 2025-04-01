
/*Imagine you are one of the programmers responsible for building a sales app for a specific company X that sells wholesale. One of the sales strategies of this company X is to give higher discounts based on the purchase price, according to the list below:

If the purchase price is less than 2500, the discount will be 0%;
If the purchase price is greater than or equal to 2500 but less than 6000, the discount will be 4%;
If the purchase price is greater than or equal to 6000 but less than 10000, the discount will be 7%;
If the purchase price is greater than or equal to 10000, the discount will be 11%.*/

package store;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Evany Store! \n\nFor purchases above 2,500 and up to 6,000, you get a 4% discount. \nFor purchases above 6,000 and up to 10,000, you get a 7% discount. \nFor purchases above 10,000, you get a 11% discount. \n");
        System.out.println("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt();
        
        double total = unitPrice*quantity;
        
        if (total > 2500 && total <= 6000) {
            System.out.printf("Purchase total: %.2f\n", total);
           System.out.println(String.format("Purchase total with a 4%% discount: %.2f", (total - (total * 0.04))) + "\nThank you for choosing us!");
        } else if (total > 6000 && total <= 10000) {
            System.out.printf("Purchase total: %.2f\n", total);
            System.out.println(String.format("Purchase total with a 7%% discount: %.2f", (total - (total * 0.07))) + "\nThank you for choosing us!");
        } else if (total > 10000) {
            System.out.printf("Purchase total: %.2f\n", total);
            System.out.println(String.format("Purchase total with a 11%% discount: %.2f", (total - (total * 0.11))) + "\nThank you for choosing us!");
        } else {
           System.out.println(String.format("Purchase total: %.2f", total) + "\nThank you for choosing us!");

        }
        scanner.close();
    }
}
