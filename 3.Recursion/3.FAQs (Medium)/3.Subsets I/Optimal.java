class Solution {
    private void recursion(int idx, int sum, List<Integer> ans, int[] nums) {
        if (idx == nums.length) {
            ans.add(sum);
            return;
        }

        recursion(idx + 1, sum + nums[idx], ans, nums);

        recursion(idx + 1, sum, ans, nums);
    }

    public List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        recursion(0, 0, ans, nums);

        return ans;
    }
}