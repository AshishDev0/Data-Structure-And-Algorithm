class Solution {
    private int atMostKDifferentSubArr(int[] nums, int k) {
        if (k < 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            if (map.get(nums[r]) == 1) k--;

            while (k < 0) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) k++;
                l++;
            }

            count += r - l + 1;

            r++;
        }

        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDifferentSubArr(nums, k) - atMostKDifferentSubArr(nums, k - 1);
    }
}