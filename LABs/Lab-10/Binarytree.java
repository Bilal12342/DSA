class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class Binarytree {
    Node root;

    public Binarytree() {
        this.root = null;
    }
    public void preorderTraversal(Node node) {
        if (node == null) return;

        System.out.print(node.value + " "); 
        preorderTraversal(node.left);      
        preorderTraversal(node.right);    
    }
    public void inorderTraversal(Node node) {
        if (node == null) return;

        inorderTraversal(node.left);       
        System.out.print(node.value + " "); 
        inorderTraversal(node.right);      
    }

    public void postorderTraversal(Node node) {
        if (node == null) return;

        postorderTraversal(node.left);    
        postorderTraversal(node.right);    
        System.out.print(node.value + " "); 
    }

   
    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
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

    public static void main(String[] args) {
        Binarytree tree = new Binarytree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);

        System.out.println("Preorder Traversal:");
        tree.preorderTraversal(tree.root); 
        System.out.println("\nInorder Traversal:");
        tree.inorderTraversal(tree.root); 
        System.out.println("\nPostorder Traversal:");
        tree.postorderTraversal(tree.root); 
    }
}
