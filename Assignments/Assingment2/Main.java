class GenericLinkedList <T> {
    class Node <T> {
        T data;
        Node<T> next, prev;
        public Node(T data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    Node<T> head, tail;
    int size;

    public void add(T data) {
        Node<T> node = new Node<>(data);

        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);

        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void remove() {
        if(isEmpty()) {
            System.out.println("List Empty!");
        }  else if (head == tail) {
            head = null;
            tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public void removeFirst() {
        if(isEmpty()) {
            System.out.println("List Empty!");
        } else if (head == tail) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void printList() {
        if(isEmpty()) {
            System.out.println("List Empty!");
        } else {
            Node<T> temp = head;
            
            while(temp != null) {
                System.out.print(temp.data );
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public int getLength() { return size;}

    public boolean isEmpty(){ return head == null;}
}



public class Main {
    public static void main(String[] args) {

        GenericLinkedList<Character> ll = new GenericLinkedList<>();

        ll.add('a');
        ll.add('b');
        ll.addFirst('@');
        ll.add('c');
        ll.add('d');

        System.out.println("Length: " + ll.getLength());

        System.out.println("List Printed");
        ll.printList();

        ll.remove();

        System.out.println("Removed Last");
        ll.printList();

        ll.removeFirst();

        System.out.println("Removed First");
        ll.printList();

        System.out.println("Length: " + ll.getLength());

    }
}