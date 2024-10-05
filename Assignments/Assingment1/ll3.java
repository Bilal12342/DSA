class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ll3 {
    Node head = null;
    public void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void reverse() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;       
            current = next;       
        }
        head = prev; 
    }
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        ll3  l = new ll3();
        l.add(50);
        l.add(40);
        l.add(30);
        l.add(20);
        l.add(10);

        System.out.println("Original List:");
        l.print();

        l.reverse();

        System.out.println("Reversed List:");
        l.print();
    }
}
