class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Left to right sliding window
        int l = 0;
        for (int r = 0; r < n; r++) {
            while (prizePositions[r] - prizePositions[l] > k) {
                l++;
            }
            int window = r - l + 1; // prizes in current window
            leftMax[r] = Math.max((r > 0 ? leftMax[r - 1] : 0), window);
        }

        // Right to left sliding window
        int r = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (prizePositions[r] - prizePositions[i] > k) {
                r--;
            }
            int window = r - i + 1;
            rightMax[i] = Math.max((i + 1 < n ? rightMax[i + 1] : 0), window);
        }

        // Combine two segments
        int ans = 0;
        for (int i = 0; i + 1 < n; i++) {
            ans = Math.max(ans, leftMax[i] + rightMax[i + 1]);
        }

        // In case the best answer comes from only one segment
        ans = Math.max(ans, leftMax[n - 1]);

        return ans;
    }
}