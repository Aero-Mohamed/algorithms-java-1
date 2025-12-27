package Queues;

import java.util.Arrays;

public class ArrayQueueImplementation<T> {

    private T[] items;
    private int count;
    private int frontIdx;
    private int rearIdx;

    @SuppressWarnings("unchecked")
    public ArrayQueueImplementation(int capacity) {
        items = (T[]) (new Object[capacity]);
        rearIdx = 0;
        frontIdx = 0;
    }

    public void enqueue(T item)
    {
        if(count == items.length) throw new IllegalStateException();

        items[rearIdx] = item;
        rearIdx = (rearIdx + 1) % items.length;

        count++;
    }

    public T dequeue()
    {
        if(count == 0) throw new IllegalStateException();

        var item = items[frontIdx];
        items[frontIdx] = null;
        frontIdx = (frontIdx + 1) % items.length;

        count--;
        return item;
    }


    @Override
    public String toString() {
        return "ArrayQueueImplementation{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                ", frontIdx=" + frontIdx +
                ", rearIdx=" + rearIdx +
                '}';
    }


}
