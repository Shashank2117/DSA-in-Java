// Print Fibonacci Series: Write a Java program to print the Fibonacci series up to a specified number of terms n.

public class Loops5 {
    public static void main(String[] args) {
    int n = 8; // Number of terms to print
    printFibonacci(n);
}

public static void printFibonacci(int n) {
    int a = 0;
    int b = 1;
    int c;

    System.out.print("Fibonacci Series: ");

    for (int i = 0; i < n; i++) {
        System.out.print(a + " ");
        c = a + b;
        a = b;
        b = c;
    }
    System.out.println(); //newline for clean output.
}
    
}

