class Solution {
    public int totalFruits(int[] fruits) {
        int ans = 0;

        for (int i = 0; i < fruits.length; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < fruits.length; j++) {
                set.add(fruits[j]);

                if (set.size() <= 2) {
                    ans = Math.max(ans, j - i + 1);
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}