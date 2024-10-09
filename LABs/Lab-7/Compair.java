
import java.util.Scanner;

class FibonacciIterative {
    public static void generateFibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (Iterative): " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class FibonacciRecursive {
    public static void generateFibonacciRecursive(int n) {
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

public class Compair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of terms in Fibonacci series to generate: ");
        int n = scanner.nextInt();

     
        long startTimeIterative = System.nanoTime();
        FibonacciIterative.generateFibonacciIterative(n);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;

       
        long startTimeRecursive = System.nanoTime();
        FibonacciRecursive.generateFibonacciRecursive(n);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

        
        System.out.println("Time taken by iterative approach: " + durationIterative + " nanoseconds");
        System.out.println("Time taken by recursive approach: " + durationRecursive + " nanoseconds");

     
        if (durationIterative < durationRecursive) {
            System.out.println("Iterative approach is faster.");
        } else if (durationRecursive < durationIterative) {
            System.out.println("Recursive approach is faster.");
        } else {
            System.out.println("Both approaches took the same amount of time.");
        }

        scanner.close();
    }
}

