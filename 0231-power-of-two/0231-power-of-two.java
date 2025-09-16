class Solution {
    public boolean isPowerOfTwo(int n) {
        int a = n - 1;
        int b = n & a;
        if(n == 0){
            return false;
        }
        if(n > 0 && b == 0){
            return true;
        }
        else{
            return false;
        }
    }
}