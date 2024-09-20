

class LinkedList_Queue {
    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node front, rear;

    public LinkedList_Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node node = new Node(data);

        if(isEmpty()){
            front = node;
            rear = node;
        }else{
            rear.next = node;
            rear = node;
        }
    }

    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue Empty!");
            return -1;
        } else {
            int data = front.data;
            front = front.next;
            return data;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Empty!");
            return -1;
        }else{
            return front.data;
        }
    }

    public boolean isEmpty(){
        return front == null;
    }

}


public class Task4 {
    public static void main(String[] args) {
        
        LinkedList_Queue queue = new LinkedList_Queue();

        System.out.println("Inserting 1");
        queue.enqueue(1);

        System.out.println("Inserting 2");
        queue.enqueue(2);

        System.out.println("Inserting 3");
        queue.enqueue(3);

        System.out.println("Inserting 4");
        queue.enqueue(4);

        System.out.println("Front Element is: " + queue.peek());

        System.out.println("Removing 1");
        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Removing 2");
        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Removing 3");
        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Removing 4");
        System.out.println("Removed: " + queue.dequeue());


        System.out.println("Queue Empty: " + queue.isEmpty());
    }
}
