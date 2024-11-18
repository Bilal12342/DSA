
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    
    public boolean isSubTree(Node x, Node y) {
      
        if (y == null)
         return true;

        if (x == null) 
        return false;

   
        if (areIdentical(x, y))
         return true;

        return isSubTree(x.left, y) || isSubTree(x.right, y);
    }

    private boolean areIdentical(Node a, Node b) {
      
        if (a == null && b == null) 
        return true;

        if (a == null || b == null)
         return false;

       
        return (a.value == b.value) &&
               areIdentical(a.left, b.left) &&
               areIdentical(a.right, b.right);
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
        tree1.root.right.left = new Node(6);
        tree1.root.right.right = new Node(7);
        Tree tree2 = new Tree();
        tree2.root = new Node(3);
        tree2.root.left = new Node(6);
        tree2.root.right = new Node(7);
        boolean result = tree1.isSubTree(tree1.root, tree2.root);
        System.out.println("Is y a subtree of x? " + result); 
    }
}

