package Stacks;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input)
    {
        if(input == null || input.isEmpty()) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray())
            stack.push(c);

        // StringBuffer is thread-safe, sync, used in a multi-thread application
        // StringBuilder is non-thread-save, async, used in a single thread application
        var reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

}
