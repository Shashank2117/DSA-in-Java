// 1.	Library Late Fees: Write a Java program to calculate the late fees for returning library books. 
//      Prompt the user to input the number of days overdue and the type of book (regular, fiction, or reference).
//      Determine the late fee according to the following rules:
// •	For regular books: $0.50 per day
// •	For fiction books: $0.75 per day
// •	For reference books: No late fee

import java.util.Scanner;

public class Conditions{
    public static void main(String[] args) {
        System.out.println("Calculating Late Fes for Books __");
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter type of book (regular, fiction, or reference) ");
        String bookType = sc.nextLine();

        System.out.println();

        System.out.println("Number of day Overdue ");
        int days = sc.nextInt();

        System.out.println();

        double amount = 0;

        if(bookType.equalsIgnoreCase("Reference")){

            System.out.println("No Late Fees for reference books.");

        }else if (bookType.equalsIgnoreCase("Regular")) {

            if(days > 0){
                amount = 0.50 * days;
                System.out.println(amount + "$ as Late fee for Regular Boos");
            }
        }else if(bookType.equalsIgnoreCase("Fiction")){

            if(days > 0){
                amount = 0.75 * days;
                System.out.println(amount + "$ as Late fee for Fiction Books");
            }
        }else{
            System.out.println("Invalid Type of Book.");
        }
        
    }
}
