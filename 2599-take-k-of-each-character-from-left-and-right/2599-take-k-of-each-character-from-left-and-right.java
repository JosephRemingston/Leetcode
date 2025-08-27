class Solution {
    public int takeCharacters(String s, int k) {
        int n = s.length();
        int[] total = new int[3]; // counts of a, b, c

        for (char c : s.toCharArray()) {
            total[c - 'a']++;
        }

        // if we don’t even have k of some char, impossible
        if (total[0] < k || total[1] < k || total[2] < k) {
            return -1;
        }

        int maxKeep = 0;
        int l = 0;
        int[] window = new int[3];

        // sliding window to find longest substring we can keep
        for (int r = 0; r < n; r++) {
            window[s.charAt(r) - 'a']++;
            while (window[0] > total[0] - k ||
                   window[1] > total[1] - k ||
                   window[2] > total[2] - k) {
                window[s.charAt(l) - 'a']--;
                l++;
            }
            maxKeep = Math.max(maxKeep, r - l + 1);
        }

        return n - maxKeep; // characters taken = rest removed
    }
}
