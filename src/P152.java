public class P152 {
    /*
    152. Maximum Product Subarray
Medium

Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

Example 3:
Input nums = [-2,3,-4]
Output: 24

Example 4:
Input nums = [2,-5,-2,-4,3]
Output: 24

Example 5:
Input nums = [-4,-3]
Output: 12

Example 6:
Input nums = [-1,-2,-9,-6]
Output: 108

Example 6:
Input nums = [1,-2,3,-4,-3,-4,-3]
Output: 432


-1,-2,-3,0 -> 6
1,2,-1,-2,2,1,-2,1,4,-5,4 -> 1280
Constraints:
1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     */
    public static void main(String[] args) {

        int[] nums={-1,-2,-3,0 };
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max;  // store the max because before updating min your max will already be updated

            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}
