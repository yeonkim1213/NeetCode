// Time: O(n)
// Space: O(n) - in the worst case, the stack may store all chars in the string

package Stack.ValidParentheses;

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class stack {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            // Check if the char is a closing bracket
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
