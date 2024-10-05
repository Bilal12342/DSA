class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class DoublyLinkedList{
    Node head, tail;
    int size;

    public void add(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            tail = node; 
        }else{
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }
    
    public void addFirst(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            tail = node; 
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void printList(){
        if(isEmpty()){
            System.out.println("List is Empty!");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("List Empty!");
        }else if(head.next == null){
            head = null;
            tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List Empty!");
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }
}

public class Task2B {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(10);
        dll.add(11);
        dll.add(12);
        dll.add(13);
        dll.add(14);
        dll.add(15);
    
        dll.addFirst(9);
        dll.addFirst(8);
        
        dll.delete();
        dll.deleteFirst();
        
        System.out.println("Size: " + dll.getSize());
        dll.printList();

    }
}
