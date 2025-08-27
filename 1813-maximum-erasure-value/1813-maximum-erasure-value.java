import java.util.*;
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int maxSum = 0;
        int sum = 0;
        Set<Integer> hashMap = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            while(hashMap.contains(nums[i])){
                hashMap.remove(nums[l]);
                sum = sum - nums[l];
                l++;
            }
            sum = sum + nums[i];
            hashMap.add(nums[i]);
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;
    }
}