/**
 * It is the node class
 */
public class Node<T> {
    Node next;
    Node previous;
    T value;

    /**
     * It is the Constructor class
     *
     * @param value, it is the generic data type value
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
