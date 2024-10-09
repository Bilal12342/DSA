
    public class LinkedListRecursive {
        public static void printRecursive(Node head) {
            if (head == null) {
                return;
            }
            System.out.print(head.data + " ");
            printRecursive(head.next);
        }
    }
    

