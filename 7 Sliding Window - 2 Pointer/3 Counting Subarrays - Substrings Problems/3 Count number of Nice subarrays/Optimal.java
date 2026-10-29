class Solution {
    private int findCount(int[] nums, int k) {
        if (k < 0) return 0;

        int count = 0;
        int sum = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            sum += nums[r] % 2;

            while (sum > k) {
                sum -= nums[l] % 2;
                l++;
            }

            count += r - l + 1;

            r++;
        }

        return count;
    }

    public int numberOfOddSubarrays(int[] nums, int k) {
        return findCount(nums, k) - findCount(nums, k - 1);
    }
}