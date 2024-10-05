class Queue {
    int[] arr;
    int front, rear, size;

    Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = 0;
        size = 0;
    }

    void enqueue(int data) {
        arr[rear] = data;
        rear = (rear + 1) % arr.length;
        size++;
    }

    int dequeue() {
        int data = arr[front];
        front = (front + 1) % arr.length;
        return data;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == arr.length;
    }
}

class StackUsingQueue {
    private Queue q1, q2;

    StackUsingQueue(int size) {
        q1 = new Queue(size);
        q2 = new Queue(size);
    }

    public void push(int data) {
        q2.enqueue(data);
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }
        Queue temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.dequeue();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}


public class Task6 {
    public static void main(String[] args) {

        StackUsingQueue stack = new StackUsingQueue(5);        
        
        int[] keys = {1, 2, 3, 4, 5};

        for (int i : keys) {
            stack.push(i);
        }

        System.out.println(stack.pop());
    
    }
}
