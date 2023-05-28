import java.util.ArrayList;
import java.util.List;

public class P09 {
    /*
    Easy
    Given an integer x, return true if x is a palindrome, and false otherwise.

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


Follow up: Could you solve it without converting the integer to a string?

     */

    public static void main(String[] args) {
        int num=121;

        boolean is=isPalindrome(num);

        System.out.println(is);
    }
    public static boolean isPalindrome(int x) {
        boolean palindrome = false;
        if (x < 0) {
            return palindrome;
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = x; i > 0; i = i / 10) {
            int number = i % 10;
            list1.add(number);
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