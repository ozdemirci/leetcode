import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P136 {
/*
136. Single Number
Easy
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */
public static void main(String[] args) {

    int[] nums = {4,1,2,1,2};
   // System.out.println(singleNumber(nums));
     //System.out.println(singleNumberXOR(nums));
    List<Integer> list = new ArrayList<>();
    Arrays.stream(nums).sorted().forEach(list::add);
    int w= list.stream().reduce((t,u)->t ^= u ).get();
    System.out.println(w);

    Arrays.stream(nums).reduce((t,u)->t ^= u ).getAsInt();

}
    public static int singleNumber(int[] nums) {
    List<Integer> list = new ArrayList<>();
    Arrays.stream(nums).sorted().forEach(list::add);

    int single=list.get(list.size()-1);
        for (int i = 0; i < list.size()-1; i++) {
           if(list.get(i).equals(list.get(i+1))){
               i++;
           }else{
               single= list.get(i);
           }
        }


        return single;
    }
    public static int singleNumberXOR(int[] nums) {
        int single=0;
        for (int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;
    }
    public static int singleNumberXORLambda(int[] nums) {

     return   Arrays.stream(nums).reduce((t, u) -> t ^= u).getAsInt();

    }
}
