class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int[] count = new int[n]; // will store count of max LIS till index i
        Arrays.fill(count, 1);

        for(int i=0; i<n; i++){
            int ans = 1;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    int a = 1 + dp[j];
                    if(a==ans) count[i] += count[j]; // if equal to curr max add it existing count
                    else if(a>ans){ // if new max
                        count[i] = count[j]; // reset it to count of LIS at j
                        ans = a; // update max length
                    }
                }
            }
            dp[i] = ans;
        }

 
        int max = -1; // max length of LIS
        int res = 0; // total max LIS
        for(int i=0; i<n; i++){
            if(max<dp[i]){
                max = dp[i];
                res = count[i];
            }else if(max==dp[i]){
                res += count[i]; // count all
            }
        }
        return res;
    }
}