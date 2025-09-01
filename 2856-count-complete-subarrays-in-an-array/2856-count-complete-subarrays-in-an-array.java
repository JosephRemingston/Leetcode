import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int distinctElements = set.size();

        int completeSubArrayNums = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int j = i; j < n; j++) {
                hashMap.put(nums[j], hashMap.getOrDefault(nums[j], 0) + 1);
                if (hashMap.size() == distinctElements) {
                    completeSubArrayNums++;
                }
            }
        }

        return completeSubArrayNums;
    }
}