class Solution {
    public int maxSubArray(int[] nums) {
        int r = 1;
        int maxSum = nums[0];
        int sum = nums[0];
        while(r < nums.length){
            sum = Math.max(nums[r], sum + nums[r]);
            maxSum = Math.max(maxSum , sum);
            r++;
        }
        return maxSum;
    }
}