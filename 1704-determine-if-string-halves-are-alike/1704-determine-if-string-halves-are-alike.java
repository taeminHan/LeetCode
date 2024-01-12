class Solution {

    private static final String[] VOWELS = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

    public boolean halvesAreAlike(String s) {
        String[] splitStr = s.split("");

        int count = s.length();
        int mid = count / 2;

        int frontCount = countVowels(splitStr, 0, mid);
        int rearCount = countVowels(splitStr, mid, count);

        return frontCount == rearCount;
    }

    private int countVowels(String[] str, int start, int end) {
        int cnt = 0;
        for (int i = start; i < end; i++) {
            for (String vowel : VOWELS) {
                if (str[i].equals(vowel)) {
                    cnt++;
                    break;  // Break once a vowel is found in the inner loop
                }
            }
        }
        return cnt;
    }
}
