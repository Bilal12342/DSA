public class Binnarytree {
    Node root;
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public boolean balanceTree(Node root) {
        return checkHeight(root) != -1;
    }
    private int checkHeight(Node node) {
        if (node == null) {
            return 0; 
        }
        int leftHeight = checkHeight(node.left);
        int rightHeight = checkHeight(node.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1; 
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        Binnarytree tree = new Binnarytree();

        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        tree.root.right.right = new Node(20);

        System.out.println("Is the tree balanced? " + tree.balanceTree(tree.root)); 
        tree.root.left.left.left = new Node(1);
        System.out.println("Is the tree balanced? " + tree.balanceTree(tree.root));
    }
}
