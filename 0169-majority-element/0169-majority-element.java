import java.util.*;
import java.util.Map.Entry;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hashmap = new HashMap<>();
        int majority = -1;
        int maxCount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(hashmap.containsKey(nums[i])){
                int value = hashmap.get(nums[i]);
                hashmap.put(nums[i] , value + 1);
            }
            else{
                hashmap.put(nums[i] , 1);
            }
        }
        for(Entry<Integer , Integer> entry : hashmap.entrySet()){
            if(entry.getValue() > maxCount){
                majority = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        if(maxCount > nums.length / 2){
            return majority;
        }
        return -1;
    }
}