class Solution {
    private boolean canWePlace(int[] nums, int dist, int k) {
        int placedCowsCount = 1;
        int lastCowPlace = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - lastCowPlace >= dist) {
                placedCowsCount++;
                lastCowPlace = nums[i];
            }

            if (placedCowsCount >= k) return true;
        }

        return false;
    }

    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);

        int limit = nums[nums.length - 1] - nums[0];

        for (int i = 1; i <= limit; i++) {
            if (!canWePlace(nums, i, k)) return i - 1;
        }

        return limit;
    }
}