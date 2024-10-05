
public class Stack {
   int[] arr ;      
   int element = 0; 
   public Stack(int size) {
       arr = new int[size];
   }
   public void push(int data) {
       if (isFull()) {
           System.out.println("Cannot push element, stack is full");
       } else {
           arr[element++] = data;
       }
   }
   public int pop() {
       if (isEmpty()) {
           System.out.println("Cannot pop, stack is empty");
           return -1; 
       } else {
           return arr[--element];
       }
   }

   public void print() {
       if (isEmpty()) {
           System.out.println("Stack is empty");
       } else {
           for (int i = 0; i < element; i++) {
               System.out.println(arr[i]);
           }
       }
   }
   public int top(){

       return arr[element-1];
   }
   public boolean isEmpty() {
       return (element == 0);
   }
   public boolean isFull() {
       return (element == arr.length);
   }

   public static void main(String[] args) {
       Stack sk = new Stack(5);
       sk.push(5);
       sk.push(4);
       sk.push(3);
       sk.push(2);
       sk.push(1);
       sk.push(0);
       sk.pop();
       System.out.println("This is top element "+ sk.top());
       sk.print();    
   }
}

