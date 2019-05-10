import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomListTest {

    private CustomList customList;

    @Before
    public void init() {
        customList = new CustomList();
    }


    @Test
    public void add() {
        customList.addFirst(3);
        customList.add(1, 4);
        customList.addLast(5);
        assertEquals(customList.getIndex(0).value, 3);
        assertEquals(customList.getIndex(1).value, 4);
        assertEquals(customList.getIndex(2).value, 5);

    }

    @Test
    public void addFirst() {
        customList.addFirst(1);
        assertEquals(customList.head.value, 1);
    }

    @Test
    public void addLast() {
        customList.addLast(85);
        assertEquals(customList.tail.value, 85);
    }

    @Test
    public void remove() {
        customList.addFirst(1);
        customList.add(1, 2);
        customList.add(2, 3);
        customList.addLast(4);

        customList.remove(2);
        assertNotEquals(customList.getIndex(2), 3);
    }

    @Test
    public void removeFirst() {
        customList.addFirst(1);
        customList.add(1, 2);
        customList.add(2, 3);
        customList.addLast(4);

        customList.removeFirst();
        assertNotEquals(customList.getIndex(0), 1);
    }

    @Test
    public void removeLast() {
        customList.addFirst(1);
        customList.add(1, 2);
        customList.add(2, 3);
        customList.addLast(4);

        customList.removeLast();
        assertNotEquals(customList.getIndex(3), 4);
    }

    @Test
    public void getIndex() {

        customList.addFirst(1);
        customList.add(1, 2);
        customList.add(2, 3);
        customList.addLast(4);
        assertEquals(customList.getIndex(0).value, 1);
        assertEquals(customList.getIndex(1).value, 2);
        assertEquals(customList.getIndex(2).value, 3);
        assertEquals(customList.getIndex(3).value, 4);
    }
}