public class Stack {
    int[] arr;
    int numelement = 0;
    int size;

    // Constructor to initialize the stack with a specific size
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int data) {
        if (numelement < size) {  // Ensure the stack is not full
            arr[numelement++] = data;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {  // Corrected method name
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;  // Error value
        }
        return arr[--numelement];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;  // Error value
        }
        return arr[numelement - 1];
    }

    public boolean isEmpty() {
        return numelement == 0;  // Check if the stack is empty
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for(int i =0;i <=numelement;i++){
            System.out.println(arr[i]);
        }
    }
    }
    public static void main(String[] args) {
        Stack s = new Stack(2);  // Initialize stack with size 5

        s.push(4);
        s.push(5);
        s.push(6);
        s.pop();

        s.top();
        s.print();  // Should print 6 (top element)
    }}