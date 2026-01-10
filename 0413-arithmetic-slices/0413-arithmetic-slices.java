class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;

        int total = 0;
        int curr = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr++;          // extend previous arithmetic slices
                total += curr;   // add all slices ending at i
            } else {
                curr = 0;        // reset if difference breaks
            }
        }

        return total;
    }
}