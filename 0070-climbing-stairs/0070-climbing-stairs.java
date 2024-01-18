class Solution {

    final int ONE_STEP = 1;
    final int TWO_STEP = 2;

    public int climbStairs(int n) {
        if(n <= 3){
            return n;
        }

        int[] list = new int[n];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;

        for(int i=3; i < n; i++){
            list[i] = list[i-1] + list[i-2];
        }
        return list[n-1];
    }
}


