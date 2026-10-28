class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[3];

            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j) - 'a'] = 1;

                if (hash[0] + hash[1] + hash[2] == 3) {
                    count++;
                }
            }
        }

        return count;
    }
}