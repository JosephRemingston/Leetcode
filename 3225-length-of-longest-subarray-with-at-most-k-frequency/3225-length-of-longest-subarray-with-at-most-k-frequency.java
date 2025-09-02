import java.util.*;
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        while(r < nums.length){
            hashMap.put(nums[r] , hashMap.getOrDefault(nums[r] , 0) + 1);
            int frequency = hashMap.get(nums[r]);
            while(frequency > k){
                if(hashMap.get(nums[l]) == 0){
                    hashMap.remove(nums[l]);
                }
                else{
                    hashMap.put(nums[l] , hashMap.get(nums[l]) - 1);
                }
                frequency = hashMap.get(nums[r]);
                l++;
            }
            maxLength = Math.max(maxLength , r - l + 1);
            r++;
        }
        return maxLength;
    }
}