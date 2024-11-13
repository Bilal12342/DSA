class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class Findminandmax {
    Node root;
    public Findminandmax() {
        root = null;
    }
    public int Minimumval() {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        return minValue(root);
    }
    private int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            root = root.left;
            minVal = root.data;
        }
        return minVal;
    } 

    public int Maxmumval() {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        return maxmumval(root);
    }
    private int maxmumval(Node root) {
        int maxmumval = root.data;
        while (root.right != null) {
            root = root.right;
           maxmumval = root.data;
        }
        return maxmumval;
    }
    public static void main(String[] args) {
        Findminandmax tree = new Findminandmax();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        tree.root.right.right = new Node(30);
        System.out.println("Minimum value in the tree: " + tree.Minimumval());
        System.out.println("Maximum value in the tree: " + tree.Maxmumval());
    }
}
