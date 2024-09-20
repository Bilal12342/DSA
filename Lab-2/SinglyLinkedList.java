class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head, tail;
    int size = 0;

    public boolean searchData(int data) {
        if (head == null)
            System.out.println("List is Empty!");
        else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.data == data)
                    return true;
                temp = temp.next;
            }
        }
        return false;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            tail = tail.next;
            size++;
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    public void removeFirst() {
        if (head == null)
            System.out.println("List is Empty!");
        else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (head == null)
            System.out.println("List is Empty!");
        else {
            Node node = head;
            while (node.next.next != null) {
                node = node.next;
            }
            node.next = null;
            tail = node;
            size--;
        }
    }

    public void printList() {
        Node node = head;

        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }        // Task-2 Length

        System.out.println(node.data);
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}


public class SinglyLinkedList {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        // Task-2 Length
        System.out.println("List Length: " + ll.getSize());
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        
        // Task-1 Seaching
        System.out.println("5 Found? " + ll.searchData(0));
        
        ll.printList();
        // Task-2 Length
        System.out.println("List Length: " + ll.getSize());
    }
}