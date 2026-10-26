class Solution {
    public int kDistinctChar(String s, int k) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;

        while (r < s.length()) {
            char currentChar = s.charAt(r);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}