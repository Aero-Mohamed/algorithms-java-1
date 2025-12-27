package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser<D> {

    public Queue<D> reverse(Queue<D> queue)
    {
        var stack = new Stack<D>();
        while(!queue.isEmpty()){
            stack.add(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        return queue;
    }
}
