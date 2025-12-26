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


    public void addFirst(int item)
    {
        var node = new Node(item);

        if(isEmpty()){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
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

    }

    public void removeFirst()
    {
        if(isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null; // so garbage collector will remove it
        first = second;
    }

    public void removeLast()
    {
        if(isEmpty()) throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }

        Node prevNode = getPrevious(last);
        prevNode.next = null;
        last = prevNode;
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
