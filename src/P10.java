
enum Result {
    TRUE, FALSE
}
public class P10 {
    /*
    HARD
    Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).



Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".


Constraints:

1 <= s.length <= 20
1 <= p.length <= 20
s contains only lowercase English letters.
p contains only lowercase English letters, '.', and '*'.
It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
     */


    public static void main(String[] args) {
       String s = "ab", p = ".*";
        P10 object = new P10();
       boolean is= object.isMatch(s,p);
        System.out.println(is);
    }


        Result[][] memo;

        public boolean isMatch(String text, String pattern) {
            memo = new Result[text.length() + 1][pattern.length() + 1];
            return dp(0, 0, text, pattern);
        }

        public boolean dp(int i, int j, String text, String pattern) {
            if (memo[i][j] != null) {
                return memo[i][j] == Result.TRUE;
            }
            boolean ans;
            if (j == pattern.length()){
                ans = i == text.length();
            } else{
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));

                if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                    ans = (dp(i, j+2, text, pattern) ||
                            first_match && dp(i+1, j, text, pattern));
                } else {
                    ans = first_match && dp(i+1, j+1, text, pattern);
                }
            }
            memo[i][j] = ans ? Result.TRUE : Result.FALSE;
            return ans;
        }
    }




