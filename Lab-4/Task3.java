class Queue {

    private int[] arr;
    private int front, rear, capacity, count;

    public Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = 0;
        capacity = size;
        count = 0;
    }

    public void enqueue(int data) {
        if(isFull()){
            System.out.println("Queue Full!");
        }else {
            arr[rear] = data;
            rear = (rear + 1) % capacity;
            count++;
        }
    }

    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue Empty!");
            return -1;
        }else{
            count--;
            int data = arr[front];
            front = (front + 1) % capacity;
            return data;
        }
    }

    public int peek() {
        if(!isEmpty()){
            return arr[front];
        }else{
            return -1;
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}


public class Task3 {
    public static void main(String[] args) {

        Queue queue = new Queue(5);

        System.out.println("Inserting 1");
        queue.enqueue(1);

        System.out.println("Inserting 2");
        queue.enqueue(2);

        System.out.println("Inserting 3");
        queue.enqueue(3);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removing 1");
        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Queue Size: " + queue.size());

        System.out.println("Removing 2");
        System.out.println("Removed: " + queue.dequeue());

        System.out.println("Removing 3");
        System.out.println("Removed: " + queue.dequeue());
    
        System.out.println("Queue Empty: " + queue.isEmpty());
    }
}
