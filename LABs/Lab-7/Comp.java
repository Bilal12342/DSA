public class Comp {
        public static void main(String[] args) {
            int n = 20;  
    
            long startTimeIterative = System.nanoTime();
            long iterativeResult = Factorialiterative.factorialIterative(n);
            long endTimeIterative = System.nanoTime();
            long durationIterative = endTimeIterative - startTimeIterative;
            long startTimeRecursive = System.nanoTime();
            long recursiveResult = FactorialRecursive.factorialRecursive(n);
            long endTimeRecursive = System.nanoTime();
            long durationRecursive = endTimeRecursive - startTimeRecursive;
    
            System.out.println("Factorial of " + n + " (Iterative): " + iterativeResult);
            System.out.println("Time taken by iterative approach: " + durationIterative + " nanoseconds");
    
            System.out.println("Factorial of " + n + " (Recursive): " + recursiveResult);
            System.out.println("Time taken by recursive approach: " + durationRecursive + " nanoseconds");
            if (durationIterative < durationRecursive) {
                System.out.println("Iterative approach is faster.");
            } else if (durationRecursive < durationIterative) {
                System.out.println("Recursive approach is faster.");
            } else {
                System.out.println("Both approaches took the same amount of time.");
            }
        }
    }
    

