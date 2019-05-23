/**
 * CustomList class
 */
public class CustomList implements IList {
    Node head;
    Node tail;

    /**
     * Method to add node
     *
     * @param index, it is the int index
     * @param value, it is the T generic value
     */
    @Override
    public void add(int index, Object value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        if (index == 0) {
            this.addFirst(value);
        } else {
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next.previous = newNode;
            newNode.previous = currentNode;
            currentNode.next = newNode;
        }
    }

    /**
     * Method to addFirst node
     *
     * @param value, it is the value to be added at first
     */
    @Override
    public void addFirst(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * Method to addLast node
     *
     * @param value, it is the value to be added at last
     */
    @Override
    public void addLast(Object value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    /**
     * Method to remove node
     *
     * @param index, it removes the head node
     */
    @Override
    public void remove(int index) {
        Node currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }

        currentNode.next = currentNode.next.next;
        currentNode.next.next.previous = currentNode;
    }

    /**
     * Method to removeFirst node
     */
    @Override
    public void removeFirst() {
        head = head.next;
        head.previous = null;
    }

    /**
     * Method to removeLast node
     */
    @Override
    public void removeLast() {
        tail = tail.previous;
        tail.next = null;
    }

    /**
     * Print the values method
     */
    @Override
    public void printList() {
        Node currentNode = head;
        while (true) {
            System.out.println(currentNode.value);
            if (currentNode.next == null) {
                break;
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * Method to getIndex node
     *
     * @param index, it is the index
     * @return
     */
    @Override
    public Node getIndex(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}
