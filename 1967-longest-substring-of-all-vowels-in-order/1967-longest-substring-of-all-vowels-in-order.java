class Solution {
    public int longestBeautifulSubstring(String word) {
        int maxLength = 0;
        int count = 1;    // length of current substring
        int vowelKinds = 1; // number of distinct vowels in order

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) >= word.charAt(i - 1)) {
                // non-decreasing order
                count++;

                if (word.charAt(i) != word.charAt(i - 1)) {
                    vowelKinds++; // new vowel encountered
                }
            } else {
                // order broken, reset
                count = 1;
                vowelKinds = 1;
            }

            if (vowelKinds == 5) {
                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }
}