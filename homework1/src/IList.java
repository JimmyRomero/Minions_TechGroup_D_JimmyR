/**
 * It is the interface class
 */
public interface IList<T> {

    /**
     * Add node method
     *
     * @param index, it is the int index
     * @param value, it is the T generic value
     */
    void add(int index, T value);

    /**
     * Add first method
     *
     * @param value, it is the value to be added at first
     */
    void addFirst(T value);

    /**
     * Add last method
     *
     * @param value, it is the value to be added at last
     */
    void addLast(T value);

    /**
     * Remove node method
     *
     * @param index, it removes the head node
     */
    void remove(int index);

    /**
     * Remove first node method
     */
    void removeFirst();

    /**
     * Remove last node method
     */
    void removeLast();

    /**
     * Print the values method
     */
    void printList();

    /**
     * It gets the index of specific node
     *
     * @param index, it is the index
     * @return the node value
     */
    Node getIndex(int index);

    /**
     * It gets the first node
     *
     * @return the node value
     */
    Node getFirst();

    /**
     * It gets the last node
     *
     * @return the node value
     */
    Node getLast();
}
