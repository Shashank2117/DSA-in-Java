// Calculate Power: Write a Java program to calculate the value of a^b, where a and b are integers.

import java.util.Scanner;
public class Loops4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating Power ");

        System.out.println("Enter 1st Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();

        pow(num1, num2);
    }

    static void pow(int a, int b){
        System.out.println(Math.pow(a,b));
    }
}
