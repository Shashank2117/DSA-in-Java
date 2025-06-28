// 4.  Mobile Plan Selector: Write a Java program to help users select a suitable mobile plan based on their usage. 
//     Prompt the user to input the number of minutes used and the number of text messages sent in a month. 
//     Determine the plan according to the following rules:
// •    Plan A: $25 per month for up to 100 minutes and 100 messages. Additional usage is charged at $0.10 per minute and $0.05 per message.
// •	Plan B: $40 per month for up to 200 minutes and 200 messages. Additional usage is charged at $0.08 per minute and $0.03 per message.
// •	Plan C: $60 per month for unlimited minutes and messages.

import java.util.Scanner;

public class Conditions4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of minutes used in a month: ");
        int minutesUsed = scanner.nextInt();

        System.out.print("Enter the number of text messages sent in a month: ");
        int messagesUsed = scanner.nextInt();

        // Plan A calculations
        double planACost = 25.0;
        if (minutesUsed > 100) {
            planACost += (minutesUsed - 100) * 0.10;
        }
        if (messagesUsed > 100) {
            planACost += (messagesUsed - 100) * 0.05;
        }

        // Plan B calculations
        double planBCost = 40.0;
        if (minutesUsed > 200) {
            planBCost += (minutesUsed - 200) * 0.08;
        }
        if (messagesUsed > 200) {
            planBCost += (messagesUsed - 200) * 0.03;
        }

        // Plan C is flat
        double planCCost = 60.0;

        // Output total costs
        System.out.printf("Plan A cost: $%.2f\n", planACost);
        System.out.printf("Plan B cost: $%.2f\n", planBCost);
        System.out.printf("Plan C cost: $%.2f\n", planCCost);

        // Determine the cheapest plan
        double minCost = Math.min(planACost, Math.min(planBCost, planCCost));
        String bestPlan = "";

        if (minCost == planACost) {
            bestPlan = "Plan A";
        } else if (minCost == planBCost) {
            bestPlan = "Plan B";
        } else {
            bestPlan = "Plan C";
        }

        // Recommend the cheapest plan
        System.out.println("The most cost-effective plan for your usage is: " + bestPlan);
    }
}
