import java.util.*;
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = 0;
        int maxSize = 0;
        while(r < nums.length){
            while(nums[r] > (long) k * nums[l]){
                l++;
            }
            maxSize = Math.max(maxSize , r - l + 1);
            r++;
        }
        return nums.length - maxSize;
    }
}