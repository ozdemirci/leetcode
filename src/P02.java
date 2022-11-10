import java.util.ArrayList;
import java.util.List;

public class P02 {
    /*
    2. Add Two Numbers
Medium
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
     */
    public static void main(String[] args) {
        int[] a1 = {9,9,9,9,9,9,9};

         List<Integer> l1 = new ArrayList<>();
        for (int w : a1) {
            l1.add(w);
        }

        int[] a2 = {9,9,9,9};
        List<Integer> l2 = new ArrayList<>();
        for (int w : a2) {
            l2.add(w);
        }

        System.out.println("addTwoNumbers(l1, l2) = " + addTwoNumbers(l1, l2));
    }


    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        int result = 0;
        int number = 0;
        List<Integer> l3 = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {
            result += l1.get(i) * ((int) Math.pow(10, i));
        }
        for (int i = 0; i < l2.size(); i++) {
            result += l2.get(i) * ((int) Math.pow(10, i));
        }

        int l = (((Integer) result).toString()).length();

        for (int i = 1; i < l; i++) {
            number = result % ((int) Math.pow(10, i));
            if (number < Math.pow(10, i) && number > Math.pow(10, i - 1)) {
                if(number>=10){
                    number =number/((int)Math.pow(10, i - 1));
                    l3.add(number);
                }else{
                    l3.add(number);}
            } else {
                l3.add(0);
            }
        }
        int a = result / ((int) Math.pow(10, l - 1));
        l3.add(a);

        return l3;
    }
}