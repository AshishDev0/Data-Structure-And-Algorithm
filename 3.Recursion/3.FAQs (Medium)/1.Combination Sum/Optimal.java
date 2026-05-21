class Solution {
    private void recursion(int idx, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || idx == candidates.length) {
            return;
        }

        current.add(candidates[idx]);

        recursion(idx, candidates, target - candidates[idx], current, ans);

        current.remove(current.size() - 1);

        recursion(idx + 1, candidates, target, current, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //your code goes here

        List<List<Integer>> ans = new ArrayList<>();

        recursion(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }
}