import java.util.*;

class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int n = nums.size();
        long maxSum = 0;
        long windowSum = 0;

        Map<Integer, Integer> freq = new HashMap<>();
        int distinct = 0;

        int l = 0;
        for (int r = 0; r < n; r++) {
            // add nums[r]
            int rightVal = nums.get(r);
            windowSum += rightVal;
            freq.put(rightVal, freq.getOrDefault(rightVal, 0) + 1);
            if (freq.get(rightVal) == 1) {
                distinct++;
            }

            // maintain window size k
            if (r - l + 1 > k) {
                int leftVal = nums.get(l);
                windowSum -= leftVal;
                freq.put(leftVal, freq.get(leftVal) - 1);
                if (freq.get(leftVal) == 0) {
                    freq.remove(leftVal);
                    distinct--;
                }
                l++;
            }

            // check when window is exactly size k
            if (r - l + 1 == k && distinct >= m) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}