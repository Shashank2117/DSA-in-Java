// 5.	Shipping Cost Calculator: Create a Java program to calculate the shipping cost for an online purchase.
//      Prompt the user to input the weight of the package and the distance to be shipped. 
//      Determine the shipping cost according to the following rules:
// •	If the weight is less than or equal to 10 pounds and the distance is less than or equal to 100 miles, the cost is $5.
// •	If the weight is between 10 and 20 pounds, or the distance is between 100 and 500 miles, the cost is $10.
// •	Otherwise, the cost is $20.

import java.util.Scanner;
public class Conditions5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Shipping Cost Calculator ");

        System.out.println();

        System.out.print("Enter Weight of Parcel (Pounds) : ");
        int weight = sc.nextInt();

        System.out.println();

        System.out.print("Enter Distance of Shipment (MIles) : ");
        int distance = sc.nextInt();

        System.out.println();

        if (weight <= 10 && distance <= 100) {
            System.out.println("Cost of Shipment is $5");
        }else if (weight > 10 && weight <= 20) {
            System.out.println("Cost of Shipment is $10");
        }else if (distance > 100 && distance <= 500){
            System.out.println("Cost of Shipment is $10");
        }else{
            System.out.println("Cost is $20");
        }
    }
}
