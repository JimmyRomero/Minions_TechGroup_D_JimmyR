import java.util.Comparator;
import java.util.LinkedList;

/**
 * Homework #1 - LinkedList methods implementation
 * Implement the methods below according to the specification in the assignment description.
 */
public class LinkedListUtils {

    /**
     * Insert a given value into an already sorted LinkedList
     *
     * @param list        The sorted list
     * @param numberValue The value to be added to the list
     */
    public static void insertSorted(LinkedList<Integer> list, int numberValue) {
        if (list != null) {
            int node = 0;
            Integer current;
            boolean added = false;
            while (node < list.size()) {
                current = list.get(node);
                if (current > numberValue) {
                    list.add(node, numberValue);
                    added = true;
                    break;
                } else {
                    node++;
                }
            }
            if (!added) {
                list.add(numberValue);
            }
        }
    }

    /**
     * Remove all instances of the N largest values from a linkedList
     *
     * @param list        The input list
     * @param numberValue The number N of largest values to be removed from the list
     */
    public static void removeMaximumValues(LinkedList<String> list, int numberValue) {
        if (list != null && numberValue > 0) {
            int node = 0;
            int count = 0;
            String previous = null;
            LinkedList<String> sortedList = new LinkedList<>(list);
            sortedList.sort(Comparator.reverseOrder());
            String[] unwantedElements = new String[numberValue];
            while (node < sortedList.size() && count < numberValue) {
                String element = sortedList.get(node);
                if (!element.equals(previous)) {
                    unwantedElements[count] = element;
                    previous = element;
                    count++;
                }
                node++;
            }
            for (node = 0; node < unwantedElements.length; node++) {
                String element = unwantedElements[node];
                while (list.contains(element)) {
                    list.remove(element);
                }
            }
        }
    }

    /**
     * Determine whether a linked list is a subsequence of another linked list
     *
     * @param one The first (potential container) list
     * @param two The second (potential subsequence) list
     * @return true if list two is a subsequence of list one
     * false otherwise
     */
    public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {
        boolean check = one != null && two != null
                && !one.isEmpty() && !two.isEmpty();
        if (check) {
            int tCursor = 0;
            Integer current = two.get(tCursor);
            int oCursor = one.indexOf(current);
            check = oCursor > -1;
            while (check && tCursor < two.size()) {
                tCursor++;
                if (tCursor < two.size()) {
                    current = two.get(tCursor);
                    oCursor++;
                    check = oCursor < one.size()
                            && one.get(oCursor).equals(current);
                }
            }
        }
        return check;
    }
}
