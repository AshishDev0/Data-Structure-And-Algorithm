class Solution {
    public int longestNonRepeatingSubstring(String s) {
        //your code goes here

        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        int l = 0;
        int r = 0;
        int maxLen = 0;

        while (r < s.length()) {
            char ch = s.charAt(r);

            if (hash[ch] != -1) {
                l = Math.max(hash[ch] + 1, l);
            }

            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            hash[ch] = r;
            r++;
        }

        return maxLen;
    }
}