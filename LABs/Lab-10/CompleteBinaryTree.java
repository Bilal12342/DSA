  import java.util.LinkedList;
  import java.util.Queue;
    class Node {
        int value;
        Node left, right;
    
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    
    class CompleteBinaryTree {
        Node root;
    
        public CompleteBinaryTree() {
            this.root = null;
        }
        public void insert(int value) {
            Node newNode = new Node(value);
    
            if (root == null) {
                root = newNode;
                return;
            }
    
           Queue<Node> queue = new  LinkedList<>();
            queue.add(root);
    
            while (!queue.isEmpty()) {
                Node current = queue.poll();
    
           
                if (current.left == null) {
                    current.left = newNode;
                    return;
                } else {
                    queue.add(current.left);
                }
    
                if (current.right == null) {
                    current.right = newNode;
                    return;
                } else {
                    queue.add(current.right);
                }
            }
        }
    
        public void levelOrderTraversal() {
            if (root == null) {
                System.out.println("Tree is empty");
                return;
            }
    
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
    
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                System.out.print(current.value + " ");
    
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            CompleteBinaryTree tree = new CompleteBinaryTree();
    
          
            tree.insert(1);
            tree.insert(2);
            tree.insert(3);
            tree.insert(4);
            tree.insert(5);
            tree.insert(6);
    
            System.out.println("Level-order traversal of the tree:");
            tree.levelOrderTraversal();
        }
    }
    

