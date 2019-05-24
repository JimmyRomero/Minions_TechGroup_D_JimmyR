import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CustomQueueTest {

    private CustomQueue<Object> customQueue;

    /**
     * Initialize the object list
     */
    @Before
    public void init() {
        customQueue = new CustomQueue<>();
    }

    /**
     * Test for add method
     */
    @Test
    public void add() {
        customQueue.add("test");
        assertEquals(customQueue.peek().value, "test");
    }

    /**
     * Test for remove method
     */
    @Test
    public void remove() {
        customQueue.add("This");
        customQueue.add("is");
        customQueue.add("a");
        customQueue.add("test");
        Node removed = customQueue.remove();
        assertEquals(removed.value, "This");
    }

    /**
     * Test for peek method
     */
    @Test
    public void peek() {
        customQueue.add("T");
        customQueue.add("e");
        customQueue.add("s");
        customQueue.add("t");
        assertEquals(customQueue.peek().value, "T");
        customQueue.remove();
        assertEquals(customQueue.peek().value, "e");
        customQueue.remove();
        assertEquals(customQueue.peek().value, "s");
    }
}
