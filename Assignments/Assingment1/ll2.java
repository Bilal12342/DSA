class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ll2{
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
    public void sort() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }
        Node current = head;
        Node next = null;
        Node prev = null;
        Node tail = null;
        boolean swapped;
        do {
            swapped = false;
            current = head;
            prev = null;
            while (current.next != tail) {
                next = current.next;
                if (current.data > next.data) {
                    if (prev != null) {
                        prev.next = next;
                    } else {
                        head = next;
                    }
                    current.next = next.next;
                    next.next = current;

                    swapped = true;
                    prev = next;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
            tail = current;
        } while (swapped);
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
        ll2 l = new ll2();
        l.add(50);
        l.add(40);
        l.add(30);
        l.add(20);
        l.add(10);
        System.out.println("Original List:");
        l.print();
        l.sort();
        System.out.println("Sorted List:");
        l.print();
    }
}

