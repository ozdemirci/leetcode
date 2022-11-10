public class P10 {

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        boolean result = containsDuplicate(nums);
        System.out.println("result = " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;

        for (int i = 0; i <  nums.length -1; i++) {
                if (nums[i] == nums[i+1]) {
                    duplicate = true;
                    break;
                }
        }
        return duplicate;
    }
}



