/**
 * It is the Queue class
 *
 * @param <T>, it is the generic value
 */
public class CustomQueue<T> {
    CustomList<T> customQueue;

    /**
     * It is the constructor
     */
    public CustomQueue() {
        this.customQueue = new CustomList<>();
    }

    /**
     * Method to add value
     *
     * @param value, it is the generic value
     */
    public void add(T value) {
        this.customQueue.addLast(value);
    }

    /**
     * Method to remove value
     *
     * @return the removed node
     */
    public Node remove() {
        Node removedValue = this.customQueue.getFirst();
        this.customQueue.removeFirst();
        return removedValue;
    }

    /**
     * Method to get the first element
     *
     * @return the first node
     */
    public Node peek() {
        return this.customQueue.getFirst();
    }
}
