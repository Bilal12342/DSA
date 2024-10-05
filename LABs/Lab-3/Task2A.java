class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class SinglyLinkedList{
    Node head, tail;
    int size;

    public void add(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            tail = node; 
        }else{
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
        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List Empty!");
        }else{
            head = head.next;
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

public class Task2A {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(10);
        sll.add(11);
        sll.add(12);
        sll.add(13);
        sll.add(14);
        sll.add(15);
    
        sll.addFirst(9);
        sll.addFirst(8);

        sll.delete();
        sll.deleteFirst();

        System.out.println("Size: " + sll.getSize());
        sll.printList();

    }
}
