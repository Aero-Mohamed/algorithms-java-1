package Stacks;

import java.util.Stack;

public class BalancedString {

    public boolean validate(String input)
    {
        Stack<Character> stack = new Stack<>();

        for(char c: input.toCharArray())
        {
            if(c == '(')
                stack.push(c);

            if(c == ')'){
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
