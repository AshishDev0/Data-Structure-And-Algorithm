class Solution {
    private boolean recursion(int idx, int k, int[] nums) {
        if (k == 0) {
            return true;
        }

        if (k < 0 || idx == nums.length) {
            return false;
        }

        return recursion(idx + 1, k - nums[idx], nums)
                || recursion(idx + 1, k, nums);
    }

    public boolean checkSubsequenceSum(int[] nums, int k) {
        return recursion(0, k, nums);
    }
}