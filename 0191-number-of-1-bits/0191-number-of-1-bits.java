class Solution {
    public int hammingWeight(int n) {
        int x = n;
        int count = 0;
        while(n >= 1){
            int rem = n % 2;
            if(rem == 1){
                count++;
            }
            n = n / 2;
        }
        return count;
    }
}