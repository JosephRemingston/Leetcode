class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 0){
            return false;
        }
        if(num == 1){
            return true;
        }
        int low = 0;
        int high = num / 2;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long squareRoot = (long) mid * mid;
            if(squareRoot == num){
                return true;
            }
            else if(squareRoot < num){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}