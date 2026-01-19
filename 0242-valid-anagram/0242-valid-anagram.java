import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> hashMap = new HashMap<>();
        HashMap<Character , Integer> hashMap1 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0 ; i < s.length() ; i++){
            hashMap.put(s.charAt(i) , hashMap.getOrDefault(s.charAt(i) , 0) + 1);
            hashMap1.put(t.charAt(i) , hashMap1.getOrDefault(t.charAt(i) , 0) + 1);
        }
        for (Character key : hashMap.keySet()) {
            if (!hashMap.get(key).equals(hashMap1.get(key))) {
                return false;
            }
        }
        return true;
    }
}