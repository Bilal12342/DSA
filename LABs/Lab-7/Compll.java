public class Compll {
        public static void main(String[] args) {
           
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
    
           
            long startTimeIterative = System.nanoTime();
            Linklist.printIterative(head);
            long endTimeIterative = System.nanoTime();
            long durationIterative = endTimeIterative - startTimeIterative;
    
            long startTimeRecursive = System.nanoTime();
            LinkedListRecursive.printRecursive(head);
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
        }
    }
    

