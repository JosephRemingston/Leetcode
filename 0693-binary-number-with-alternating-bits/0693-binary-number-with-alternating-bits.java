class Solution {
    public boolean hasAlternatingBits(int n) {
        String string = Integer.toBinaryString(n);
        for(int i = 0 ; i < string.length() - 1 ; i++){
            if(string.charAt(i) == string.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
}