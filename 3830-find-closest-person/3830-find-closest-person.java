class Solution {
    public int findClosest(int x, int y, int z) {
        int xToz = Math.abs(z - x);
        int yToz = Math.abs(z - y);
        if(xToz > yToz){
            return 2;
        }
        else if(yToz > xToz){
            return 1;
        }
        else{
            return 0;
        }
    }
}