class BinaryTree {
    Node root;
    BinaryTree(int key) {
        root = new Node(key);
    }
    BinaryTree() {
        root = null;
    }
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public void addNode(int data) {
        root = addNodeRecursive(root, data);
    }
    private Node addNodeRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addNodeRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addNodeRecursive(current.right, data);
        } 
        return current;
    }
    public boolean searchNode(int data) {
        try {
            return searchNodeRecursive(root, data);
        } catch (Exception e) {
            System.out.println("Error occurred while searching: " + e.getMessage());
            return false;
        }
    }
    private boolean searchNodeRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        return data < current.data
                ? searchNodeRecursive(current.left, data)
                : searchNodeRecursive(current.right, data);
    }

    public int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countOfNodes(root.left) + countOfNodes(root.right);
    }
    public int height(Node root) {
        if (root == null) {
            return -1; 
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(15);
        tree.addNode(2);
        tree.addNode(7);
        tree.addNode(12);
        tree.addNode(18);
        System.out.println("Is 7 in the tree? " + tree.searchNode(7)); 
        System.out.println("Is 9 in the tree? " + tree.searchNode(9)); 
        System.out.println("Number of nodes in the tree: " + tree.countOfNodes(tree.root));
        System.out.println("Height of the tree: " + tree.height(tree.root));
    }
}
