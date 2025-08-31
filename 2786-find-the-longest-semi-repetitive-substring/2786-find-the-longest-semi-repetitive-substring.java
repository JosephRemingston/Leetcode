class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int l = 0;
        int r = 1;
        int maxLength = 1;
        int repeatativePairs = 0;
        while(r < s.length()){
            if(s.charAt(r) == s.charAt(r - 1)){
                repeatativePairs++;
            }
            while(repeatativePairs > 1){
                if(s.charAt(l) == s.charAt(l + 1)){
                    repeatativePairs--;
                }
                l++;
            }
            maxLength = Math.max(maxLength , r - l + 1);
            r++;
        }
        return maxLength;
    }
}