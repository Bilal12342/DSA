class Stack {

    private int[] arr;
    private int tos;
   
    public Stack(int size){
        arr = new int[size];
        tos = -1;
    }

    public void push(int data){
        if(tos == -1 || tos < arr.length){
            arr[++tos] = data;
        }
    }

    public int pop(){
        if(tos != -1 ){
            return arr[tos--]; 
        }else{
            return -1;
        }
    }

    public boolean isEmpty(){
        return tos == -1;
    }
}

class QueueFromStacks{
    private Stack s1, s2;
    
    QueueFromStacks(int size){
        s1 = new Stack(size);
        s2 = new Stack(size);
    }

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

}

public class Task5 {
    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};

        QueueFromStacks queue = new QueueFromStacks(5);
        for (int i : keys) {
            queue.enqueue(i);
        }

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
    }
}