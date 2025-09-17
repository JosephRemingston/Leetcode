class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for(int i = 0 ; i <= n ; i++){
            arr[i] = numberOfSetBits(i);
        }
        return arr;
    }

    int numberOfSetBits(int n) {
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