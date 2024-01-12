class Solution {

    private static final Set<Character> VOWELS = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));

    public boolean halvesAreAlike(String s) {
        char[] chars = s.toCharArray();

        int count = s.length();
        int mid = count / 2;

        int frontCount = countVowels(chars, 0, mid);
        int rearCount = countVowels(chars, mid, count);

        return frontCount == rearCount;
    }

    private int countVowels(char[] chars, int start, int end) {
        int cnt = 0;
        for (int i = start; i < end; i++) {
            if (VOWELS.contains(Character.toLowerCase(chars[i]))) {
                cnt++;
            }
        }
        return cnt;
    }
}

