import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomStackTest {

    private CustomStack<Object> customQueue;

    /**
     * Initialize the object list
     */
    @Before
    public void init() {
        customQueue = new CustomStack<Object>();
    }

    /**
     * Test for push method
     */
    @Test
    public void push() {
        customQueue.push("T");
        customQueue.push("e");
        customQueue.push("s");
        customQueue.push("t");
        assertEquals(customQueue.peek().value, "t");
    }

    /**
     * Test for pop method
     */
    @Test
    public void pop() {
        customQueue.push("T");
        customQueue.push("e");
        customQueue.push("s");
        customQueue.push("t");
        assertEquals(customQueue.pop().value, "T");
    }

    /**
     * Test for peek method
     */
    @Test
    public void peek() {
        customQueue.push("T");
        customQueue.push("e");
        customQueue.push("s");
        customQueue.push("t");
        assertEquals(customQueue.peek().value, "t");
        customQueue.pop();
        assertEquals(customQueue.peek().value, "s");
        customQueue.pop();
        assertEquals(customQueue.peek().value, "e");
    }
}
