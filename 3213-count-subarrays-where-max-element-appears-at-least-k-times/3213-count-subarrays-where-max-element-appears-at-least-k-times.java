class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l = 0;
        int r = 0;
        long maxElement = 0l;
        long numberOfMaxElements = 0l;
        long numberOfSubArrays = 0l;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > maxElement){
                maxElement = nums[i];
            }
        }
        while(r < nums.length){
            if(nums[r] == maxElement){
                numberOfMaxElements++;
            }
            while(numberOfMaxElements == k){
                if(nums[l] == maxElement){
                    numberOfMaxElements--;
                }
                l++;
            }
            numberOfSubArrays = numberOfSubArrays + l;
            r++;
        }
        return numberOfSubArrays;
    }
}