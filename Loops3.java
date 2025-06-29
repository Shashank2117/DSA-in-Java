// Prime Number Checker: Create a Java program to check if a given number is prime or not.

public class Loops3 {

    public static void main(String[] args) {

        int number = 18;
        boolean isPrime = true;

        // Handle edge cases
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    // break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is Not a Prime Number.");
        }
    
    }

}
