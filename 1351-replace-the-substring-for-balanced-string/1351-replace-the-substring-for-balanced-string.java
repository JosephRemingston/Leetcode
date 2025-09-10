import java.util.*;

class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int limit = n / 4; // each char should appear at most n/4 times

        // Step 1: count frequencies of all chars
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: if already balanced, return 0
        if (isBalanced(freq, limit)) {
            return 0;
        }

        int res = n;
        int l = 0;

        // Step 3: sliding window
        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);
            freq.put(c, freq.get(c) - 1); // remove from remaining part

            // shrink window while remaining part is balanced
            while (l < n && isBalanced(freq, limit)) {
                res = Math.min(res, r - l + 1);

                char leftChar = s.charAt(l);
                freq.put(leftChar, freq.get(leftChar) + 1); // put back
                l++;
            }
        }

        return res;
    }

    private boolean isBalanced(Map<Character, Integer> freq, int limit) {
        return freq.getOrDefault('Q', 0) <= limit &&
               freq.getOrDefault('W', 0) <= limit &&
               freq.getOrDefault('E', 0) <= limit &&
               freq.getOrDefault('R', 0) <= limit;
    }
}