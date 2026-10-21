class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[256];

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (hash[ch] == 1) break;

                hash[ch]++;
                ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}