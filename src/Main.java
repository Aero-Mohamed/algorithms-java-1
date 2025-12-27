import Queues.ArrayQueueImplementation;
import Queues.QueueReverser;
import Stacks.BalancedString;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // Main.chapterArrays();
        // Main.chapterLinkedLists();
        // Main.chapterStacks();
        Main.chapterQueues();
    }

    /**
     * Chapter 4: Queues
     */
    public static void chapterQueues()
    {
        var queue = new ArrayQueueImplementation<Integer>(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        System.out.println(queue);
    }

    /**
     * Chapter 3: Stacks
     */
    public static void chapterStacks()
    {
        var expression = new BalancedString();
        System.out.println(
                expression.validate("[ 1 + 2 ]{}")
        );
    }

    /**
     * Chapter 2: Linked List
     */
    public static void chapterLinkedLists()
    {
        var list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.reverse();

        System.out.println(
                Arrays.toString(list.toArray())
        );
        System.out.println(
                "K=2 from the end: " + list.getKthFromEnd(2)
        );

        // Arrays vs. LinkedLists
        /*

          # Space
          Static arrays have fixed size
          Dynamic arrays grow by 50-100%
          Linked lists don't waste memory
          Use arrays if you know the number of items to store
          --
         */

        /*
          # Run time complexity ***
             --    | Arrays | Linked Lists
          Indexing
           By Index | O(1) | O(n)
           By Value | O(n)
             --
          Insert
           Start/End | O(n) | O(1)
              Middle | O(n)
             --
          Delete
               Start | O(n) | O(1)
              Middle | O(n)
                 End | O(n)
         */

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