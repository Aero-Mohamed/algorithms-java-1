import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty(){
        return first == null;
    }

    private Node getPrevious(Node node)
    {
        var current = first;
        while(current.next != node){
            current = current.next;
        }

        return current;
    }

    public int[] toArray()
    {
        var arr = new int[size];
        var current = first;
        var index = 0;

        while(current != null){
            arr[index++] = current.value;
            current = current.next;
        }

        return arr;
    }

    public int size()
    {
        return size;
    }

    public void addFirst(int item)
    {
        var node = new Node(item);

        if(isEmpty()){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }

        size++;
    }

    public void addLast(int item)
    {
        var node = new Node(item);

        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeFirst()
    {
        if(isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }else{
            var second = first.next;
            first.next = null; // so garbage collector will remove it
            first = second;
        }

        size--;
    }

    public void removeLast()
    {
        if(isEmpty()) throw new NoSuchElementException();

        if(first == last){
            first = last = null;
        }else{
            Node prevNode = getPrevious(last);
            prevNode.next = null;
            last = prevNode;
        }

        size--;
    }

    public boolean contains(int item)
    {
        return indexOf(item) != -1;
    }

    public int indexOf(int item)
    {
        int idx = 0;
        var current = first;

        while(current != null){
            if(current.value == item) return idx;
            current = current.next;
            idx++;
        }

        return -1;
    }
}
