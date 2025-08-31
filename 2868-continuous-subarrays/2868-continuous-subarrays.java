import java.util.*;

class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        long count = 0;

        // TreeMap to maintain frequency of elements inside the window
        TreeMap<Integer, Integer> freq = new TreeMap<>();

        int l = 0;
        for (int r = 0; r < n; r++) {
            // Add nums[r] into the window
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);

            // Shrink window if condition breaks
            while (freq.lastKey() - freq.firstKey() > 2) {
                freq.put(nums[l], freq.get(nums[l]) - 1);
                if (freq.get(nums[l]) == 0) {
                    freq.remove(nums[l]);
                }
                l++;
            }

            // All subarrays ending at r and starting between l..r are valid
            count += (r - l + 1);
        }

        return count;
    }
}