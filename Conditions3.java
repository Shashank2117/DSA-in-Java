// 3.	Shop Discount Calculator: Create a Java program to calculate the total cost of items purchased at a shop.
//      Prompt the user to input the number of items and the total price. Determine the discount according to the following conditions:
// •	If the total price is greater than $100 and the number of items is 5 or more, apply a 10% discount.
// •	If the total price is between $50 and $100, apply a 5% discount.
// •	Otherwise, no discount is applied.

import java.util.Scanner;
public class Conditions3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Shop Discount Calculator");

        System.out.println();

        System.out.println("Enter Number of Items Purchased : ");
        int items = sc.nextInt();

        System.out.println();

        System.out.println("Enter Total Price of Items ($): ");
        int price = sc.nextInt();

        System.out.println();

        // int discount;
        // int totalPrice;

        if (price < 50) {
            System.out.println("No Discount is Applied ");

        }else if (price >= 50 && price < 100) {
            int discount = price * 5/100;
            int totalPrice = price - discount;
            System.out.println("Total price after 5% discount :  " + totalPrice);

        }else if (price >= 100 && items >= 5) {
            int discount = price * 10/100;
            int totalPrice = price - discount;
            System.out.println("Total price after 10% discount :  " + totalPrice);

        }else if (price >= 100 && items < 5) {
            int discount = price * 7/100;
            int totalPrice = price - discount;
            System.out.println("Total price after 7% discount :  " + totalPrice);

        }else{
            System.out.println("Invalid Pricing or Number of Items ");
        }

    }
}
