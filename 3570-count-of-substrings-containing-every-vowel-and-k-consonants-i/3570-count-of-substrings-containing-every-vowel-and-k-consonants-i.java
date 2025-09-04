class Solution {
    public int countOfSubstrings(String word, int k) {
        int n = word.length(), start = 0, left = 0, ans = 0;
        int[] charCnt = new int[6];

        for (int rght = 0; rght < n; rght++) {
            charCnt[getIndex(word.charAt(rght))]++;

            while (left < rght && charCnt[5] > k) {
                charCnt[getIndex(word.charAt(left))]--;
                left++;
                start = left;
            }

            while (charCnt[5] == k && left < rght) {
                int idx = getIndex(word.charAt(left));
                if (idx < 5) {
                    if (charCnt[idx] > 1) {
                        charCnt[idx]--;
                        left++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }

            if (charCnt[5] == k && Arrays.stream(charCnt, 0, 5).min().orElse(1) > 0) {
                ans += (left - start + 1);
            }
        }

        return ans;
    }

    private int getIndex(char ch) {
        switch (ch) {
            case 'a': return 0;
            case 'e': return 1;
            case 'i': return 2;
            case 'o': return 3;
            case 'u': return 4;
            default : return 5; 
        }
    } 
}