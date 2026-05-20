class Solution {
    private int recursion(int idx, int sum, int[] nums) {
        if (sum == 0) {
            return 1;
        }

        if (sum < 0 || idx == nums.length) {
            return 0;
        }

        int left = recursion(idx + 1, sum - nums[idx], nums);
        int right = recursion(idx + 1, sum, nums);

        return left + right;
    }

    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return recursion(0, k, nums);
    }
}s