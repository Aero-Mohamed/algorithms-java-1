package Queues;

import java.util.Arrays;

public class ArrayPriorityQueueImplementation<T extends Comparable<T>> {
    private T[] items;
    private int count;

    @SuppressWarnings("unchecked")
    public ArrayPriorityQueueImplementation(int capacity) {
        items = (T[])(new Comparable[capacity]);
    }

    public void enqueue(T item) {
        if(count == items.length) throw new IllegalStateException();

        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    private int shiftItemsToInsert(T item) {
        int i = count -1;
        while(i >= 0 && items[i].compareTo(item) > 0){
            items[i+1] = items[i];
            i--;
        }

        return i + 1;
    }

    public T dequeue()
    {
        if(count == 0) throw new IllegalStateException();
        return items[--count];
    }

    @Override
    public String toString() {
        return "ArrayPriorityQueueImplementation{" +
                "items=" + Arrays.toString(Arrays.copyOfRange(items, 0, count)) +
                ", count=" + count +
                '}';
    }
}
