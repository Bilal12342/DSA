class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ll {
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
    public int nthFromLast(int n) {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node first = head;
        Node second = head;
        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("list is shoter than" + n + " nodes");
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }
    public static void main(String[] args) {
        ll l = new ll();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        int n = 2;
        int result = l.nthFromLast(n);
        if (result != -1) {
            System.out.println("The " + n + "th node from the end contains: "+result);
        }
    }
}

