class Solution {
    public int[] twoSum(int[] nums, int target) {
      int i = nums.length;
      int result[] = new int [2];

      cal:
      for(int j=0; j<i; j++){
        for(int k=j+1;k<i; k++){
          if((nums[j] + nums[k]) == target){
              result[0] = j;
              result[1] = k;
              break cal;
          }
        }
      }
      return result;
    }
}