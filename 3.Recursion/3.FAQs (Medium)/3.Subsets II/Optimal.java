class Solution {
    private void recursion(int idx, List<Integer> current, int[] nums, List<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[idx]);
        recursion(idx + 1, current, nums, ans);
        current.remove(current.size() - 1);

        for (int i = idx + 1; i < nums.length; i++) {
            if (nums[i] != nums[idx]) {
                recursion(i, current, nums, ans);
                return;
            }
        }

        recursion(nums.length, current, nums, ans);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        recursion(0, new ArrayList<>(), nums, ans);

        return ans;
    }
}