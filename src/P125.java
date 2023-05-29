import java.util.Locale;

/*
125. Valid Palindrome
Easy
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
public class P125 {
    public static void main(String[] args) {
        String s = "ab_a";

        System.out.println("isPalindrome() = " + isPalindrome01(s));

    }

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("\\W", "");
        s = s.replaceAll("_", "");
        s=s.toLowerCase();

        int left=0,right=s.length()-1;

        while(left<right){
            if (s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindrome01(String s) {

        s = s.replaceAll("[^A-Za-z0-9]", "");

        s=s.toLowerCase();
        System.out.println(s);
        int left=0,right=s.length()-1;

        while(left<right){
            if (s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
