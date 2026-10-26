class Solution {
    public int kDistinctChar(String s, int k) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                set.add(s.charAt(j));

                if (set.size() > k) break;

                ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}