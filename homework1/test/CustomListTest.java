import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomListTest {

    private CustomList customList;

    /**
     * Initialize the object list
     */
    @Before
    public void init() {
        customList = new CustomList();
    }

    /**
     * Test for add methods
     */
    @Test
    public void add() {
        customList.addFirst(15);
        customList.addFirst(16);
        customList.addFirst(17);
        customList.addFirst(18);
        customList.add(2, 4);
        customList.add(3, 7);
        customList.add(4, 24);
        customList.add(5, "MEH");
        customList.add(6, true);
        customList.add(7, 66.6);
        customList.addLast(99);

        assertEquals(customList.getIndex(2).value, 4);
        assertEquals(customList.getIndex(4).value, 24);
        assertEquals(customList.getIndex(5).value, "MEH");
        assertEquals(customList.getIndex(6).value, true);
        assertEquals(customList.getIndex(7).value, 66.6);

    }

    /**
     * Test for addFirst method
     */
    @Test
    public void addFirst() {
        customList.addFirst(1);
        assertEquals(customList.head.value, 1);
    }

    /**
     * Test for addLast method
     */
    @Test
    public void addLast() {
        customList.addLast(99);
        assertEquals(customList.tail.value, 99);
    }

    /**
     * Test for remove method
     */
    @Test
    public void remove() {
        customList.addFirst(10);
        customList.addFirst(14);
        customList.add(1, 7);
        customList.add(2, 3);
        customList.addLast(4);
        customList.remove(2);
        assertNotEquals(customList.getIndex(2), 3);
    }

    /**
     * Test for removeFirst method
     */
    @Test
    public void removeFirst() {
        customList.addFirst(10);
        customList.addFirst(14);
        customList.add(1, 7);
        customList.add(2, 3);
        customList.addLast(4);
        customList.removeFirst();
        assertNotEquals(customList.getIndex(0), 10);
    }

    /**
     * Test for removeLast method
     */
    @Test
    public void removeLast() {
        customList.addFirst(10);
        customList.addLast(14);
        customList.removeLast();
        assertNotEquals(customList.getIndex(1), 14);
    }

    /**
     * Test for getIndex method
     */
    @Test
    public void getIndex() {
        customList.addFirst(10);
        customList.add(0, 12);
        customList.add(1, 13);
        customList.add(2, 14);
        customList.addLast(15);
        assertEquals(customList.getIndex(0).value, 12);
        assertEquals(customList.getIndex(1).value, 13);
        assertEquals(customList.getIndex(2).value, 14);
    }
}
