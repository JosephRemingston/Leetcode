class Solution {
    public int reverseBits(int n) {
        String originalBinary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'); // pad to 32 bits
        String reversedBinary = new StringBuilder(originalBinary).reverse().toString();
        return (int) Long.parseLong(reversedBinary, 2); // parse as base 2
    }
}