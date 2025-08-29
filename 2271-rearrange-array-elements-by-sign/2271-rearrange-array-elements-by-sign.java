class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        int posIndex = 0; // start filling positives at even indices
        int negIndex = 1; // start filling negatives at odd indices
        
        for (int num : nums) {
            if (num > 0) {
                arr[posIndex] = num;
                posIndex += 2;
            } else {
                arr[negIndex] = num;
                negIndex += 2;
            }
        }
        
        return arr;
    }
}