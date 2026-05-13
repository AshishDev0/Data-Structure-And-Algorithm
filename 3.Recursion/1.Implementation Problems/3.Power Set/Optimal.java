class Solution {
    private void recurr(int idx, List<Integer> current, List<List<Integer>> ans, int[] nums) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[idx]);

        recurr(idx + 1, current, ans, nums);

        current.remove(current.size() - 1);

        recurr(idx + 1, current, ans, nums);
    }

    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        recurr(0, current, ans, nums);

        return ans;
    }
}