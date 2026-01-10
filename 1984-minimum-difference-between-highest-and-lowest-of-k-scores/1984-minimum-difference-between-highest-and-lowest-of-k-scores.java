import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = k - 1;
        if(nums.length <= 1){
            return 0;
        }
        int minDifference = Integer.MAX_VALUE;
        while(r < nums.length){
            minDifference = Math.min(minDifference , nums[r] - nums[l]);
            r++;
            l++;
        }
        return minDifference;
    }
}