package Queues;

import java.util.Stack;

public class StackQueueImplementation<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void enqueue(T item){
       stack1.push(item);
    }

    public T dequeue(){
        if(isEmpty()) throw new IllegalStateException();

        moveStack12Stack2();

        return stack2.pop();
    }

    public T peek()
    {
        if(isEmpty()) throw new IllegalStateException();

        moveStack12Stack2();

        return stack2.peek();
    }

    private void moveStack12Stack2() {
        if(stack2.isEmpty())
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString() {
        return "StackQueueImplementation{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
