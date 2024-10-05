import java.util.Scanner;
   class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
          }}
    class linklist{
        Node head=null;
        public void insert(int data){
        Node newnode = new Node(data);
          if(head==null){
         head=newnode;
            }
          else {
            Node temp=head;
            while (temp.next!=null) {
                 temp=temp.next;
            }
            temp.next=newnode;
            }
            }

    public void assendingBublesort(){

        if (head == null) {
            return;
        }
        boolean swapped;
        Node last = null;
        do {
            swapped = false;
          Node  current = head;

            while (current.next != last) {
           
                if (current.data > current.next.data) {
                   
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current; 
        } while (swapped);
    }
    
    public void disassendingBublesort(){

        if (head == null) {
            return;
        }
        boolean swapped;
        Node last = null;
        do {
            swapped = false;
          Node  current = head;

            while (current.next != last) {
           
                if (current.data < current.next.data) {
                   
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current; 
        } while (swapped);
    }
    public void print(){

         if(head==null){
            System.out.println("List is empty");
        }
             else {
               Node temp=head;
               while (temp!=null) {
                System.out.print(temp.data+" ");
                    temp=temp.next;
            }
            System.out.println("Null");
        }
    }
}
public class Bubblesortinlinklist {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        linklist list = new linklist();

        System.out.println("Enter the number of elements in the linked list:");
        int n = sr.nextInt();

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            list.insert(sr.nextInt());
        }

        System.out.println("Original Linked List:");
        list.print();
        list.assendingBublesort();

        System.out.println("Assending Sorted Linked List:");
        list.print();

        list.disassendingBublesort();

        System.out.println("Disassending Sorted Linked List:");
        list.print();
        sr.close(); 
    }
}
    

    

