import java.util.Random;
import java.util.Scanner;

public class Searchcompa {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1000];  
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);  
        }
        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();
        long startTimeIterative = System.nanoTime();
        int iterativeResult = Itreativeserch.iterativeSearch(arr, searchValue);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;
        long startTimeRecursive = System.nanoTime();
        int recursiveResult = Recursiveserch.recursiveSearch(arr, searchValue, 0);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

   
        System.out.println("Iterative Search Result: " + iterativeResult);
        System.out.println("Recursive Search Result: " + recursiveResult);
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


