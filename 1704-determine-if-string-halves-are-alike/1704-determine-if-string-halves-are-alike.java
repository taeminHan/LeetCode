class Solution {

    private String[] VOWELS = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};   

    public boolean halvesAreAlike(String s) {
        String[] splitStr = s.split("");

        int count = s.length();

        int frontCount = half(splitStr, 0, count/2);
        int rearCount = half(splitStr, count/2, count);

        return frontCount==rearCount;
    }

    private int half(String[] str, int start, int end){
        int cnt = 0;
        for(int i=start;i<end;i++){
            for(String vowel:VOWELS){
                if(str[i].equals(vowel)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}