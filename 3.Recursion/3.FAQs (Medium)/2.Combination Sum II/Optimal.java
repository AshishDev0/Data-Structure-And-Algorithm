class Solution {
    private void recursion(int idx, List<Integer> current, int target, int[] candidates, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (idx == candidates.length || target < 0) {
            return;
        }

        current.add(candidates[idx]);
        recursion(idx + 1, current, target - candidates[idx], candidates, ans);
        current.remove(current.size() - 1);

        for (int i = idx + 1; i < candidates.length; i++) {
            if (candidates[i] != candidates[idx]) {
                recursion(i, current, target, candidates, ans);
                break;
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        recursion(0, new ArrayList<>(), target, candidates, ans);

        return ans;
    }
}