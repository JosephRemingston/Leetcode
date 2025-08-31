class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        while(r < s.length()){
            String subString = s.substring(l , r + 1);
            int repeatativePairs = numberOfRepetativePairs(subString);
            while(repeatativePairs > 1){
                l++;
                subString = s.substring(l , r + 1);
                repeatativePairs = numberOfRepetativePairs(subString);
            }
            maxLength = Math.max(maxLength , r - l + 1);
            r++;
        }
        return maxLength;
    }
    int numberOfRepetativePairs(String s){
        int repeatativePairs = 0;
        for(int i = 0 ; i < s.length() - 1 ; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                repeatativePairs++;
            }
        }
        return repeatativePairs;
    }
}