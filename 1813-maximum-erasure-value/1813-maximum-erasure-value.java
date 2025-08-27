import java.util.*;
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int maxSum = 0;
        int sum = 0;
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
            hashMap.put(nums[i] , hashMap.getOrDefault(nums[i] , 0) + 1);
            if(hashMap.get(nums[i]) > 1){
                l = i - 1;
                sum = sum - nums[i];
            }
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;
    }
}