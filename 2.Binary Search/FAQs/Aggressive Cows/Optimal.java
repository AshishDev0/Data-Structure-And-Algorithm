class Solution {
    private boolean canWePlace(int[] nums, int dist, int k) {
        int cowsPlacedCount = 1;
        int lastCowPlace = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - lastCowPlace >= dist) {
                cowsPlacedCount++;
                lastCowPlace = nums[i];
            }

            if (cowsPlacedCount >= k) return true;
        }

        return false;
    }

    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);

        int limit = nums[nums.length - 1] - nums[0];

        int low = 1;
        int high = limit;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canWePlace(nums, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}