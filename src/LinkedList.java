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

    // deleteFirst
    // DeleteLast

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
