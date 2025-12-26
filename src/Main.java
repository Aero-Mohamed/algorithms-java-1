import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Main.chapterArrays();
        Main.chapterLinkedLists();
    }

    /**
     * Chapter 2: Linked List
     */
    public static void chapterLinkedLists()
    {
        var list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);


    }

    /**
     * Chapter 1: Arrays
     */
    public static void chapterArrays()
    {
        // Vector: Grow 100% of its size - synchronized
        // ArrayList: Grow 50%

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(Integer.valueOf(1));
        list.remove(1);
        System.out.println(list);
        System.out.println("\nIndexOf 2: " + list.indexOf(2));
        System.out.println("\nLast Index of 2: " + list.lastIndexOf(2));
        System.out.println("\nSize: " + list.size());
        System.out.println("\nlist contains 2: " + list.contains(2));

        System.out.println(
            "\nRegular Arr: \n" +
            Arrays.toString(list.toArray(new Integer[0]))
        );
    }

}