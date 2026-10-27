class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[26];
            int maxFreq = 0;

            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, hash[s.charAt(j) - 'A']);

                int changes = (j - i + 1) - maxFreq;

                if (changes <= k) {
                    ans = Math.max(ans, j - i + 1);
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}