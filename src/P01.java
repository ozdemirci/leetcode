import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P01 {
    /*
1. Two Sum
Easy

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Input: nums = [2,5,5,11], target=10
Output: [1,2]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
     */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("twoSum(nums) = " + Arrays.toString(twoSum(nums,target) ) );
        // System.out.println("twoSum02(nums,target) = " + Arrays.toString(twoSum02(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j] ) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
    public static int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();
        int[] ans=new int[2];
    for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (!index.containsKey(other)) {
                index.put(nums[i], i);
            } else {
    return new int[]{index.get(other),i};
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSum03(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();
        int[] ans=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (!index.containsKey(other)) {
                index.put(nums[i], i);
            } else {
                ans[0]= index.get(other);
                ans[1]=i;
                 break;
            }
        }
        return ans;
    }


}