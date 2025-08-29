import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int[] positiveArr = new int[nums.length / 2];
        int[] negativeArr = new int[nums.length / 2];
        int positiveIndex = 0;
        int negativeIndex = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                positiveArr[positiveIndex] = nums[i];
                positiveIndex++;
            }
            if(nums[i] < 0){
                negativeArr[negativeIndex] = nums[i];
                negativeIndex++;
            }
        }
        positiveIndex = 0;
        negativeIndex = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 == 0){
                arr[i] = positiveArr[positiveIndex];
                positiveIndex++;
            }
            if(i % 2 != 0){
                arr[i] = negativeArr[negativeIndex];
                negativeIndex++;
            }
        }
        return arr;
    }
}