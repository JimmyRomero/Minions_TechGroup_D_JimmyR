/**
 * It is the stack class
 * @param <T>, it is the generic value
 */
public class CustomStack<T> {
    CustomList<T> customStack;

    /**
     * It is the constructor
     */
    public CustomStack() {
        this.customStack = new CustomList<>();
    }

    /**
     * Method to push-add value
     *
     * @param value, it is the node value
     */
    public void push(T value) {
        this.customStack.addLast(value);
    }

    /**
     * Method to pop-remove value
     *
     * @return the removed node
     */
    public Node pop() {
        Node removedValue = this.customStack.getFirst();
        this.customStack.removeLast();
        return removedValue;
    }

    /**
     * Method to get the first element
     *
     * @return the first node
     */
    public Node peek() {
        return this.customStack.getLast();
    }
}
