class Solution {
    public String minWindow(String s, String t) {
        int minLen = Integer.MAX_VALUE;
        int startIdx = -1;

        int[] hash = new int[256];
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }

        int count = 0;
        int l = 0;
        int r = 0;

        while (r < s.length()) {
            if (hash[s.charAt(r)] > 0) {
                count++;
            }
            hash[s.charAt(r)]--;

            while (count == t.length()) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIdx = l;
                }

                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) {
                    count--;
                }
                l++;
            }

            r++;
        }

        return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minLen);
    }
}