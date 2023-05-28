import java.util.*;

public class P20 {
    /*
    20. Valid Parentheses
Easy

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
     */
    public static void main(String[] args) {
        String s = "(])";


        System.out.println("isValid()02 = " + isValid(s));
    }

    public static boolean isValid(String s) {

        if (s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid01(String s) {
        if (s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char each : chars) {
            if (each == '(' || each == '{' || each == '[')
                stack.push(each);
            else if (each == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (each == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (each == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();

    }


}


