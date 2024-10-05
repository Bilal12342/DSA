 class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
        this.next = null;
        this.data=data;
    }
 }
 public class GenericLinklist<T> {
     Node<T> head=null;

    public void incert(T data ){
        Node<T> newnode=new Node<T>(data);
        if(head==null){

            head =newnode;
        }
        else{
              Node<T> temp=head;
             while (temp.next!=null) {
               temp =temp.next;
                
             }
             temp.next=newnode;
        }

    } 
        public void print (){
      
            if(head==null){
    
                System.out.println("List is empty");
            }
          else {
            Node<T> temp=head;
            while (temp!=null) {
               System.out.print(temp.data+"-->");
                 temp = temp.next;
            }
            System.out.println("Null");
          }

        }
        public void delete(T data) {
            if (head == null) {
                System.out.println("empty list");
                return; 
            }
            if (head.data.equals(data)) {
                head = head.next; 
                return;
            }
          else {
                System.out.println("Data not found in the list.");
            }
        }
             public static void main(String[] args) {
            GenericLinklist<Integer> l=new GenericLinklist<>();
            GenericLinklist<String> l2=new GenericLinklist<>();
            l.incert(32);
            l.incert(33);
            l.incert(34);
            l.incert(35);
            l.print();
            l2.incert("Bilal");
            l2.print();
            l.delete(32);
            l.print();

          
        }
     
 }
