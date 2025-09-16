class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // shift result left to make room for the next bit
            result <<= 1;
            // add the last bit of n to result
            result |= (n & 1);
            // shift n right to process the next bit
            n >>= 1;
        }
        return result;
    }
}