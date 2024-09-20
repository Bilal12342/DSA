class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(Node next){
        this.next = null;
    }
}

class LinkedListDummy {
    Node head;
    int size;
 
    public LinkedListDummy() {
        head = new Node(null);
        size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = newNode;
        size++;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head.next;
        head.next = node;
        size++;
    }

    public void printList(){
        Node node = head.next;
        while(node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data + " ");

    }
}

public class DummyList {
    public static void main(String[] args) {
        LinkedListDummy ld = new LinkedListDummy();
        ld.add(0);
        ld.add(1);
        ld.add(2);
        ld.add(3);

        ld.printList();
    }
}
