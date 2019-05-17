import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(10);
        list.add(12);
        System.out.println(list.toString());
        LinkedListUtils.insertSorted(list, 5);
        LinkedListUtils.insertSorted(list, 20);
        System.out.println(list.toString());

        System.out.println("-------------------------");

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("hi");
        stringList.add("wow");
        stringList.add("dog");
        stringList.add("remove");
        stringList.add("presentation");
        stringList.add("rock");
        stringList.add("metal");
        System.out.println(stringList.toString());
        LinkedListUtils.removeMaximumValues(stringList, 5);
        System.out.println(stringList.toString());

        System.out.println("-------------------------");

        LinkedList<Integer> one = new LinkedList<>();
        one.add(6);
        one.add(4);
        one.add(8);
        one.add(10);
        one.add(19);
        one.add(28);
        System.out.println("one: " + one.toString());
        LinkedList<Integer> two = new LinkedList<>();
        two.add(28);
        System.out.println("two: " + two.toString());
        System.out.println(LinkedListUtils.containsSubsequence(one, two));
    }
}
