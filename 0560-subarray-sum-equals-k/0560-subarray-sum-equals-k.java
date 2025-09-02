import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int totalSubArrays = nums.length * (nums.length + 1) / 2;
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        hashMap.put(0 , 1);
        int sum = 0;
        while(r < nums.length){
            sum = sum + nums[r];
            if (hashMap.containsKey(sum - k)) {
                count += hashMap.get(sum - k);
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
            r++;
        }
        return count;
    }
}