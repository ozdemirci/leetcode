import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P09 {
    /*
9. Palindrome Number
Easy
Given an integer x, return true if x is a
palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1
     */
    public static void main(String[] args) {
        int x = 121;
        System.out.println("isPalindrome(x) = " + isPalindrome(x));


    }

    public static boolean isPalindrome(int x) {

        boolean palindrome = false;
        if (x < 0) {
            return palindrome;
        }
        int numbers = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = x; i > 0; i = i / 10) {
            numbers = i % 10;
            list1.add(numbers);
        }
        for (int i = list1.size() - 1; i >= 0; i--) {
            list2.add(list1.get(i));
        }
        if (list1.equals(list2)) {
            palindrome = true;
        }

        return palindrome;
    }
}
