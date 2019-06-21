package custom_tree;

/**
 * CustomTree class
 */
public class CustomTree {

    Node root;

    /**
     * Method to add value to custom tree
     * @param value, is the value
     */
    public void add(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            this.root = newNode;
        } else {
            this.addNode(newNode, this.root);
        }
    }

    /**
     * Method to add Node for custom tree
     * @param newNode, is the new node
     * @param customRoot, is the custom root
     */
    public void addNode(Node newNode, Node customRoot) {
        Node currentNode = customRoot;
        if (newNode.value <= customRoot.value) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                this.addNode(newNode, currentNode.left);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                this.addNode(newNode, currentNode.right);
            }
        }
    }
}
