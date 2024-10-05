class Node {
    String name;
    Node next, prev;
    
    public Node(String name){
        this.name = name;
        next = null;
        prev = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtBeginning(String name){
        Node node = new Node(name);
        if(head == null) {
            head = node;
        } else {
           node.next = head;
           head.prev = node;
           head = node;
        }
    }

    public void insertAtBeginning(Node node){
        if(head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }


    public void insertAtEnd(String name){
        Node node = new Node(name);
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }

    public void insertAtEnd(Node node){
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }


    public void insertAfterName(String name, Node node){
        Node nNode = new Node(name);
        if(head == null) {
            head = nNode;
            head.next = node;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = nNode;
            nNode.next = node;
            node.prev = nNode;
            nNode.prev = temp;

        }
    }

    public void insertBeforeName(String name, Node node){
        Node nNode = new Node(name);
        if(head == null) {
            head = node;
            head.next = nNode;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.next = nNode;
            nNode.prev = node;
            node.prev = temp;

        }
    }


    public void makeCircular(){
        if(head == null)
            System.out.println("List Empty!");
        else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = head;
            head.prev = temp;
        }
    }

    public void printList(){
        if(head != null){
            System.out.print(head.name + "  ");
            Node temp = head.next;
            while(temp != null) {
                System.out.print(temp.name + "  ");
                temp = temp.next;
                if(temp == head)
                    break;
            }
        }
    }
}

public class Task1 {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAtEnd("Node-11");
        ll.insertAtEnd("Node-12");
        
        Node node1 = new Node("Node-13");
        Node node2 = new Node("Node-14");

        ll.insertAtEnd(node1);
        ll.insertAtEnd(node2);

        ll.insertAtBeginning("Node-10");
        Node node3 = new Node("Node-9");
        ll.insertAtBeginning(node3);

        Node node4 = new Node("Node-16");
        ll.insertAfterName("Node-15", node4);


        Node node5 = new Node("Node-17");
        ll.insertBeforeName("Node-18", node5);

        
        ll.makeCircular();
        ll.printList();

    }
}