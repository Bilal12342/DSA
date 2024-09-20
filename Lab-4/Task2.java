class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

class Stack {
    private Node top;

    public Stack(){
        top = null;
    }

    public void push(int data) {
        Node node = new Node(data);
        if(isEmpty()) {
            top = node;
        }else{
            node.next = top;
            top = node;
        }
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack Empty!");
            return -1;
        } else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    public boolean isEmpty() { return top == null;}

    public int top() {
        if(isEmpty()){
            System.out.println("Stack Empty!");
            return -1;
        } else {
            return top.data;
        }
    }
}

public class Task2 {
    public static void main(String[] args) {

        Stack stack = new Stack();
        

        System.out.println("Inserting 1");
        stack.push(1);

        System.out.println("Inserting 2");
        stack.push(2);

        System.out.println("Inserting 3");
        stack.push(3);


        System.out.println("Top Element: " + stack.top());

        System.out.println("Removing: " + stack.pop());
        System.out.println("Removing: " + stack.pop());
        System.out.println("Removing: " + stack.pop());

        System.out.println("Stack Empty: " + stack.isEmpty());
    }
}
