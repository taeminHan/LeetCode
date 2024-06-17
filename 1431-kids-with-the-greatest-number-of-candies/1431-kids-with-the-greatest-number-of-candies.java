class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandies = 0;

        for(int j=0;j<candies.length;j++){
            if(maxCandies < candies[j]){
                maxCandies = candies[j];
            }
        }
        

        List<Boolean> result = new ArrayList();
        for(int i = 0; i < candies.length; i++){
            if(candies[i]+extraCandies < maxCandies){
                result.add(false);
            }else{
                result.add(true);
            }
        }
        return result;

    }
}