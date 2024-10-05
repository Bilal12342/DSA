class Stack {
    
    private int[] arr;
    private int tos;
    private int capacity;

    public Stack(int size){
        capacity = 0;
        arr = new int[size];
        tos = -1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full!");
        }else{
            capacity++;
            arr[++tos] = data;
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Empty!");
            return -1;
        } else {
            capacity--;
            return arr[tos--];
        }
    }

    public int top(){
        if(isEmpty()){
            System.out.println("Stack Empty!");
            return -1;
        } else {
            return arr[tos];
        }
    }
    
    public int size(){
        return capacity;
    }
    
    public boolean isEmpty(){
        return tos == -1;
    }
    
    public boolean isFull(){
        return (tos+1) == arr.length;
    }
}

public class Task1 {
    public static void main(String[] args) {

        Stack stack = new Stack(3);        
        
        System.out.println("Inserting 1: ");
        stack.push(1);

        System.out.println("Inserting 2: ");
        stack.push(2);
        
        System.out.println("Removing 2: ");
        System.out.println("Poped: " + stack.pop());
        
        System.out.println("Removing 1: ");
        System.out.println("Poped: " + stack.pop());
        
        System.out.println("Inserting 3: ");
        stack.push(3);

        System.out.println("Top Element: " + stack.top());

        System.out.println("Stack Size: " + stack.size());

        System.out.println("Removing 3: ");
        System.out.println("Poped: " + stack.pop());

        System.out.println("Stack is Empty: " + stack.isEmpty());
        
    }
}