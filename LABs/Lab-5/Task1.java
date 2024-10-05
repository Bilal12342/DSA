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
    int size;

    public void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("List Empty!");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List Empty!");
        } else {
            head = head.next;
            size--;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}

public class Task1 {
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("Before Reversing");
        list1.printList();

        System.out.println();
        System.out.println("After Reversing");
        printReverse(list1);
    }

    private static void printReverse(LinkedList list1) {

        if (list1.head == null) {
            System.out.println("null");
        }

        LinkedList list2 = new LinkedList();
        
        Node temp = list1.head;

        while (temp != null) {
            list2.addFirst(temp.data);
            temp = temp.next;
        }

        temp = list2.head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
